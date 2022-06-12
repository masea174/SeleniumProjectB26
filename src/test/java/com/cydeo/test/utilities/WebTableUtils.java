package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String costumerName){


        String webAddress="//table/tbody/tr/td[.='"+costumerName+"']";
        String dateAddress="//table/tbody/tr/td[.='"+costumerName+"']/following-sibling::*[3]";
        WebElement custumerLine=driver.findElement(By.xpath(webAddress));
        WebElement custumerOrderDate=driver.findElement(By.xpath(dateAddress));



        return custumerOrderDate.getText();
    }
}
