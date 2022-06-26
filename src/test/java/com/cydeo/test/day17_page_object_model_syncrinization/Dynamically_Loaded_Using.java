package com.cydeo.test.day17_page_object_model_syncrinization;

import com.cydeo.pages.DynamicallyLoadedPage7;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dynamically_Loaded_Using {



@Test
    public void dynamic_title(){
//    1. Go to https://practice.cydeo.com/dynamic_loading/7
    Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
//    2. Wait until title is “Dynamic title”
    DynamicallyLoadedPage7 dynamicallyLoadedPage7=new DynamicallyLoadedPage7();

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
  wait.until(ExpectedConditions.titleIs("Dynamic title"));
//    3. Assert:
//    Message “Done” is displayed.
    Assert.assertEquals(dynamicallyLoadedPage7.doneMs.getText(),"Done!");
//    4. Assert: Image is displayed.
    Assert.assertTrue(dynamicallyLoadedPage7.image.isDisplayed());

    Driver.closeDriver();

}
}
