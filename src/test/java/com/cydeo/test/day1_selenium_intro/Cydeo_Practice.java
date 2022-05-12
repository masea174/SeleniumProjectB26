package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo_Practice {
    /*
    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com/
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        String titleCurrent=driver.getTitle();
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="cydeo";
        System.out.println(actualUrl.contains(expectedUrl)?"Url verification pass":"Url verification failed");

        System.out.println(titleCurrent.equals("Practice")?"Title verification pass":"Title verification failed");

        driver.close();

    }
}
