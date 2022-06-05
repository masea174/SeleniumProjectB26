package com.cydeo.test.day06_staleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElemenetException {
    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("ch");

//        2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        3. Click to “Add Element” button
        WebElement addElementButton=driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();
//        4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButon=driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("The delete button is displayed :"+deleteButon.isDisplayed());
//        5. Click to “Delete” button.
        deleteButon.click();
//        6. Verify “Delete” button is NOT displayed after clicking.
        try{
        System.out.println("The delete button is displayed :"+deleteButon.isDisplayed());}
        catch (StaleElementReferenceException E){
            System.out.println("StaleElementReferenceException trigured ");
        }finally {
            driver.close();
        }


    }
}
