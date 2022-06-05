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

public class T1_SimpleDropDownExample {

    WebDriver driver;

    @BeforeMethod
    void setUpDriver() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    void verifySimpleDropDown() {//    TC #1: Verifying “Simple dropdown” and “State selection”
//    dropdown default values
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown


//            3. Verify “Simple dropdown” default selected value is correct
//    Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[contains(.,'select an option')]")));
        String actualDefaltSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedDefaultSimpleDropDown = "Please select an option";
        Assert.assertEquals(actualDefaltSimpleDropdown, expectedDefaultSimpleDropDown);

    } @Test
                void stateVerificationDropDown(){
//            4. Verify “State selection” default selected value is correct
//    Expected: “Select a State”

        Select stateSelection=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String selectedDefaultStateSelection=stateSelection.getFirstSelectedOption().getText();
        String expectedStateSelection="Select a State";

        Assert.assertEquals(selectedDefaultStateSelection,expectedStateSelection);
    }

    @AfterMethod
    void tearDown(){
        driver.close();
    }
}
