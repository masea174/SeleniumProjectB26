package com.cydeo.test.day3_css_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMProject {
    /*
    TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
     */
    public static void main(String[] args) {
      //1. create our veb driver manager

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2 go to page

        driver.get("https://login1.nextbasecrm.com/");

        //3 find the web element for input
        WebElement login= driver.findElement(By.className("login-inp"));
        login.click();
        login.sendKeys("invalid");

        //4 find the web element for password area

        WebElement password =driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");
        //5 Find and click the login button

        WebElement loginBtn=driver.findElement(By.className("login-btn"));
        loginBtn.click();

        //verify the error message

        String  expectedText="Incorrect login or password";
        String  acctualText=driver.findElement(By.className("errortext")).getText();

        System.out.println(acctualText.equals(expectedText) ? "Error message verification Passed!" : "Error message verification Failed!");

        //closing the driver
        driver.close();

    }
}
