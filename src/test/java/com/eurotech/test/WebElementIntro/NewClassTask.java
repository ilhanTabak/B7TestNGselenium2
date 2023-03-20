package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewClassTask {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().window().maximize();

        String helloWorld="Hello World!";

        WebElement StartBlock = driver.findElement(By.cssSelector("[id='start']"));
        String Block=StartBlock.getText();
        Assert.assertNotEquals(Block,helloWorld);
        Thread.sleep(2000);

        WebElement StButton = driver.findElement(By.cssSelector("#start>button"));
        StButton.click();
        Thread.sleep(5000);

        WebElement HeWorld=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        Assert.assertTrue(HeWorld.isDisplayed());

        Thread.sleep(2000);
        System.out.println();
        Assert.assertEquals(HeWorld.getText(),helloWorld);

        Thread.sleep(2000);
        driver.close();


    }
}
