package com.cydeo.test.day11_web_tables_and_browser_utility.ExtraPractice;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMiliage extends TestBase {


    @Test
    void task1(){
//        Task #: Gas Mileage Calculator Automation Test
//
//        1. Add a new class GasMileageCalculatorTest
//        2. Go to https://www.calculator.net
driver.get("https://www.calculator.net");
//        3. Search for “gas mileage” using search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchBox.sendKeys("gas mileage");
//        4. Click on the “Gas Mileage Calculator” link
        driver.findElement(By.xpath("//a[text()='Gas Mileage Calculator']")).click();
//
//
//        5. On Next page verify:

//        a. Title equals: “Gas Mileage Calculator”
        BrowserUtil.verifyTitle(driver,"Gas Mileage Calculator");
//        b. “Gas Mileage Calculator” label is displayed
        WebElement header = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(header.isDisplayed());
//        6. Locate, clear and type “7925” into “Current odometer” field
        WebElement currentOdometrField = driver.findElement(By.xpath("//input[@id='uscodreading']"));
        currentOdometrField.clear();
        currentOdometrField.sendKeys("7925");
//        7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometrField = driver.findElement(By.xpath("//input[@id='uspodreading']"));
        previousOdometrField.clear();
        previousOdometrField.sendKeys("7550");
//        8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAddedBox = driver.findElement(By.cssSelector("input[id='usgasputin']"));
        gasAddedBox.clear();
        gasAddedBox.sendKeys("16");
//        9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPriceBox = driver.findElement(By.cssSelector("input[id='usgasprice']"));
        gasPriceBox.clear();
        gasPriceBox.sendKeys("3.55");
//        10. Click on Calculate button
        WebElement calculateBtn = driver.findElement(By.cssSelector("input[value=\"Calculate\"]"));
        calculateBtn.click();
//        11. Verify mpg value is as expected:
        WebElement calculation = driver.findElement(By.xpath("(//b)[1]"));

//        Expected value: “23.44 mpg”
        Assert.assertEquals(calculation.getText(),"23.44 mpg");
    }
}
