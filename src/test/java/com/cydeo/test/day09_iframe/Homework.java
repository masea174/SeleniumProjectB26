package com.cydeo.test.day09_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework extends TestBase {

    @Test
    void homework(){
//        TC : Iframe practice
//
//        1. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
//        2. Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame("mce_0_ifr");
        WebElement iframeContent=driver.findElement(By.tagName("p"));
        Assert.assertTrue(iframeContent.isDisplayed());
//        3. Assert: “An iFrame containing the TinyMCE
//        WYSIWYG Editor”
        driver.switchTo().defaultContent();
        WebElement header= driver.findElement(By.tagName("h3"));
        Assert.assertEquals(header.getText(),"An iFrame containing the TinyMCE WYSIWYG Editor");

    }
}
