package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class deneme5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void testhover() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/hovers");
        List<WebElement> imgs = driver.findElements(By.cssSelector("[class='figure']"));
        Actions actions=new Actions(driver);
        String viewPro="View profile";

        for (int i = 0; i < imgs.size() ; i++) {
            actions.moveToElement(imgs.get(i)).perform();
            Thread.sleep(2000);
            Assert.assertEquals(driver.findElement(By.xpath("(//a[.='View profile'])["+(i+1)+"]")).getText(),viewPro);
        }
        }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
