package com.cydeo.crm_project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginFunctionalityHappyPath {
    public static void main(String[] args) throws InterruptedException {
        //1 setting up my driver chrome

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2 navigate to the url
        driver.get("http://login2.nextbasecrm.com");

        //Creating an arrayList to input all the data I have for my Happy Paths
        ArrayList<String> allData = new ArrayList<>(Arrays.asList("helpdesk19@cybertekschool.com",
                "helpdesk20@cybertekschool.com", "marketing19@cybertekschool.com", "marketing20@cybertekschool.com", "hr19@cybertekschool.com", "hr20@cybertekschool.com"));

        //create a loop to be able to imput all the data in the process
        for (String each : allData) {
            //3 check if you are on the correct page
            String expectedTitle = "Authorization";
            String actualTitle = driver.getTitle();
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("On the correct Page");
            } else {
                System.out.println("Wrong page navigated to");
            }

            //4 find the web element to input the data
            WebElement element = driver.findElement(By.name("USER_LOGIN"));
            //5 sendKeys for the user name and for password
            Actions actions = new Actions(driver);
            actions.doubleClick(element).doubleClick(element).perform();

            element.sendKeys(Keys.DELETE + each);
            WebElement passwordInput = driver.findElement(By.cssSelector("input[name=\"USER_PASSWORD\"]"));


            passwordInput.sendKeys("UserUser");
            //find the login button and click it
            driver.findElement(By.cssSelector("input.login-btn")).click();

            Thread.sleep(6000);
            //6 check for title if you are on the homepage
            System.out.println(driver.getTitle());
            //   Thread.sleep(5000);
            if (driver.getTitle().contains("Portal") || driver.getTitle().contains("EULA")) {
                System.out.println("Loging Functionality passed!");
                //7 find the drop down element to logout
                logOutProcedure(driver);
            } else {
                System.out.println("Login Functionality failed!" + driver.getTitle());

            }
        }
        driver.close();
    }

    public static void logOutProcedure(WebDriver driver) {
        WebElement userblock = driver.findElement(By.id("user-block"));
        userblock.click();
        //8 find the log out button
        WebElement logOutButton = driver.findElement(By.cssSelector("#popup-window-content-menu-popup-user-menu > div > div > a:nth-child(5) > span.menu-popup-item-text"));
        logOutButton.click();
    }
}
