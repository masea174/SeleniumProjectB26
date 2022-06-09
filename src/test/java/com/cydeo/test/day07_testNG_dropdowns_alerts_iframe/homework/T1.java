package com.cydeo.test.day07_testNG_dropdowns_alerts_iframe.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1 {
    WebDriver driver;

    @BeforeMethod
    void setup() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @Test
    void selectDateAndVErify() {
//2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
//            3. Select “December 1st, 1923” and verify it is selected.
        Select yearSelectDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearSelectDropDown.selectByVisibleText("1923");
//    Select year using   : visible text
        Select monthSelectDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthSelectDropDown.selectByValue("11");
//    Select month using    : value attribute Select

//    day using : index number
        Select daySelectDropDown = new Select(driver.findElement(By.id("day")));
        daySelectDropDown.selectByIndex(0);

        String expectedDaySelected = "December 1st, 1923";

        String actualDaySelected = monthSelectDropDown.getFirstSelectedOption().getText() + " " + daySelectDropDown.getFirstSelectedOption().getText() + "st, " + yearSelectDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDaySelected, expectedDaySelected);

        driver.quit();
    }

    //    TC : Selecting value from non-select dropdown
//1. Open Chrome browser
    @Test
    void nonSelectiveDropDown() throws InterruptedException {
//2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
//            3. Click to non-select dropdown
        WebElement linkDropdown = driver.findElement(By.partialLinkText("link"));
        linkDropdown.click();
//4. Select Facebook from dropdown
        WebElement faceBookLink=driver.findElement(By.linkText("Facebook"));
        faceBookLink.click();
Thread.sleep(4000);
//5. Verify title is “Facebook - log in or sign up”
        String expectedTitle="Facebook - log in or sign up";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();
//
//            *Remember: If there is no <select>  tag, it is called HTML
//    dropdown and We handle just as any other web
//    element. We locate. We click.
    }
}