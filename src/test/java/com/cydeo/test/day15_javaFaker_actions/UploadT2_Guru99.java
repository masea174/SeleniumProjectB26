package com.cydeo.test.day15_javaFaker_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadT2_Guru99 {


    @Test
    public void upload_file_test() throws InterruptedException {
        //    1. Go to “http://demo.guru99.com/test/upload”

        Driver.getDriver().get(ConfigurationReader.getProperty("guru99Url"));
//    2. Upload file into Choose File
        WebElement uploadfileBTN = Driver.getDriver().findElement(By.id("uploadfile_0"));
        String path="/Users/persik/Downloads/some-file (2).txt";
        uploadfileBTN.sendKeys(path);
//    3. Click terms of service checkbox
        Driver.getDriver().findElement(By.id("terms")).click();
//    4. Click Submit File button

        Driver.getDriver().findElement(By.id("submitbutton")).click();
//    5. Verify expected message appeared.
        Thread.sleep(3000);
        WebElement resultMsg = Driver.getDriver().findElement(By.id("res"));
        String actualResultMsg = resultMsg.getText();
        String expectedResultMsg = "1 file\nhas been successfully uploaded.";

        Assert.assertEquals(actualResultMsg,expectedResultMsg,"Result message verification failed!");

        Driver.closeDriver();

//    Expected: “1 file
//    has been successfully uploaded.”
    }
}
