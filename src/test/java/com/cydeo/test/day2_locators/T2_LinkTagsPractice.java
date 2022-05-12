package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTagsPractice {
    /*
     Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
     */
    //1 set up my driver
    public static void main(String[] args) {


    WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2 go to the url
        driver.get("https://practice.cydeo.com");

        //3 find the web element //click it

        driver.findElement(By.linkText("A/B Testing")).click();

        //4 . make sure you are on the right page

        System.out.println(driver.getTitle().equals("No A/B Test") ? "The page is correct" : "Wrong page");

        //5 go back to main page

        driver.navigate().back();

        //6 check for title

        System.out.println(driver.getTitle().equals("Practice")?"The title is correct":"Main page fail to return");

        //7 close the browser

        driver.quit();



    }}
