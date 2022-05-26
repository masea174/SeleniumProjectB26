package com.cydeo.test.day02_locators.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1_Chrome {
    /*
    TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
     */
    public static void main(String[] args) {
        //1. set up the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to url
        driver.get("https://google.com");
        //3 click to gmail from top corner;

        driver.findElement(By.ByLinkText.linkText("Gmail")).click();

        //4 verifyy  the title
        System.out.println(driver.getTitle().contains("Gmail")?"Title verification passed!":"Title verification failed!");
        //5 return to google page

        driver.navigate().back();

        //6 verify title
        System.out.println(driver.getTitle().contains("Google")?"Title verification passed!":"Title verification failed!");
        //7 close browser

        driver.quit();

    }
}
