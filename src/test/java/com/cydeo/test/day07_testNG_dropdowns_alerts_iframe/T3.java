package com.cydeo.test.day07_testNG_dropdowns_alerts_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3 {
//    C #3: Selecting value from multiple select dropdown
//1. Open Chrome browser

    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    void selectMultipleChoise() throws InterruptedException {
//2. Go to https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");
// 3.Select all the options from multiple select dropdown.
        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> allMultipleChoises = languages.getOptions();

        for (int i = 0; i < allMultipleChoises.size(); i++) {
            languages.selectByIndex(i);

           // allMultipleChoises.get(i).click();//second way to do it ;

            //            4. Print out all selected values.
            System.out.println(allMultipleChoises.get(i).getText());

        }
        Thread.sleep(1000);
//5. Deselect all values.
        languages.deselectAll();

        driver.quit();

    }
}
