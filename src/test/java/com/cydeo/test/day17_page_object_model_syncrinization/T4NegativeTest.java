package com.cydeo.test.day17_page_object_model_syncrinization;

import com.cydeo.pages.Library1_Cydeo;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4NegativeTest {


   @Test
    public void negativeCheck() {
//       TC #3:Library negative login
//       1 - Open a chrome browser
//       2 - Go to:
//       https:
////library1.cydeo.com
       Driver.getDriver().get(ConfigurationReader.getProperty("library1.cydeo"));
//       3 - Enter incorrect username or incorrect password
       Faker faker=new Faker();
       Library1_Cydeo library1_cydeo=new Library1_Cydeo();

       library1_cydeo.emailInput.sendKeys(faker.internet().emailAddress());
       library1_cydeo.passwordInput.sendKeys(faker.letterify("********************"));
       library1_cydeo.buttonSignIn.click();
//       4 - Verify title expected error is displayed:
//       Expected:
//       Sorry, Wrong Email or Password
       Assert.assertEquals(library1_cydeo.wrongInput.getText(),"Sorry, Wrong Email or Password");
       Driver.closeDriver();
   }}
