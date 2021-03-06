package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String costumerName){
        String webAddress="//table/tbody/tr/td[.='"+costumerName+"']";
        String dateAddress="//table/tbody/tr/td[.='"+costumerName+"']/following-sibling::*[3]";
        WebElement custumerLine=driver.findElement(By.xpath(webAddress));
        WebElement custumerOrderDate=driver.findElement(By.xpath(dateAddress));
        return custumerOrderDate.getText();
    }

    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){
        String locator ="//td[.='" + customerName + "']//following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(customerDateCell.getText(),expectedOrderDate);



    }

}
