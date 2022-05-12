package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerification {
    /*
    TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com/
3. Verify title:
Expected: Yahoo
     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();//seting up the drivew manager
        WebDriver driver=new ChromeDriver();// creating the driver object

        driver.manage().window().maximize();//maximaze the page

        driver.get("https://www.yahoo.com/");//navigate to url

        // comes from the selenium
        String urlName=driver.getTitle();
        System.out.println(urlName);
        //expected title comes from the requirments
        System.out.println(urlName.contains("Yahoo")?"Title verification pass":"Title verification fail");

        driver.close();

    }
}
