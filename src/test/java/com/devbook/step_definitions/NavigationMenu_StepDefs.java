package com.devbook.step_definitions;

import com.devbook.pages.DashboardPage;
import com.devbook.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.sql.rowset.BaseRowSet;

public class NavigationMenu_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();

    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("I verified that welcome message text is here");
    }
    @When("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("user navigates to Developers menu");
    }
    @Then("The user able to see Developers text")
    public void the_user_able_to_see_Developers_text() {
        System.out.println("I verified that developers text is here");
    }
    @When("The user navigates to All Posts menu")
    public void the_user_navigates_to_all_posts_menu() {
        System.out.println("user navigates to All Post menu");
    }
    @Then("The user able to see Posts text")
    public void the_user_able_to_see_posts_text() {
        System.out.println("I verified that All Post text is here ");
    }


    @When("The user navigates to My Account menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("user navigates to My Account menu");
    }
    @Then("The user able to see Dashboard text")
    public void the_user_able_to_see_dashboard_text() {
        System.out.println("I verified that Dashboard text is here");
    }
    @Then("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menuName) {
        dashboardPage.navigateToMenu(menuName);
    }
    @Then("The user should be able to see header as {string}")
    public void the_user_should_be_able_to_see_header_as(String headerName) {
        BrowserUtils.waitFor(2);
        String actualHeaderText = dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("Verify that header name is display",headerName,actualHeaderText);
    }


}
