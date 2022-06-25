package com.cydeo.test.day16_actions_java_script_executer;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeworkT7 {

    @Test
    public void javaExecuterCroling() throws InterruptedException {
//        TC #7: Scroll using JavascriptExecutor
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
//        3- Scroll down to “Cydeo” link
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
//        4- Scroll up to “Home” link
        Thread.sleep(5000);
        WebElement homeLink = Driver.getDriver().findElement(By.partialLinkText("Home"));
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
//        5- Use below provided JS method only
//
//        JavaScript method to use : arguments[0].scrollIntoView(true)
Thread.sleep(5000);
//        Note: You need to locate the links as web elements and pass them as
//        arguments into executeScript() method
        Driver.closeDriver();

    }
}
