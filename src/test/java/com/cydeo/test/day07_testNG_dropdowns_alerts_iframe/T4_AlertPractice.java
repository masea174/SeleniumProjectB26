package com.cydeo.test.day07_testNG_dropdowns_alerts_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    //    TC #1: Information alert practice
//1. Open browser
    @Test
    public void informationAlertTest() {


//2. Go to website: http://practice.cydeo.com/javascript_alerts
//            3. Click to “Click for JS Alert” button
        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[contains(.,'Alert')]"));
        jsAlertBtn.click();

        //4. Click to OK button from the alert

        Alert alert=driver.switchTo().alert();
        alert.accept();
//5. Verify “You successfully clicked an alert” text is displayed.

        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage=message.getText();
        String expectedMessage="You successfully clicked an alert";
        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(actualMessage,expectedMessage);


        driver.quit();

    }
}