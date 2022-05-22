package com.cydeo.ofice_hours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    /*
    Open a chrome browser
	2- Go to: https://practice.cydeo.com/
	3- Click to Multiple Buttons   (by using linkText locator)
	4- Verify title equals:
	   Expected: Multiple Buttons
	5- Go back to home page by using the .back();
	6- Verify title equals:
	   Expected: Practice



     */
    public static void main(String[] args) {

        //1.creatimg my driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.navigate to url
        driver.get("https://practice.cydeo.com/");
        //3.find webelemeny & click it
        driver.findElement(By.ByLinkText.linkText("Multiple Buttons")).click();

        //4.check the name of the page

        String expectedTitle="Multiple Buttons";
        String acctualTitle=driver.getTitle();
        if(acctualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed!");
        }else {
            System.out.println("Title Verification Failed!");
        }
        //5.navigate back
        driver.navigate().back();
        //6 veryfi my title page is the correct one

        expectedTitle="Practice";
        acctualTitle=driver.getTitle();

        if (acctualTitle.equals(expectedTitle)){
            System.out.println("Title Verification for main page Passed!");
        }else {
            System.out.println("Title Verification for main page Failed!");
        }

        //7. close the driver

        driver.close();
    }
}
