package com.eurotech.test.day04_basic_locators;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDreiverFactory.getDriver("chrome");

        driver.get("http://eurotech.study/login");

        WebElement understand=driver.findElement(By.id("rcc-confirm-button"));
        understand.click();
        Thread.sleep(3000);


        WebElement loginButton=driver.findElement(By.id("loginpage-form-btn"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement emailAdresse=driver.findElement(By.name("email"));
        emailAdresse.sendKeys("ilhan@gmail.com");


        WebElement passord=driver.findElement(By.name("password"));
        passord.sendKeys("t123456");

        WebElement loginnButton=driver.findElement(By.id("loginpage-form-btn"));
        loginnButton.click();





    }
}
