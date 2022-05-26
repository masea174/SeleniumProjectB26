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

public class LFWrongUserNameCorectPass {
    public static void main(String[] args) throws InterruptedException {
        //1 setting up my driver chrome

        WebDriver driver = getWebDriver();

        //2 navigate to the url
        driver.get("http://login2.nextbasecrm.com");

        //create the arrayList with the data information
        ArrayList<String> allcorrectData = new ArrayList<>(Arrays.asList("helpdesk19@cybertekschool.com",
                "helpdesk20@cybertekschool.com", "marketing19@cybertekschool.com", "marketing20@cybertekschool.com", "hr19@cybertekschool.com", "hr20@cybertekschool.com"));
        ArrayList<String> wrongData = new ArrayList<>(Arrays.asList("he@cybertekschool.com",
                "helpde@cybertekschool.com", "ng19@cybertekschool.com", "markg20@cybertekschool.com", "h@cybertekschool.com", "h0@cybertekschool.com"));
        //create the loop to access all the data
        System.out.println();
        System.out.println("The correct loging credentiantials, wrong password");
        for (String each : allcorrectData) {
            //3 check if you are on the correct page
            String expectedTitle = "Authorization";
            String actualTitle = driver.getTitle();
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("On the correct Page");
            } else {
                System.out.println("Title verification failed!");
            }
            //4 find the web element to input the data
            WebElement element = driver.findElement(By.name("USER_LOGIN"));
            Actions actions = new Actions(driver);
            actions.doubleClick(element).doubleClick(element).perform();
            Thread.sleep(1000);
            //5 sendKeys for the user name and for password
            element.sendKeys(Keys.DELETE + each + Keys.TAB + "User" + Keys.ENTER);
            //6 check for title if you are on the same page;
            if (driver.getTitle().contains(expectedTitle)) {
                System.out.println("Title verification passed!");
                //7.find the erroe web element
                WebElement errorEl = driver.findElement(By.className("errortext"));
                if (errorEl.getText().equals("Incorrect login or password")) {
                    System.out.println("The Error message is present!!");
                } else {
                    System.out.println("No Error Message");
                }


            }
        }

        System.out.println();
        System.out.println("The correct loging credentiantials, empty password");
        for (String each : allcorrectData) {
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
            Actions actions = new Actions(driver);
            actions.doubleClick(element).doubleClick(element).perform();
            Thread.sleep(1000);
            //5 sendKeys for the user name and for password
            element.sendKeys(Keys.DELETE + each);
            //press login botton
            driver.findElement(By.className("login-btn")).click();
            //6 check for title if you are on the same page;
            if (driver.getTitle().contains(expectedTitle)) {
                System.out.println("Title verification passed!");
                //7.find the erroe web element
                WebElement errorEl = driver.findElement(By.className("errortext"));
                if (errorEl.getText().equals("Incorrect login or password")) {
                    System.out.println("The Error message is present!!");
                } else {
                    System.out.println("No Error Message");
                }
            } else {
                System.out.println("Title verification failed!");
            }

        }
        System.out.println();

        System.out.println("The wrong loging credentiantials,correct password");
        for (String wrongEach : wrongData) {
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
            Actions actions = new Actions(driver);
            actions.doubleClick(element).doubleClick(element).perform();
            Thread.sleep(1000);
            //5 sendKeys for the user name and for password
            element.sendKeys(Keys.DELETE + wrongEach + Keys.TAB + "UserUser" + Keys.ENTER);

            //6 check for title if you are on the same page;
            if (driver.getTitle().contains(expectedTitle)) {
                System.out.println("Title verification passed!");
                //7.find the erroe web element
                WebElement errorEl = driver.findElement(By.className("errortext"));
                if (errorEl.getText().equals("Incorrect login or password")) {
                    System.out.println("The Error message is present!!");
                } else {
                    System.out.println("No Error Message");
                }


            } else {
                System.out.println("Title verification failed!");
            }


        }
        System.out.println();

        System.out.println("The wrong loging credentiantials,wrong password");

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
        Actions actions = new Actions(driver);
        actions.doubleClick(element).doubleClick(element).perform();
        Thread.sleep(1000);
        //5 sendKeys for the user name and for password
        element.sendKeys(Keys.DELETE + "DoesntMAtter" + Keys.TAB + "wrong" + Keys.ENTER);

        //6 check for title if you are on the same page;
        if (driver.getTitle().contains(expectedTitle)) {
            System.out.println("Title verification passed!");
            //7.find the erroe web element
            WebElement errorEl = driver.findElement(By.className("errortext"));
            if (errorEl.getText().equals("Incorrect login or password")) {
                System.out.println("The Error message is present!!");
            } else {
                System.out.println("No Error Message");
            }


        } else {
            System.out.println("Title verification failed!");
        }


            System.out.println();
            System.out.println("The empty login , empty  password");

            //3 check if you are on the correct page
            expectedTitle = "Authorization";
            actualTitle = driver.getTitle();
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("On the correct Page");

            } else {
                System.out.println("Wrong page navigated to");
            }
                //4 find the web element to input the data
                 element = driver.findElement(By.name("USER_LOGIN"));
                actions = new Actions(driver);
                actions.doubleClick(element).doubleClick(element).perform();
                Thread.sleep(1000);
                //5 sendKeys for the user name and for password
                element.sendKeys(Keys.DELETE);
                //press login botton
                driver.findElement(By.className("login-btn")).click();
                //6 check for title if you are on the same page;
                if (driver.getTitle().contains(expectedTitle)) {
                    System.out.println("Title verification passed!");
                    //7.find the erroe web element
                    WebElement errorEl = driver.findElement(By.className("errortext"));
                    if (errorEl.getText().equals("Incorrect login or password")) {
                        System.out.println("The Error message is present!!");
                    } else {
                        System.out.println("No Error Message");
                    }


                } else {
                    System.out.println("Title verification failed!");
                }



            driver.close();
        }

        private static WebDriver getWebDriver () {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
    }
