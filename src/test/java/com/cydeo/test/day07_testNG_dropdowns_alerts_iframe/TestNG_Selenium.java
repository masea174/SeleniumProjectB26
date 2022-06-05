package com.cydeo.test.day07_testNG_dropdowns_alerts_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;
@BeforeMethod
    public void setUpMethod(){
         driver= WebDriverFactory.getDriver("ch");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void googleTitle(){
        // Get "https://google.com/"

        driver.get("https://google.com/" );
// Assert: title is  "Google"
        String actualTitel=driver.getTitle();
        String expectedTitle="Google";

        Assert.assertEquals(actualTitel,expectedTitle);


    }
    @Test
    public void etsyTitle(){
        driver.get("https://etsy.com/" );
// Assert: title is  "Google"
        String actualTitel=driver.getTitle();
        String expectedTitle="Etsy";

        Assert.assertTrue(actualTitel.contains(expectedTitle));
    }

    @Test
    public void yahooTitle(){
        driver.get("https://yahoo.com/" );
// Assert: title is  "Google"
        String actualTitel=driver.getTitle();
        String expectedTitle="Yahoo";

        Assert.assertTrue(actualTitel.contains(expectedTitle));
    }
    @AfterMethod
    public void breakDown (){
        driver.close();
    }
}
