package com.cydeo.test.day08_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AlertPractices {

//    TC #2: Confirmation alert practice
//1. Open browser

    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    void confirmationAlertPractice() {
//2. Go to website: http://practice.cydeo.com/javascript_alerts


//            3. Click to “Click for JS Confirm” button
        WebElement alertButton=driver.findElement(By.xpath("//button[contains(.,'Confirm')]"));
        alertButton.click();
        Alert alert =driver.switchTo().alert();
        alert.accept();

//4. Click to OK button from the alert
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
//5. Verify “You clicked: Ok” text is displayed.
        String actualMessage=message.getText();
        String expectedMesage="You clicked: Ok";
        assertEquals(actualMessage,expectedMesage);

    }
    @Test
    void informationAlertPractice(){
//        TC #3: Information alert practice
//        1. Open browser
//        2. Go to website: http://practice.cydeo.com/javascript_alerts
//        3. Click to “Click for JS Prompt” button
        WebElement jsPrompt=driver.findElement(By.xpath("//button[contains(.,'Prompt')]"));
        jsPrompt.click();
//        4. Send “hello” text to alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");
//        5. Click to OK button from the alert
        alert.accept();
//        6. Verify “You entered:  hello” text is displayed.
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
//5. Verify “You clicked: Ok” text is displayed.
        String actualMessage=message.getText();
        String expectedMesage="You entered: hello";
        assertEquals(actualMessage,expectedMesage);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
