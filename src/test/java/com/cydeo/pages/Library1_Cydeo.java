package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library1_Cydeo {
    public Library1_Cydeo(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="inputEmail")
    public WebElement emailInput;

    @FindBy (id="inputPassword")
    public WebElement passwordInput;

    @FindBy (tagName = "button")
    public WebElement buttonSignIn;

    @FindBy(id="inputEmail-error")
    public WebElement errorMessage;

    @FindBy (xpath = "//div[@class='alert alert-danger']")
    public WebElement wrongInput;
}
