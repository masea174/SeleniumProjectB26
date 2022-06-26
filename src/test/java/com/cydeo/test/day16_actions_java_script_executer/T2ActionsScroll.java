package com.cydeo.test.day16_actions_java_script_executer;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T2ActionsScroll {

    @Test
    public void actions_scroll_test(){
        //    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoPracticeUrl"));

//    3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();
//    4- Scroll using Actions class “moveTo(element)” method
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        actions.moveToElement(homeLink);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();


//    1- Continue from where the Task 4 is left in the same test.
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
//    2- Scroll back up to “Home” link using PageUP button
    }
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll ");
    }
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    @Test(invocationCount = 10)
    public void test(){
        js.executeScript("window.scrollBy(0,750)");
    }
}
