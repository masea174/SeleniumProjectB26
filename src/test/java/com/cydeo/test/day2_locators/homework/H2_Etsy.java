package com.cydeo.test.day2_locators.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2_Etsy {
    /*
    TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
     */
    public static void main(String[] args) {
        //1 set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to url
        driver.get("https://www.etsy.com");

        //3 search for wooden spoon

        driver.findElement(By.tagName("input")).sendKeys("wooden spoon"+ Keys.ENTER);

        //4verify title

        System.out.println(driver.getTitle().equals("Wooden spoon | Etsy") ? "The title verification passed!" : "The title verification failed");

        //5 close the driver
        driver.quit();

    }}
