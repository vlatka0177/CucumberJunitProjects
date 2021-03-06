package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /* Passes pre-conditions and post-conditions for each scenario and step.

    Import from io.cucumber.java, and not from org.junit */
    @Before(order = 1)
    public void SetupScenario() {

        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value = "@login", order = 2)
    public void SetupScenarioForLogins() {

        System.out.println("====Applies only to scenarios with @login tag");
    }

    @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios() {

        System.out.println("====Applies only to scenarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {

        // scenario.isFailed() --> If scenario fails, this method will return TRUE boolean value
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtilities.sleep(5);
        Driver.closeDriver();

        /* System.out.println("====Closing browser using cucumber @After");
           System.out.println("====Scenario ended/Take screenshot if failed"); */
    }

    @BeforeStep
    public void setupStep() {

        System.out.println("--------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() {

        System.out.println("--------> applying tearDown using @AfterStep");
    }
}
