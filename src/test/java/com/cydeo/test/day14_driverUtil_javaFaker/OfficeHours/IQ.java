package com.cydeo.test.day14_driverUtil_javaFaker.OfficeHours;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IQ {

    @Test
    public void verificationTechCrunch() throws InterruptedException {
        Driver.getDriver().get("https://techcrunch.com/");

        List<WebElement> latestArticles = Driver.getDriver().findElements(By.xpath("//article[@class='post-block post-block--image post-block--unread']"));

        for (WebElement each : latestArticles) {
           WebElement articleTitle=each.findElement(By.xpath("//article[@class='post-block post-block--image post-block--unread']//a[@class='post-block__title__link']"));
            System.out.println("Article"+articleTitle.getText());
            System.out.println("author " + each.findElement(By.xpath("//span[@class='river-byline__authors']")).getText());
            System.out.println("has a imagine displayed : "+each.findElement(By.xpath("//article[@class='post-block post-block--image post-block--unread']//img")).isDisplayed());

        }
        String art=Driver.getDriver().findElement(By.xpath("(//a[@class='post-block__title__link'])[4]")).getText();

        Driver.getDriver().findElement(By.xpath("(//a[@class='post-block__title__link'])[4]")).click();

        Assert.assertEquals(Driver.getDriver().getTitle(),art);


    }

}
