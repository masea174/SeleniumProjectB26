package com.cydeo.test.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {
    public static void main(String[] args) {
        //Open the Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //2 Go to facebook page
        driver.get("https://facebook.com");

        //3 Verify title
        String expectedTitle="Facebook - log in or sign up";
        String actualTitle=driver.getTitle();


        System.out.println(actualTitle.equals(expectedTitle)?"Facebook title verification passed!":"Facebook title verification failed!");

        //4 close the browser
        driver.quit();
    }
}
