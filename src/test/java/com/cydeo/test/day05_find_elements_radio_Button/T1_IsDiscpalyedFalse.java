package com.cydeo.test.day05_find_elements_radio_Button;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_IsDiscpalyedFalse {
    public static void main(String[] args) {
        //1 open Chrome Browser
        WebDriver driver= WebDriverFactory.getDriver("ch" );
        //go to the page
        driver.get("https://www.tesla.com");

        //find element solar panels
        WebElement solarPanels=driver.findElement(By.xpath("//h1[contains(.,'Solar Panels')]"));
// cke if its displayed
        System.out.println(solarPanels.isDisplayed() ? "the Solar Panel is Displayed" :
                "Not Displayed");
driver.quit();

    }
}
