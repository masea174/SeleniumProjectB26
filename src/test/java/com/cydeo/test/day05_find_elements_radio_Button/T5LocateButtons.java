package com.cydeo.test.day05_find_elements_radio_Button;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T5LocateButtons {
    public static  void clickAndVerifyRadioButtons(){
//        Method name: clickAndVerifyRadioButton
//        Return type: void or boolean
//        Method args:
//        1. WebDriver

        WebDriver driver= WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//        2. Name attribute as String (for providing which group of radio buttons)
        List<WebElement> sportsElement=driver.findElements(By.xpath("//input[@name='sport']"));
        for (WebElement each:sportsElement){
            each.click();
        }

//        3. Id attribute as String (for providing which radio button to be clicked)

    }
}
