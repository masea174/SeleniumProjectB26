package com.cydeo.test.day05_find_elements_radio_Button;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_Checkbox {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("CH");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");
//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1=driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println(checkBox1.isSelected() ? "CheckBox1 Is selected By Default" : "CheckBox1 is Not Selected By Default");
//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2=driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println(checkBox2.isSelected() ? "CheckBox2 Is selected By Default" : "CheckBox2 is Not Selected By Default");
//        4. Click checkbox #1 to select it.
        checkBox1.click();
//        5. Click checkbox #2 to deselect it.
        checkBox2.click();
//        6. Confirm checkbox #1 is SELECTED.
        System.out.println(checkBox1.isSelected() ? "CheckBox1 Is selected " : "CheckBox1 is Not Selected");
//        7. Confirm checkbox #2 is NOT selected.
        System.out.println(checkBox2.isSelected() ? "CheckBox2 Is selected " : "CheckBox2 is Not Selected");

        driver.quit();
    }
}
