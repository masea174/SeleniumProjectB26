package com.cydeo.test.day14_driverUtil_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
//whenever you need fake test data for your class
    @Test
    public void javaFakerTest(){

        Faker faker=new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify(\"802-###-####\") = " + faker.numerify("802-###-####"));

        System.out.println("faker.letterify(\"??????????????\") = " + faker.letterify("??????????????"));

    }
}
