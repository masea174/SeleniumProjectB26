package com.cydeo.test.day11_web_tables_and_browser_utility.ExtraPractice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC01SmartBear extends TestBase {

    @Test
    public static void linkVerification() {


//    TC #1: Smartbear software link verification
//1. Open browser
//2. Go to website:
//    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//            3. Enter username: “Tester”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
//            4. Enter password: “test”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
//            5. Click to Login button
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
//6. Print out count of all the links on landing page
        List<WebElement> elements = driver.findElements(By.tagName("a"));
//7. Print out each link text on this page
                for(WebElement each:elements){
            System.out.println(each.getText());
        }
//
//    Mini-Task: CREATE A CLASS à SmartBearUtils
//• Create a method called loginToSmartBear
//• This method simply logs in to SmartBear when you call it.
//• Accepts WebDriver type as parameter
                ;
    }
}