package com.cydeo.test.day02_locators.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H3_Cydeo {
    /*
    TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice

PS: Locate “Home” link using “className” locator

     */
    public static void main(String[] args) {
        //1 set up the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2 go to the url
        driver.get("https://practice.cydeo.com/inputs");

        //3 click the home boton

        driver.findElement(By.linkText("Home")).click();

        //4 verify the title

        System.out.println(driver.getTitle().equals("Practice") ? "The title verification passed!" : "The title verification failed!");
        //5 close browser
        driver.close();
    }
}
