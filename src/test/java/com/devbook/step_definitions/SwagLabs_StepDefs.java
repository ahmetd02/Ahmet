package com.devbook.step_definitions;

import com.devbook.pages.SwagLabsLoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabs_StepDefs {
    SwagLabsLoginPages swagLabsLoginPages=new SwagLabsLoginPages();
    @Given("The user navigates to SwagLabs login page")
    public void the_user_navigates_to_swag_labs_login_page() {
swagLabsLoginPages.swagLabsLoginPage();
    }
    @When("The user enters {string} and {string} credentials")
    public void the_user_enters_and_credentials(String username, String password) {
swagLabsLoginPages.login_swagLabs(username,password);
    }
    @Then("The user should be able to login swaglabs web site")
    public void the_user_should_be_able_to_login_swaglabs_web_site() {
swagLabsLoginPages.isDisplayedMethodSwag();
    }
}
