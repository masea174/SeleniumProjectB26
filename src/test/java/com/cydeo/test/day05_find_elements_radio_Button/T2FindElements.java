package com.cydeo.test.day05_find_elements_radio_Button;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2FindElements {
    public static void main(String[] args) {
//        TC #4: FindElements Task
//        1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
//        3- Locate all the links in the page.
        List<WebElement> elements= driver.findElements(By.tagName("a"));

//        4- Print out the number of the links on the page.
        System.out.println(elements.size()+ " links are present on the page");
//        5- Print out the texts of the links.
        for (WebElement each:elements){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("HREF"));

        }
//        6- Print out the HREF attribute values of the links
        driver.close();
    }
}
