package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void login_crm(WebDriver driver) {
//        TC : Create utility methods for CRM_Utilities class
//        1. Create a new method for login
//        2. Create a method to make CRM Login test logic re-usable
//        3. When method is called, it should simply login
//
//        This method should have at least 2 overloaded versions.

//        Method #1 info:
//• Name: login_crm()
//• Return type: void
//• Arg1:
//        WebDriver
        driver.get("https://login2.nextbasecrm.com/");

//        3- Login Homepage ( Login with valid username:helpdesk1@cybertekschool.com and password:UserUser)
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk1@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }
 public static void login_crm(WebDriver driver,String username,String password){

//        Method #2 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String username
//• Arg3: String password
     driver.get("https://login2.nextbasecrm.com/");

//        3- Login Homepage ( Login with valid username:helpdesk1@cybertekschool.com and password:UserUser)
     WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
     usernameInput.sendKeys(username);

     WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
     passwordInput.sendKeys(password);

     WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
     loginBtn.click();

    }
}
