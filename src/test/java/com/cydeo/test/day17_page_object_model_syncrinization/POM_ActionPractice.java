package com.cydeo.test.day17_page_object_model_syncrinization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_ActionPractice {
    Actions actions=new Actions(Driver.getDriver());
    CydeoPracticePage cydeoPracticePage=new CydeoPracticePage();
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
//        3. Verify expected default text appears on big circle
//                Expected = "Drag the small circle here."

    }

    @Test
    public void drag_small_circle_text(){
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
//        3. Verify expected default text appears on big circle
//                Expected = "Drag the small circle here."


        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drag the small circle here.");


    }
    @Test
    public void drop_here_text(){
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));

        CydeoPracticePage cydeoPracticePage=new CydeoPracticePage();
        actions.moveToElement(cydeoPracticePage.smallCircle)
                .clickAndHold().pause(2000)
                .moveByOffset(100,0)
                .perform();

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drop here.");



        Driver.closeDriver();

    }
}
