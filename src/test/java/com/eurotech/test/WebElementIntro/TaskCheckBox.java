package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskCheckBox {

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement sports = driver.findElement(By.id("hobbies-checkbox-1"));
        Assert.assertFalse(sports.isSelected());

        WebElement reading = driver.findElement(By.id("hobbies-checkbox-2"));
        Assert.assertFalse(reading.isSelected());

        WebElement music = driver.findElement(By.id("hobbies-checkbox-3"));
        Assert.assertFalse(music.isSelected());

        // Class Task
        // complete the task
        // click all the checkboxes
        // then assert that is selected or not

        // This webElement is NOT suitable to click
        //sports.click();

        WebElement sportsCheck= driver.findElement(By.cssSelector("[for='hobbies-checkbox-1']"));

        sportsCheck.click();
        Thread.sleep(2000);
        Assert.assertTrue(sports.isSelected(),"Verify that sport is selected");

        driver.close();

    }

}
