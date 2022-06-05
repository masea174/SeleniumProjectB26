package com.cydeo.test.day06_staleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

//        TC: Etsy checkbox and radio button
        WebDriver driver= WebDriverFactory.getDriver("ch");

//        1. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
//        2. Search for “wooden spoon”
        WebElement searchArea=driver.findElement(By.xpath("//input[contains(@placeholder,'Search for anything')]"));
        searchArea.sendKeys("wooden spoon"+ Keys.ENTER);
//        3. Click on filters
        WebElement filter=driver.findElement(By.xpath("//span[.='All Filters']"));
        filter.click();
//        4. Select free shipping, on sale
        WebElement freeShippingButton=driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        freeShippingButton.click();
        WebElement onSale=driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        onSale.click();
//        5. Select under $25 Click on apply filters
        WebElement under25Dollars=driver.findElement(By.xpath("//label[@for='price-input-1']"));
        under25Dollars.click();
        WebElement applyFillersButton=driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        System.out.println( applyFillersButton);
        applyFillersButton.click();
        Thread.sleep(3000);
//        6. Print count of results
        WebElement results= driver.findElement(By.xpath("(//span[contains(text(),'results')])[1]"));//span[contains(text(),'results')])[1]
        System.out.println(results.getText());

        driver.close();

    }
}
