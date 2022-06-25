package com.cydeo.test.day16_actions_java_script_executer;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomeworkT1 {

    @Test
    public void homework(){
//        TC #6: Scroll using JavascriptExecutor
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        WebDriver driver=Driver.getDriver();
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
//        3- Use below JavaScript method and scroll

//        a.  750 pixels down 10 times.
//                b.  750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
        js.executeScript("window.scroll(0,750)");
        }
        for (int i = 10; i > 0; i--) {
            js.executeScript("window.scroll(0,-750)");
        }
//        JavaScript method to use : window.scrollBy(0,0)
        Driver.closeDriver();
    }
}
