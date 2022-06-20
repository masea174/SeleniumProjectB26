package com.cydeo.test.day03_css_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtributeAndCSS {
    public static void main(String[] args) {


//    TC #3: NextBaseCRM, locators, getText(), getAttribute() practice 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");




//2- Go to: https://login1.nextbasecrm.com/
//            3- Verify “
//    Log in” button text is as expected:
//    Expected: Log In
        WebElement logingBtn= driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        logingBtn.sendKeys(""+ Keys.ENTER);
       String valueOfBtn= logingBtn.getAttribute("value");
        System.out.println(valueOfBtn.equals("Log In") ? "The Login button verification Passed" : "The Login button verification Failed");

        driver.close();


    }}

