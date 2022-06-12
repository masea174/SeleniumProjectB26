package com.cydeo.test.day11_web_tables_and_browser_utility;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2MultiTables extends TestBase {

    @Test
    public static void webTAblePractice(){
//        C #1: Web table practice
//        1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
//        2. Verify Bob’s name is listed as expected.
        String nameCell = driver.findElement(By.xpath("(//tbody)[2]/tr[7]/td[2]")).getText();
        Assert.assertEquals(nameCell,"Bob Martin");
//        Expected: “Bob Martin”
//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021
        Assert.assertEquals(driver.findElement(By.xpath("(//tbody)[2]/tr[7]/td[5]")).getText(),"12/31/2021");
        System.out.println(returnOrderDate(driver, "Bob Martin"));
    }
    public static String returnOrderDate(WebDriver driver,String costumerName){


        String webAddress="//table/tbody/tr/td[.='"+costumerName+"']";
        String dateAddress="//table/tbody/tr/td[.='"+costumerName+"']/following-sibling::*[3]";
        WebElement custumerLine=driver.findElement(By.xpath(webAddress));
        WebElement custumerOrderDate=driver.findElement(By.xpath(dateAddress));



      return custumerOrderDate.getText();
    }
}
