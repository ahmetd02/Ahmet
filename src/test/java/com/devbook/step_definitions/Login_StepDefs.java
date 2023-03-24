package com.devbook.step_definitions;

import com.devbook.pages.DashboardPage;
import com.devbook.pages.LoginPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.ConfigurationReader;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage= new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        loginPage.loginAsTeacher_mtd();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(2);
        String actualMessage= dashboardPage.welcomeMessage_loc.getText();
        Assert.assertTrue(actualMessage.contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
        loginPage.loginAsStudent_mtd();

    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        loginPage.loginAsDeveloper_mtd();
    }
    @When("The user enters SDET credentials")
    public void the_user_enters_sdet_credentials() {
        loginPage.loginAsStudent_mtd();
    }

    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login_mtd(username,password);

    }

    @And("The welcome message contains {string}")
    public void theWelcomeMessageContains(String user) {
        //BrowserUtils.waitFor(2);
        BrowserUtils.waitForVisibility(dashboardPage.welcomeMessage_loc,3);
        String actualMessage = dashboardPage.welcomeMessage_loc.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.contains(user));
    }
    @Then("The warning message contains {string}")
    public void the_warning_message_contains(String expectedMessage) {
        BrowserUtils.waitForPageToLoad(3);
        loginPage.getDisappearWarningMessage(expectedMessage);
        Assert.assertEquals(expectedMessage,loginPage.getDisappearWarningMessage(expectedMessage));
//String actualMessage=loginPage.userEmailInput_loc.getAttribute("validationMessage");
//        System.out.println("actualMessage = " + actualMessage);
//        Assert.assertEquals(expectedMessage,actualMessage);
    }
}