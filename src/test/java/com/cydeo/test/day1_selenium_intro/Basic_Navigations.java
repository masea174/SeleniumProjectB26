package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {
        // 1. setting up web driver manager

        WebDriverManager.chromedriver().setup();

        //2.create instance of web driver

        WebDriver driver=new ChromeDriver();
Thread.sleep(3000);
        //maximaze the page we will miss information if we dont have it big
        driver.manage().window().maximize();

        //3 naviget to the page
//        driver.get("https://www.etsy.com");
        //4 navigations

        driver.navigate().to("https://www.etsy.com");
        //Its ussing to stop navigation ,we are giving time the application to see the steps
        Thread.sleep(3000);
        //navigate to is navigating to url
        //navigate back is navigating back to url
        driver.navigate().back();
        Thread.sleep(3000);
        //Navigate forward
        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.get("https://www.tesla.com");
        Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());

        //close current opened page

        driver.close();

        //it will quit all pages //tabs

        driver.quit();


    }
}
