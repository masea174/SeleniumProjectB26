package com.cydeo.test.day18_review.O_H;

import com.cydeo.pages.SmartBearSoftwareLoginPage;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsT3 {

    @Test
    public void actionsTask3() {

//        Task 3
//
//                - Go to  "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx"
//                - Fill form with following information
//        fullname : TEST
//        email    : TEST
//                - Click Login Button
//        - Verify error message equals "Invalid Login or Password."
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
SmartBearSoftwareLoginPage smartBearSoftwareLoginPage=new SmartBearSoftwareLoginPage();
       smartBearSoftwareLoginPage.loginInput.sendKeys("TEST");
//
        smartBearSoftwareLoginPage.passwordInput.sendKeys("TEST");
//
        smartBearSoftwareLoginPage.submitBtn.click();


        Assert.assertEquals(smartBearSoftwareLoginPage.errorMessage.getText(),"Invalid Login or Password.");
        Driver.closeDriver();



    }
}