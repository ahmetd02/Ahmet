package com.devbook.pages;

import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.ConfigurationReader;
import com.devbook.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPages {
    public SwagLabsLoginPages() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="user-name")
    public WebElement swag_UserName;
    @FindBy(id="password")
    public WebElement swag_Password;
    @FindBy(id="login-button")
    public WebElement swag_SubmitBtn;
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productPage;

    public void swagLabsLoginPage(){
        Driver.get().get(ConfigurationReader.get("urlswag"));
    }

    public void login_swagLabs(String username, String password){
        swag_UserName.sendKeys(username);
        swag_Password.sendKeys(password);
        swag_SubmitBtn.click();
    }
    public void isDisplayedMethodSwag(){
        BrowserUtils.waitForPageToLoad(5);
        //Assert.assertTrue(productPage.isDisplayed());
        Assert.assertEquals("Products",productPage.getText());
    }
}
