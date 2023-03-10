package com.eurotech.test.day04_basic_locators;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTestAndPartikalTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDreiverFactory.getDriver("chrome");
        driver.get("http://the-internet.herokuapp.com/dynamic_loading");
        Thread.sleep(3000);
        WebElement example1=driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        example1.click();
        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        WebElement example2=driver.findElement(By.partialLinkText("Example 2"));
        example2.click();
    }
}
