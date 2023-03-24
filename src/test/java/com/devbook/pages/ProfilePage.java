package com.devbook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    @FindBy(name="githubusername")
    public WebElement userName_loc;
    @FindBy(linkText="Go Back")
    public WebElement goBack_loc;
}
