package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    // Create constructor
    // Initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locate web elements by using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;

}
