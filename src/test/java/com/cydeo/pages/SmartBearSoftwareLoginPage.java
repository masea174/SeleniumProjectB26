package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearSoftwareLoginPage {
    public SmartBearSoftwareLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id="ctl00_MainContent_status")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement loginInput;

@FindBy (xpath = "//input[@id='ctl00_MainContent_password']")
public WebElement passwordInput;

@FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement submitBtn;
}
