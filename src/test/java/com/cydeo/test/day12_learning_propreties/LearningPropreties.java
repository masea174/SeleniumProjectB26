package com.cydeo.test.day12_learning_propreties;

import org.testng.annotations.Test;

public class LearningPropreties {


    @Test
    public void javaPropertiesReadingTest(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}
