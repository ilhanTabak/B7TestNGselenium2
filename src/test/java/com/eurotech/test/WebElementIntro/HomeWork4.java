package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class HomeWork4 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.cssSelector("[id='alertButton']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#timerAlertButton")).click();
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#confirmButton")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#promtButton")).click();
        driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("halloooooo");
        alert.accept();



    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
       // driver.close();
    }
}
