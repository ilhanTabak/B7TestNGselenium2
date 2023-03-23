package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindowTraining {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @Test
    public void test2() {

        driver.get("https://the-internet.herokuapp.com/windows");

        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        driver.findElement(By.xpath("//a[.='Click Here']")).click();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());


        Set<String> windowHandels=driver.getWindowHandles();

        for (String windowHandel : windowHandels) {

            if(!windowHandel.equals(driver.getWindowHandle())){
                driver.switchTo().window(windowHandel);
                break;
            }


        }


    }




    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
       // driver.close();
    }
}
