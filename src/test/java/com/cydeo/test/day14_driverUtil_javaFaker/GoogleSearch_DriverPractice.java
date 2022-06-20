package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.utilities.BrowserUtil;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {

    @Test
    public void google_search(){
        // Go to "https://www.google.com/"

        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
// Write “apple” in search box
        Driver.getDriver().findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        // Verify title:
        BrowserUtil.verifyTitle(Driver.getDriver(),"apple - Google Search");
        //Expected: apple - Google Search
    }
}
