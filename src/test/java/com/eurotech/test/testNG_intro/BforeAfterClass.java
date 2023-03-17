package com.eurotech.test.testNG_intro;

import org.testng.annotations.*;

public class BforeAfterClass {
    @Test

    public void Test1(){
        System.out.println("mey First test");


    }

    @BeforeMethod
    public void setup(){

        System.out.println("before method");
    }

    @Test
    public void test3() {

        System.out.println("My First Tes Case");
    }
    @Test

    public void test2(){

        System.out.println("My Secon Test Case");
    }

    @AfterMethod
    public void teardown(){

        System.out.println("after method");
    }

    @BeforeClass

    public void setupXClass(){

        System.out.println("----before class-----");

    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("------afterclass------");
    }
}
