package com.devbook.step_definitions;

import com.devbook.pages.DashboardPage;
import com.devbook.pages.LoginPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardMenu_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList_loc);
        Assert.assertEquals(expectedList,actualList);
    }
    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        loginPage.login_mtd(userCredentials.get("userEmail"),userCredentials.get("password"));
        BrowserUtils.waitForVisibility(dashboardPage.welcomeMessage_loc,5);
        Assert.assertTrue(dashboardPage.welcomeMessage_loc.getText().contains(userCredentials.get("message")));

    }
}
