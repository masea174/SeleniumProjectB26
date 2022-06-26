package com.cydeo.test.day18_review.O_H;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DragAndDropPractice {

    @Test
    public void drag_drop() throws InterruptedException {
//        Task 2
//
//                - Go to  "https://www.globalsqa.com/demo-site/draganddrop/"
        Driver.getDriver().get("https://www.globalsqa.com/demo-site/draganddrop/");
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']")));
        WebElement picture1 = Driver.getDriver().findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
        WebElement picture2=Driver.getDriver().findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
        WebElement trash=Driver.getDriver().findElement(By.id("trash"));

//                - Drag and Drop "High Tatras" and "High Tatras 2" into "Trash"
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(picture1,trash).perform();
        actions.dragAndDrop(picture2,trash).perform();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@id='trash']//li"),1));
//                - Verify Trash has 2 photo
        List<WebElement> trashElements = Driver.getDriver().findElements(By.xpath("//div[@id='trash']//li"));


        Assert.assertEquals(trashElements.size(),2);
        Driver.closeDriver();


    }
}
