package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {

        System.out.println("User is on the library login page");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {

        System.out.println("User enters librarian username");
    }

    @And("user enters librarian password")
    public void user_enters_librarian_password() {

        System.out.println("User enters librarian password");
    }

    @When("user enters student username")
    public void userEnterStudentUsername() {

        System.out.println("User enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {

        System.out.println("User enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {

        System.out.println("User enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {

        System.out.println("User enters admin password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        System.out.println("User should see the dashboard");
    }
}
