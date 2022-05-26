package com.cydeo.test.day04_practice_css_and_expath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Xpath_practice {
    public static void main(String[] args) {

//        XPATH Practice
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #2:  XPATH LOCATOR practice
//        1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("ch");

//        2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
//        3. Click on Button 1
        WebElement buttonOne=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        buttonOne.click();
//        4. Verify text displayed is as expected:
//        Expected: “Clicked on button one!”
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(message.getText().equals("Clicked on button one!") ? "Displayed text Verification Passed" : "Displayed text Verification Failed"+message.getText());
        driver.close();
//
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }
}
