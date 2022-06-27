package com.cydeo.test.day18_review.O_H;

import com.cydeo.test.utilities.Driver;
import org.testng.annotations.Test;

public class JST1 {

    @Test
    public void javaExecuterExample(){
//        Task 1
//
//
//                - Go to  "https://techcrunch.com/"
        Driver.getDriver().get("https://techcrunch.com/");
//                - Click TechCrunch from Footer > About > TechCrunch

//                - Verify title contains "TechCrunch"
    }
}
