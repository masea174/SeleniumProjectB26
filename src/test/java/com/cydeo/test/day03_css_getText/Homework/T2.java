package com.cydeo.test.day03_css_getText.Homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2 {
    public static void main(String[] args) {
//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("ch");

//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
//        3- Enter incorrect username into login box:
        WebElement loginBox=driver.findElement(By.cssSelector("input[name=\"USER_LOGIN\"]"));
        loginBox.sendKeys("incorrect");
//        4- Click to `Reset password` button
        WebElement resetBtn= driver.findElement(By.cssSelector("button.login-btn"));
        resetBtn.click();
//        5- Verify “error” label is as expected
//        Expected: Login or E-mail not found
        System.out.println(driver.findElement(By.cssSelector("div.errortext")).getText().equals("Login or E-mail not found") ? "Error laber verification Passed!" : "Error laber verification Failed!");

        driver.close();

//
//
//
//
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//                PS2: Pay attention to where to get the text of this button from
    }
}
