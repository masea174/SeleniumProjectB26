package com.cydeo.test.day06_staleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkT2 {
//    TC #6: StaleElementReferenceException Task
public static void main(String[] args) {


//1. Open a chrome browser
    WebDriver driver= WebDriverFactory.getDriver("Ch");

//2. Go to: https://practice.cydeo.com/abtest
driver.get("https://practice.cydeo.com/abtest");

//            3. Locate “CYDEO” link, verify it is displayed.
    WebElement cydeoLink=driver.findElement(By.xpath("//a[@target='_blank']"));
    System.out.println(cydeoLink.isDisplayed()?"the Link is displayed":"Not display the cydeo link");
//            4. Refresh the page.
driver.navigate().refresh();
//5. Verify it is displayed, again.
    try{
    System.out.println(cydeoLink.isDisplayed()?"the Link is displayed":"Not display the cydeo link");}
    catch (StaleElementReferenceException e){
        System.out.println("the exception happen");
    }
    driver.quit();
}}
