package com.cydeo.test.day18_review.O_H;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void uploadMethods(){
//        - Go to  "https://testpages.herokuapp.com/styled/file-upload-test.html"
//                - Upload file into Choose File
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/file-upload-test.html");

        WebElement uploadInput = Driver.getDriver().findElement(By.xpath("//input[@id='fileinput']"));
       uploadInput.sendKeys ("src/test/java/com/cydeo/test/day18_review/O_H/UploadTest.txt");

//        NOTE : Create a file called as UploadTest.txt in project to upload ( I will show how we can )
//                - Choose General File
//        - Click Upload button
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

//        - Verify Expected message equals "You uploaded a file. This is the result."
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='explanation']"));

        Assert.assertEquals(message.getText(),"You uploaded a file. This is the result.");
        Driver.closeDriver();

    }
}
