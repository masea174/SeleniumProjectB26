package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // TASK: NEW METHOD CREATION
// Method name : getDriver
    public static WebDriver getDriver(String browserType){
        WebDriver driver;
        switch(browserType.toLowerCase()){
            default:
            case"chrome":
            case "ch":
                WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
            case"f":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();

        }return driver;
    }
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"
}
