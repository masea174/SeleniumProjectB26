package com.cydeo.test.day11_web_tables_and_browser_utility;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_MultipleWindows extends TestBase {


    @Test
    public void windowHandlePractice() {


//    TC #2: Window Handle practice
//1. Create new test and  make setups
//2. Goto:https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//            3. Copy paste the lines from below in to your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        //

//4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> windowHandles = driver.getWindowHandles();

        for(String each:windowHandles){
            driver.switchTo().window(each);
            if(driver.getCurrentUrl().contains("etsy.com")){
                break;
            }
        }

// 5. Assert:Title contains“Etsy”
//    Lines to be pasted:
        Assert.assertTrue(driver.getTitle().contains("Etsy"));
//            These lines will simply open new tabs using something called JavascriptExecutor and get those pages. We will learn JavascriptExecutor later as well.
    }
}
