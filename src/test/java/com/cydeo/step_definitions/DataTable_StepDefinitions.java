package com.cydeo.step_definitions;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String>fruits){

        System.out.println(fruits);


    }
}
