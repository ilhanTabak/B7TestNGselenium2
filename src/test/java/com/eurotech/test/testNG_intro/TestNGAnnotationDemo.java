package com.eurotech.test.testNG_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {

    @Test
    public void test4(){

        System.out.println("assertion method");

        Assert.assertEquals("title","Title");


    }




}
