package com.cydeo.test.day11_web_tables_and_browser_utility.ExtraPractice;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartbearLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T2SmartBearsOrder extends TestBase {
@Test
    public void orderPLacing(){
//    TC#2: Smartbear software order placing
//1. Open browser
//2. Go to website:
//    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//            3. Enter username: “Tester”
//            4. Enter password: “test”
//            5. Click on Login button
    SmartbearLogin.login(driver);
//6. Click on Order
    WebElement orderBtn=driver.findElement(By.xpath("//a[.='Order']"));
    orderBtn.click();
//7. Select familyAlbum from product, set quantity to 2
    Select nameDropDown=new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
    nameDropDown.selectByVisibleText("FamilyAlbum");
    WebElement quantityInput= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
    quantityInput.sendKeys("2");
//            8. Click to “Calculate” button
    WebElement calculateBTn= driver.findElement(By.xpath("//input[@type='submit']"));
//9. Fill address Info with JavaFaker
//• Generate: name, street, city, state, zip code
//    10. Click on “visa” radio button
//    11. Generate card number using JavaFaker
//    12. Click on “Process”
//    13. Verify success message “New order has been successfully added.”

}
}