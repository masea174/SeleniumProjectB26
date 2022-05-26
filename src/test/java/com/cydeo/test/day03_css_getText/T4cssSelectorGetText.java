package com.cydeo.test.day03_css_getText;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4cssSelectorGetText {
    public static void main(String[] args) {


//    TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("ch");
//2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
// 3- Verify “Reset password” button text is as expected:
//    Expected: Reset password
        WebElement button=driver.findElement(By.cssSelector("button.login-btn"));
        System.out.println(button.getAttribute("value").equals("Reset password") ? "The Reset password button verification Passed!" : "The Reset password button verification Failed!");

        //4.close the browser
        driver.close();

    }}
