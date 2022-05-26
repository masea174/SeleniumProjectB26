package com.cydeo.test.day03_css_getText.Homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1 {
    public static void main(String[] args) {
//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Ch");

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        //finding the remember me web element
        WebElement remember=driver.findElement(By.cssSelector("label.login-item-checkbox-label"));
        System.out.println(remember.getText().equals("Remember me on this computer") ? "Remember me verification Passed!" : "Remember me verification Failed!");
//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
        WebElement forgotPasswordLink=driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
        System.out.println(forgotPasswordLink.getText().equals("FORGOT YOUR PASSWORD?") ? "Forgot password link Verification Passed!" : "Forgot password link verification Failed!");
//                5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes:
        System.out.println(forgotPasswordLink.getAttribute("href").contains("forgot_password=yes") ? "Forgot password href verification Passed!" : "Forgot password href verification failed");
//
//
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
        driver.close();
    }
}
