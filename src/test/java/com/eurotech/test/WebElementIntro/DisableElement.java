package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableElement {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement disabledElement= driver.findElement(By.cssSelector("[type='text']"));
        Assert.assertFalse(disabledElement.isEnabled(),"Verify that the element is NOT enable or is disable");

        WebElement enableButton= driver.findElement(By.cssSelector("#input-example>button"));
        enableButton.click();

        // there is a process, so we need to wait for it
        Thread.sleep(4000);

        Assert.assertTrue(disabledElement.isEnabled(),"Verify that the element is enable");

        Thread.sleep(2000);
        driver.close();


    }
}
