package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // Create a private constructor to close access to the object of this class from outside the class
    private Driver() {}

    // WebDriver is private to close access from outside the class and static to be used in a static method.
    private static WebDriver driver;

    // Create a reusable utility method that returns the same driver instance when called
    public static WebDriver getDriver() {

        // Value is null by default
        if (driver == null) {

            /* Browser type is determined from configuration.properties.
               It controls which browser is opened from outside the code. */
            String browserType = ConfigurationReader.getProperty("browser");

                // Switch statement
            switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                }
            }

            return driver;
        }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit(); // Terminates the existing session.
                driver = null;
            }
        }
    }

