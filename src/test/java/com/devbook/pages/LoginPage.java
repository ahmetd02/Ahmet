package com.devbook.pages;

import com.devbook.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage {
//    public LoginPage(){
//        PageFactory.initElements(Driver.get(),this);
//    }
    @FindBy (id="loginpage-input-email")
    public WebElement userEmailInput_loc;
    @FindBy (id="loginpage-form-pw-input")
    public WebElement passwordInput_loc;
//    @FindBy (id="rcc-confirm-button")
//    public WebElement understandBtn_loc;
    @FindBy(id="loginpage-form-btn")
    public WebElement loginBtn_loc;
    @FindBy(xpath = "//*[.='Invalid Credentials!']")
    public WebElement warningMessage_loc;
    @FindBy(xpath = "//*[.='Please include a valid email!']")
    public WebElement passworWarningMessage_loc;

    //from Demoqa website
    @FindBy(css = ".menu-list")
    public List<WebElement> menuList;

    //İkisinden biri doğru ise bu locatoru bulacaktır---> or  //true or false
    @FindAll({
            @FindBy(id="loginpage-input-email"),
            @FindBy(name="email")
    })
    public WebElement userInputSecondaryWay_loc;

    //ikisinin de doğru olması halinde çalışır --> And  //true and true
    @FindBys({
            @FindBy(tagName="p"),
            @FindBy(css=".lead")
    })
public WebElement singAccountTex_loc;

    public void login_mtd(String userEmail, String password){
        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        understandBtn_loc.click();
        loginBtn_loc.click();
    }
    public void login_mtd(){
        understandBtn_loc.click();
        loginBtn_loc.click();
    }
    public void loginAsTeacher_mtd(){
        String userEmail=ConfigurationReader.get("usernameTeacher");
        String password=ConfigurationReader.get("passwordTeacher");
        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        understandBtn_loc.click();
        loginBtn_loc.click();
    }
    public void loginAsStudent_mtd(){
        String userEmail=ConfigurationReader.get("usernameStudent");
        String password=ConfigurationReader.get("passwordStudent");
        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        understandBtn_loc.click();
        loginBtn_loc.click();
    }
    public void loginAsDeveloper_mtd(){
        String userEmail=ConfigurationReader.get("usernameDeveloper");
        String password=ConfigurationReader.get("passwordDeveloper");
        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        understandBtn_loc.click();
        loginBtn_loc.click();
    }
    public String getDisappearWarningMessage(String message){
        String actualMessage=null;
        if (message.contains("@")){
            actualMessage=userEmailInput_loc.getAttribute("validationMessage");
        }else if (message.contains("valid")){
            actualMessage=warningMessage_loc.getText();
        }
       return actualMessage;
    }

}
