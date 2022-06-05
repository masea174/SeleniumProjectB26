package com.cydeo.test.day04_practice_css_and_expath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkT3 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("ch");

      driver.get("http://practice.cydeo.com/forgot_password");
    WebElement emailbox = driver.findElement(By.cssSelector("input[type='text']"));
        emailbox.sendKeys("davidlkmw@yahoo.com");
    WebElement retrP = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        retrP.click();
    String expURL = "email_sent";
    String actURL = driver.getCurrentUrl();
        if(actURL.contains(expURL)){
        System.out.println("Correct URL");
    }else {
        System.out.println("Incorrect URL");
    }
    WebElement texbox = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
    String acttexbox = "Your e-mail's been sent!";
        if(texbox.getText().equals(acttexbox)){
        System.out.println("Text box Verification Passed!");
    }else{
        System.out.println("Text box did NOT displayed" + texbox.getText());
    }

driver.quit();

}}

