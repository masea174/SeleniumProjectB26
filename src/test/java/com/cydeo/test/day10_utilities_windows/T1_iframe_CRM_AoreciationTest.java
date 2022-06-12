package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_iframe_CRM_AoreciationTest extends TestBase {
    @Test
    public void sendingApreciationMessage(){
      //  2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
//        3- Login Homepage ( Login with valid username and
//                password)
        WebElement userNameInput=driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userNameInput.sendKeys("hr19@cybertekschool.com");

        WebElement passwordInput=driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        passwordInput.sendKeys("UserUser");

        WebElement loginBtn=driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
//        4- Click the MORE tab and select APPRECIATION
            WebElement moreDropdown = driver.findElement(By.xpath("(//span[.='More'])[1]"));
            moreDropdown.click();
            WebElement apreciationTab = driver.findElement(By.xpath("(//span[.='Appreciation'])[1]"));
            apreciationTab.click();
//        5- Write an Appreciation message
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.bx-editor-iframe")));
            WebElement inputApreciation = driver.findElement(By.cssSelector("body[contenteditable=\"true\"]"));
            inputApreciation.sendKeys("Hello ,Thank you very Much ");
            driver.switchTo().defaultContent();
//        6- Click the SEND button
            WebElement submitBtn = driver.findElement(By.cssSelector("button[id='blog-submit-button-save']"));
            submitBtn.click();

//        7- Verify the Appreciation message is displayed on
//        the feed
        WebElement messageSpace=driver.findElement(By.xpath("//div[contains(@id,'blg-post')]"));
            Assert.assertTrue(messageSpace.isDisplayed());

    }
}
