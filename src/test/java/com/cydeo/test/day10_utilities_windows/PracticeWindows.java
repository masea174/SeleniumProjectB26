package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class PracticeWindows extends TestBase {

    @Test
    public void windowHAndle(){
        driver.get("https://practice.cydeo.com/windows");
//        1. Open a chrome browser
//        2. Go to : https://practice.cydeo.com/windows
//        3. Assert: Title is “Windows”
        Assert.assertEquals(driver.getTitle(),"Windows");

//        4. Click to: “Click Here” link
        driver.findElement(By.xpath("//a[.='Click Here']")).click();
//        5. Switch to new Window.
        Set<String>allWindows=driver.getWindowHandles();
        for(String window:allWindows){
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());
        }
//        6. Assert: Title is “New Window”

        Assert.assertEquals(driver.getTitle(),"New Window");
    }

}
