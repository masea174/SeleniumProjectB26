package com.cydeo.test.day15_javaFaker_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    void javaFakerUse(){
        //    Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("patientUrl"));
//    3. Enter first name
        Faker faker=new Faker();
        Driver.getDriver().findElement(By.cssSelector("input[name='firstname']")).sendKeys(faker.name().firstName());
//    4. Enter last name
        Driver.getDriver().findElement(By.cssSelector("input[name='lastname']")).sendKeys(faker.name().lastName());
//    5. Enter username
        Driver.getDriver().findElement(By.cssSelector("input[name='username']")).sendKeys(faker.name().username().replace(".",""));
//    6. Enter email address
        Driver.getDriver().findElement(By.cssSelector("input[name='email']")).sendKeys(faker.internet().emailAddress());
//    7. Enter password
        Driver.getDriver().findElement(By.cssSelector("input[name='password']")).sendKeys(faker.internet().password());
//    8. Enter phone number
        Driver.getDriver().findElement(By.cssSelector("input[name='phone']")).sendKeys(faker.numerify("###-333-####"));
//    9. Select a gender from radio buttons
        Driver.getDriver().findElement(By.cssSelector("input[value='male']")).click();
//    10.Enter date of birth
        Driver.getDriver().findElement(By.cssSelector("input[name='birthday']")).sendKeys("12/12/2000");
//    11.Select Department/Office
        Select select1 =new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select1.selectByVisibleText("Department of Engineering");
//    12.Select Job Title
        Select select2=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select2.selectByVisibleText("SDET");
//    13.Select programming language from checkboxes
        Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']")).click();
//    14.Click to sign up button
        Driver.getDriver().findElement(By.tagName("button")).click();
//    15.Verify success message “You’ve successfully completed registration.” is
//    displayed.
        String message = Driver.getDriver().findElement(By.tagName("p")).getText();
        Assert.assertEquals(message,"You've successfully completed registration!");

        Driver.closeDriver();
    }
}
