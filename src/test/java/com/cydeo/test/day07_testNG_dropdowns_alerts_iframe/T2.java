package com.cydeo.test.day07_testNG_dropdowns_alerts_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2 {
    //    TC #2: Selecting state from State dropdown and verifying
//            result
//1. Open Chrome browser
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    void selectStates() {


//2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
//            3. Select Illinois
        Select stateDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
         stateDropDown.selectByIndex(14);
         stateDropDown.selectByVisibleText("Illinois");
         stateDropDown.selectByValue("IL");
        System.out.println(stateDropDown.getFirstSelectedOption().getText());




//4. Select Virginia
        stateDropDown.selectByIndex(47);
      //  stateDropDown.selectByVisibleText("Virginia");
       // stateDropDown.selectByValue("VA");
        System.out.println(stateDropDown.getFirstSelectedOption().getText());
//5. Select California
        stateDropDown.selectByIndex(5);
       // stateDropDown.selectByVisibleText("California");
       // stateDropDown.selectByValue("CA");
        System.out.println(stateDropDown.getFirstSelectedOption().getText());
//6. Verify
//    final selected option is California.
//    Use all Select options. (visible text, value, index)
        Assert.assertEquals(stateDropDown.getFirstSelectedOption().getText(),"California");}
    @AfterMethod
            void tearDown(){

        driver.quit();
    }
}