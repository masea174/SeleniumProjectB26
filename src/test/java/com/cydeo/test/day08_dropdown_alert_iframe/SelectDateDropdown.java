package com.cydeo.test.day08_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDateDropdown {


//    TC : Selecting date on dropdown and verifying
//1. Open Chrome browser
WebDriver driver;

    @BeforeMethod
    void setup() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

//2. Go to https://practice.cydeo.com/dropdown
    @Test
    void selectDate() {
driver.get("https://practice.cydeo.com/dropdown");
//            3. Select “December 1st, 1923” and verify it is selected.
        Select yearElement=new Select(driver.findElement(By.id("year")));
        yearElement.selectByVisibleText("1923");
//    Select year using   : visible text
//    Select month using    : value attribute Select
        Select monthElement=new Select(driver.findElement(By.id("month")));
        monthElement.selectByValue("11");
//    day using : index number
        Select dayElement=new Select(driver.findElement(By.id("day")));
        dayElement.selectByIndex(0);

        String expectedDate="December 1, 1923";

        String actualDate=monthElement.getFirstSelectedOption().getText()+" "+dayElement.getFirstSelectedOption().getText()+", "+yearElement.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDate,expectedDate);

        driver.quit();
    }
}
