package com.devbook.pages;

import com.devbook.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id ="rcc-confirm-button" )
    public WebElement understandBtn_loc;
    @FindBy(css = ".nav__menu-item") // => //li[@class='nav__menu-item']
    public List<WebElement> menuList_loc;
    @FindBy(xpath = "//a[text()='All Posts']")
    public WebElement allPost_loc;
    @FindBy(xpath = "//a[text()='Developers']")
    public WebElement developers_loc;

    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }
    public String getHeaderText(String headerName){
        return Driver.get().findElement(By.xpath("//section[@class='container']/*[text()='"+headerName+"']")).getText();
    }
    public void navigateToSubMenu(String subMenu){
        Driver.get().findElement(By.xpath("//span[text()='"+subMenu+"']")).click();
    }
    public String getTextCommon(String element ){
        return Driver.get().findElement(By.xpath("//td[text()='"+element+"']")).getText();
    }

}