package com.cydeo.test.day17_page_object_model_syncrinization;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void task1() throws InterruptedException {
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
//        3. Click and hold small circle
        Actions actions=new Actions(Driver.getDriver());

        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        actions.moveToElement(draggable).clickAndHold().perform();

//        4. Move it on top of the big circle
        WebElement droptarget = Driver.getDriver().findElement(By.id("droptarget"));
actions.moveToElement(droptarget).release().perform();
//        5. And release on it.
//        6. Verify “You did great!” text appears on big circle
        Thread.sleep(3000);
        Assert.assertEquals(droptarget.getText(),"You did great!");

    }
    @Test
    void test2(){
//        TC #2: Cydeo Practice Drag and Drop Test
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
//        3. Verify expected default text appears on big circle
//                Expected = "Drag the small circle here."
        WebElement droptarget = Driver.getDriver().findElement(By.id("droptarget"));
        Assert.assertEquals(droptarget.getText(),"Drag the small circle here.");
    }
    @Test
    void test3() throws InterruptedException {
//        TC #3: Cydeo Practice Drag and Drop Test
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
//
//3. Click and hold small circle
//4. Verify "Drop here." text appears on big circle
        Actions actions=new Actions(Driver.getDriver());
        WebElement droptarget = Driver.getDriver().findElement(By.id("droptarget"));
        Assert.assertEquals(droptarget.getText(),"Drag the small circle here.");
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement offset=Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(draggable).clickAndHold().moveToElement(offset).perform();
             Thread.sleep(3000);
        Assert.assertEquals(droptarget.getText(),"Drop here.");

}
@Test
    void task4() {
//    TC #4: Cydeo Practice Drag and Drop Test
//    7. Open a chrome browser
    Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
    Actions actions = new Actions(Driver.getDriver());
    WebElement droptarget = Driver.getDriver().findElement(By.id("droptarget"));
    Assert.assertEquals(droptarget.getText(), "Drag the small circle here.");
    WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));

    actions.moveToElement(draggable).clickAndHold().moveToElement(droptarget).perform();
//    8. Go to:
//    https://practice.cydeo.com/drag_and_drop_circles
//    9. Click and hold small circle
//    10. Move it on top of the big circle
//    11. Verify “Now drop...” text appears on big circle
    Assert.assertEquals(droptarget.getText(), "Now drop...");
}
    @Test
    void task5(){
//        TC #5: Cydeo Practice Drag and Drop Test
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
//        3. Click and hold small circle
//        4. Dropped anywhere outside of big circle
//        5. Verify “Try again!” text appears on big circle
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.drag&drop.url"));
        Actions actions = new Actions(Driver.getDriver());
        WebElement droptarget = Driver.getDriver().findElement(By.id("droptarget"));
        Assert.assertEquals(droptarget.getText(), "Drag the small circle here.");
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));

        WebElement offset=Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(draggable).clickAndHold().moveToElement(offset).release().perform();

        Assert.assertEquals(droptarget.getText(),"Try again!");

        Driver.closeDriver();
    }

}
