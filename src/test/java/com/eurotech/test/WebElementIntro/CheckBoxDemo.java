package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox2= driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        WebElement checkBox1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        Assert.assertTrue(checkBox2.isSelected(),"Verify that the checkBox2 is selected");
        Assert.assertFalse(checkBox1.isSelected(),"Verify that the checkBox1 is NOT selected");

        Thread.sleep(2000);
        checkBox1.click();
        Thread.sleep(2000);
        checkBox2.click();

        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertFalse(checkBox2.isSelected());

        Thread.sleep(2000);

        driver.close();
    }
}