package com.cydeo.test.day05_find_elements_radio_Button;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4RadioButton {
    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("ch");

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
//        3. Click to “Hockey” radio button
        WebElement hockeyButton=driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
//        4. Verify “Hockey” radio button is selected after clicking.
        System.out.println(hockeyButton.isSelected() ? "The Hockey Button is selected" : "The Hockey Button is not selected");


        //locate green btn
        WebElement greenButton=driver.findElement(By.xpath("//input[@id='green']"));
        System.out.println(greenButton.isEnabled() ? "Green Btn Enabled" : "Green Button Disabled!");
        driver.quit();
    }
}
