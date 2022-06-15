package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartbearLogin {


    public static  void login(WebDriver driver){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//            3. Enter username: “Tester”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
//            4. Enter password: “test”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
//            5. Click to Login button
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
    }
}
