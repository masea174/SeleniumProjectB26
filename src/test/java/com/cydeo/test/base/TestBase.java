package com.cydeo.test.base;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

   public static WebDriver driver;
    @BeforeMethod
   public void setUp() {
        driver = WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void breakDown (){
        driver.quit();
    }
}
