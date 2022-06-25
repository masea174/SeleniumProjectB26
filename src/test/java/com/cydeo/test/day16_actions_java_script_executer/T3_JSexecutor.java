package com.cydeo.test.day16_actions_java_script_executer;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_JSexecutor {

    @Test
    public void executionJS() throws InterruptedException {
//     * Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsyUrl"));
//                * Scroll down
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
      // js.executeScript("window.scrollBy(0,4000)");
//                * Generate random email and enter into subscribe box
        Faker faker=new Faker();
        Thread.sleep(4000);
        WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",email);

//                * Click on Subscribe
        email.sendKeys(faker.internet().emailAddress());
        Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Subscribe')]")).click();
        Thread.sleep(3000);
//     *Verify "Great! We've sent you an email to confirm your subscription." is displayed
//     */
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Great')]"));
        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(message.getText(),"Great! We've sent you an email to confirm your subscription.");
        Driver.closeDriver();


    }
}
