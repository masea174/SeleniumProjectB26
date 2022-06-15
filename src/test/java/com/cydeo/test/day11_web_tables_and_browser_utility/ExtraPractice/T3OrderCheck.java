package com.cydeo.test.day11_web_tables_and_browser_utility.ExtraPractice;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartbearLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3OrderCheck extends TestBase {

    @Test
    public static void orderCheck(){
//        TC#3: Smartbear software order verification

//        1. Open browser and login to Smartbear software
        SmartbearLogin.login(driver);
//        2. Click on View all orders
        WebElement allOrdersBtn = driver.findElement(By.xpath("//a[.='View all orders']"));
//        3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susanMcLarenOrderDate=driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::*[3]"));
        Assert.assertEquals(susanMcLarenOrderDate.getText(),"01/05/2010");


    }
}
