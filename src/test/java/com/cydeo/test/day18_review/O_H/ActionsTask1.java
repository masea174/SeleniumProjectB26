package com.cydeo.test.day18_review.O_H;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionsTask1 {
    @Test
    public void test1(){
//        Task 1
//
//                - Go to  "http://automationpractice.com/index.php"
//                - Hover over on Dresses button
        Driver.getDriver().get("http://automationpractice.com/index.php");
        Actions actions=new Actions(Driver.getDriver());

//        - Verify following subCategories are displayed
        WebElement dressesModule = Driver.getDriver().findElement(By.xpath("(//a[.='Dresses'])[2]"));
        actions.moveToElement(dressesModule).perform();
        List<WebElement> dresesOptions=Driver.getDriver().findElements(By.xpath("(//ul[@class='clearfix submenu-container first-in-line-xs'])[2]//a"));
        List<String> dressesExpectedOptions=new ArrayList<>(Arrays.asList("Casual Dresses","Evening Dresses","Summer Dresses"));
        for (int i = 0; i < dresesOptions.size(); i++) {
            Assert.assertTrue(dresesOptions.get(i).isDisplayed());
            Assert.assertEquals(dresesOptions.get(i).getText(),dressesExpectedOptions.get(i));
        }

        Driver.closeDriver();
//
//        Casual Dresses
//        Evening Dresses
//        Summer Dresses
    }
}
