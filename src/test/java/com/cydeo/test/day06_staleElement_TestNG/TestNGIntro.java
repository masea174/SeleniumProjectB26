package com.cydeo.test.day06_staleElement_TestNG;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntro {
    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class is running...");
    }


    @Test(priority=2)
    public void test1(){
        System.out.println("Test 1 is running...");
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);

    }
    @ Test (priority=1,dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Test 2 is running...");
        Assert.assertEquals("orange","orange");
    }
    @Test
    public void test3(){
        System.out.println("Test 3 is running ...");
    }
    @BeforeMethod

    public void setUpMethod(){
        System.out.println("Before method is running...");
    }
    @AfterMethod

    public void tearDownMethod(){
        System.out.println("After method is Running...");
    }

}
