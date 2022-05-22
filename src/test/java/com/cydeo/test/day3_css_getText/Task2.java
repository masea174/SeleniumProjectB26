package com.cydeo.test.day3_css_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    C #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2 navigate to page
        driver.get("https://practice.cydeo.com/registration_form");

        //3 find the heather
        WebElement header= driver.findElement(By.tagName("h2"));
        System.out.println(header.getText().equals("Registration form") ? "The header verification passed" : "The header verification passed");
        //4 locate first name

        WebElement inputBox=driver.findElement(By.name("firstname"));
        System.out.println(inputBox.getAttribute("placeholder").equals("first name") ? "Placeholder attribute verification Passed!" : "Placeholder attribute verification Failed!");

        //5 close the browser
        driver.close();

    }


}