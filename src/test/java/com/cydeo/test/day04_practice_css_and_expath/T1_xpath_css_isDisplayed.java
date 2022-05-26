package com.cydeo.test.day04_practice_css_and_expath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("ch");
//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
        WebElement homeLink=driver.findElement(By.cssSelector("a.nav-link"));
//        b. “Forgot password” header c. “E-mail” text
        WebElement forgotPasswordHeader=driver.findElement(By.cssSelector("div.example>h2"));
//        d. E-mail input box
        WebElement inputBox=driver.findElement(By.cssSelector("input[type='text']"));
//        e. “Retrieve password” button f. “Powered by Cydeo text
        WebElement retrivePasswordBtn=driver.findElement(By.cssSelector("button#form_submit"));
        WebElement feautureExtra=driver.findElement(By.cssSelector("div [style=\"text-align: center;\"]"));
//        4. Verify all web elements are displayed.
        System.out.println(homeLink.isDisplayed() ? "Homelink  is displayed" : "No home Link Displayid");
        System.out.println(forgotPasswordHeader.isDisplayed()?"The Header is displayed ":"No Header displayed");
        System.out.println(inputBox.isDisplayed()?"Input box is displayed":"No Input box is displayed");
        System.out.println(retrivePasswordBtn.isDisplayed()?"Retrive password btn is displayed":"No Retrive password btn is displayed");
        System.out.println(feautureExtra.isDisplayed()?"Extra Feature is displayed":"No Extra Feature is displayed");

        driver.close();
    }
}
