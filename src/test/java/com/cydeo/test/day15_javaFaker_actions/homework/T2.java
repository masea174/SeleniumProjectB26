package com.cydeo.test.day15_javaFaker_actions.homework;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2 {

    @Test
    public static void task_2() throws InterruptedException {
//        TC #2 Upload Test
//        1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
//        2. Find some small file from your computer, and get the path of it.
Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/persik/Downloads/some-file (2).txt");
//        3. Upload the file.
        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();
        Thread.sleep(3000);
//        4. Assert:
//        -File uploaded text is displayed on the page
        Assert.assertTrue(Driver.getDriver().findElement(By.tagName("h3")).isDisplayed());
        Driver.closeDriver();
    }
}
