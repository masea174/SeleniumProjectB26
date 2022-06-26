package com.cydeo.test.day17_page_object_model_syncrinization;

import com.cydeo.pages.Library1_Cydeo;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3InvaldFormat {
    @Test
    public void invalidFormatEmail(){
//        TC #2: Invalid email format error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
        Driver.getDriver().get(ConfigurationReader.getProperty("library1.cydeo"));

//        3- Enter invalid email format
        Library1_Cydeo library1_cydeo=new Library1_Cydeo();
        library1_cydeo.emailInput.sendKeys("helloworld"+ Keys.ENTER);
//        4- Verify expected error is displayed:
//        Expected: Please enter a valid email address.
        Assert.assertEquals(library1_cydeo.errorMessage.getText(),"Please enter a valid email address.");
        Driver.closeDriver();

    }
}
