package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    /*
    TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
     */
    public static void main(String[] args) {
        //1 set up the browser object
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2 navigate to google page

        driver.get("https://google.com");

        //3 find the input cell//4 find the enter button
        driver.findElement(By.tagName("input")).sendKeys("apple"+ Keys.ENTER);


        //5 check the title of the page

        System.out.println(driver.getTitle().startsWith("apple")?"The google got your search":"You messed up");

        driver.close();


    }
}
