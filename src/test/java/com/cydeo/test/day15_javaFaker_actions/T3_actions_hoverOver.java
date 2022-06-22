package com.cydeo.test.day15_javaFaker_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_actions_hoverOver
{
    @Test
    public void  googleActionsHoverTest(){

        //    1. Go to https://www.google.com/

        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

//    2. Hover over on Search button
        Actions actions=new Actions(Driver.getDriver());
        WebElement goodleSeachBtn = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::*"));
        actions.moveToElement(goodleSeachBtn).perform();

//    3. Hover over on Feeling Lucky button

        WebElement feelingLuckyBtn = Driver.getDriver().findElement(By.xpath("(//input[@id='gbqfbb'])"));
        actions.moveToElement(feelingLuckyBtn).perform();

    }
}
