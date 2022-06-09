package com.cydeo.test.day09_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFramePractice extends TestBase {
    @Test
    void  iframeExample(){
//        TC #6: Iframe Task
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
//        3- Clear text from comment body
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement iframeBody= driver.findElement(By.id("tinymce"));
        iframeBody.clear();
//        4- Type "Hello World" in comment body
        iframeBody.sendKeys("Hello World");
//        5- Verify "Hello World" text is written in comment body
//        6- Verify header "An iFrame containing the TinyMCE
        driver.switchTo().defaultContent();
//        WYSIWYG Editor" is displayed
                String expectedHeader="An iFrame containing the TinyMCE WYSIWYG Editor";
                WebElement actualHeader=driver.findElement(By.tagName("h3"));
                String actualHeaderSt=actualHeader.getText();

        Assert.assertEquals(actualHeaderSt,expectedHeader);
        Assert.assertTrue(actualHeader.isDisplayed());
    }
}
