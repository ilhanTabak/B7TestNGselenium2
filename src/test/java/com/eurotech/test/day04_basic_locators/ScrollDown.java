package com.eurotech.test.day04_basic_locators;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScrollDown {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void testhover() throws InterruptedException {

        driver.get("https://www.amazon.com.tr");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class=\'a-button a-button-primary\']")).click();
        Thread.sleep(2000);
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1250)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-500)");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}



