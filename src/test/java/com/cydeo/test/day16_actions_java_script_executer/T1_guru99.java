package com.cydeo.test.day16_actions_java_script_executer;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_guru99 {

    @Test
    public void drugAndDrop(){

        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99UrlDropdown"));
//    3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bankBtn = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitSideAccount = Driver.getDriver().findElement(By.id("shoppingCart1"));
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(bankBtn,debitSideAccount).perform();

//    4- Drag “5000” and drop into Amount area under Debit Side
        WebElement btn5000= Driver.getDriver().findElement(By.linkText("5000"));
        WebElement debitSideAmount = Driver.getDriver().findElement(By.id("shoppingCart4"));
        actions.dragAndDrop(btn5000,debitSideAmount).perform();
//    5- Drag “SALES” and drop into Account area under Credit Side
        WebElement salesBtn = Driver.getDriver().findElement(By.linkText("SALES"));
        WebElement creditSideAccount = Driver.getDriver().findElement(By.id("shoppingCart3"));
        actions.dragAndDrop(salesBtn,creditSideAccount).perform();
//    6- Drag “5000” and drop into Amount area under Credit Side
        WebElement creditSideAmount = Driver.getDriver().findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));

        actions.dragAndDrop(btn5000,creditSideAmount).perform();

//    7- Verify “Perfect!” text displayed.
        WebElement perfect = Driver.getDriver().findElement(By.linkText("Perfect!"));
        Assert.assertEquals(perfect.getText(),"Perfect!");
        Assert.assertTrue(perfect.isDisplayed());

        Driver.closeDriver();

    }
}
