package com.cydeo.test.day15_javaFaker_actions.homework;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1 {

    @Test
    public void hoveroverpractice(){
//        TC #3: Hover Test
//        1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
//        2. Hover over to first image
        Actions actions=new Actions(Driver.getDriver());
        WebElement firstPicture = Driver.getDriver().findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
        actions.moveToElement(firstPicture).perform();

//        3. Assert:
//        a. “name: user1” is displayed
        WebElement headerUser1 = Driver.getDriver().findElement(By.tagName("h5"));
        Assert.assertTrue(headerUser1.isDisplayed());
//        b. “view profile” is displayed
        WebElement viewProfile=Driver.getDriver().findElement(By.xpath("//a[.='View profile']"));
        Assert.assertTrue(viewProfile.isDisplayed());
//        4. Hover over to second image

        WebElement secondPicture = Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
        actions.moveToElement(secondPicture).perform();
//        5. Assert:
//        a. “name: user2” is displayed
        WebElement headerUser2 = Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        Assert.assertTrue(headerUser2.isDisplayed());
//        b. “view profile” is displayed
        WebElement viewProfile2=Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        Assert.assertTrue(viewProfile2.isDisplayed());
//        6. Hover over to third image
        WebElement thirdPicture = Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"));
        actions.moveToElement(thirdPicture).perform();
//        7. Confirm:
//        a. “name: user3” is displayed
        WebElement headerUser3 = Driver.getDriver().findElement(By.xpath("(//h5)[3]"));
        Assert.assertTrue(headerUser3.isDisplayed());
//        b. “view profile” is displayed
        WebElement viewProfile3=Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));
        Assert.assertTrue(viewProfile3.isDisplayed());
        Driver.closeDriver();

    }
}
