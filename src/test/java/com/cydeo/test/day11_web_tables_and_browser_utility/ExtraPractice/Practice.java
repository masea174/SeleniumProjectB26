package com.cydeo.test.day11_web_tables_and_browser_utility.ExtraPractice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Practice extends TestBase {
    // public class homework2 extends TestBase {

    // public class extraPractice extends TestBase {
    @Test
    public void openXcell() {

//    2. Go to https://www.openxcell.com/
        driver.get("https://www.openxcell.com/");

//     3. Count the number of the links on the page and verify
//    Expected: 332
        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.size();
        int actualNumber = links.size();
        int expectedNumber = 337;
        Assert.assertEquals(actualNumber, expectedNumber);

    }

    public List<WebElement> gettingAllTheURLs(WebDriver driver) {
        driver.get("https://www.openxcell.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.size();

        return links;

    }

    @Test
    public void Xcell() {
//    TC #2: Printing out the texts of the links on the page
//    1. Open Chrome browser
        //     2. Go to https://www.openxcell.com/
//     3. Print out all of the texts of the links on the page

        for (WebElement element : gettingAllTheURLs(driver)) {
            System.out.println(element.getText());
        }
    }
    @Test
    public void Xcell2() throws InterruptedException {

        List<WebElement> webElements = gettingAllTheURLs(driver);
        int count = 0;
        for (WebElement each : webElements) {

             Thread.sleep(10);
            String content = each.getText();
            if(content.isEmpty()){
                count++;
            }



        }
        Assert.assertEquals(count,109);


    }

//    TC #3: Counting the number of links that does not have text
//1. Open Chrome browser
//2. Go to https://www.openxcell.com/
//            3. Count the number of links that does not have text and verify
//    Expected: 109
}

