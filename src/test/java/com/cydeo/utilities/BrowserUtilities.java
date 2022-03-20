package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtilities {

    // This method accepts int (in seconds) and executes Thread.sleep for the given duration.
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e) {
        }
    }

    /* This method accepts 3 arguments.
       Argument 1: WebDriver
       Argument 2: expectedInUrl
                        - verify if the URL contains a given String
                        - a matching condition will break the loop
       Argument 3: expectedInTitle is compared against actualTitle  */

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        // Assert that title contains “expectedInTitle”
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    // This method accepts a String "expectedTitle" and asserts if it is true
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }
}
