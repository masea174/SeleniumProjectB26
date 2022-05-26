package com.cydeo.ofice_hours.day2;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ByID {

    //    By.id
//
//	1- Open a chrome browser
//
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("ch");

//2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");
//        3- Click to Multiple Buttons
        driver.findElement(By.linkText("Multiple Buttons")).click();
//	4- Click "Don't Click" button
        driver.findElement(By.id("disappearing_button")).click();

        Thread.sleep(3000);
//	5- Verify Result is : ""Now it's gone""
        WebElement result=driver.findElement(By.id("result"));

        String actualResult=result.getText();
        System.out.println(actualResult.equals("Now it's gone!") ? "The message verification Passed!" : "The message Verification Failed!"+actualResult);

        driver.close();
    }
}