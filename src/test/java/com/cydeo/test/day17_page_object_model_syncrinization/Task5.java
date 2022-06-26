package com.cydeo.test.day17_page_object_model_syncrinization;

import com.cydeo.pages.DynamicallyLoadedPage1;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task5 {
    @Test
    public void explicitWait(){
//        1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

//        2. Click to start
        DynamicallyLoadedPage1 dynamicallyLoadedPage1=new DynamicallyLoadedPage1();
        dynamicallyLoadedPage1.startBtn.click();
//        3. Wait until loading bar disappears
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.loadingBar));
//        4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicallyLoadedPage1.usernameInput.isDisplayed());
//        5. Enter username: tomsmith
        dynamicallyLoadedPage1.usernameInput.sendKeys("tomsmith");
//        6. Enter password: incorrectpassword
        dynamicallyLoadedPage1.passwordInput.sendKeys("incorrectpassword");
//        7. Click to Submit button
        dynamicallyLoadedPage1.submitBtn.click();
//        8. Assert “Your password is invalid!” text is displayed.

       Assert.assertTrue( dynamicallyLoadedPage1.errorMessage.isDisplayed());

        Assert.assertTrue(dynamicallyLoadedPage1.errorMessage.getText().contains("Your password is invalid!"));
//                Note: Follow POM Design Pattern
        Driver.closeDriver();
    }
}
