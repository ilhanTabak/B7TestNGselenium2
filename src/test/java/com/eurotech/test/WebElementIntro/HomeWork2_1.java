package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//-----------------HOMEWORK2--TestCase1-----------------------------
public class HomeWork2_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.de/");
        Thread.sleep(2000);
        WebElement searchBox=driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("java");
        Thread.sleep(2000);
        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement numberOfRsult=driver.findElement(By.className("srp-controls__count-heading"));
        String results=numberOfRsult.getText();
        System.out.println(results);
        Thread.sleep(2000);
        driver.close();
    }
}
