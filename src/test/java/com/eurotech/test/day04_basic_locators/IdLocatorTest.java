package com.eurotech.test.day04_basic_locators;

import com.eurotech.utilities.WebDreiverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDreiverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");

        Faker faker=new Faker();

        WebElement inputUserName=driver.findElement(By.id("userName"));

        inputUserName.sendKeys(faker.name().fullName());
        Thread.sleep(2000);

        WebElement inputEmail=driver.findElement(By.id("userEmail"));

        inputEmail.sendKeys(faker.name().fullName());
        Thread.sleep(2000);

        driver.close();

    }
}
