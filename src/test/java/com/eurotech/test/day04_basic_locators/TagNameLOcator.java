package com.eurotech.test.day04_basic_locators;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLOcator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDreiverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");


        WebElement understandBtn = driver.findElement(By.id("rcc-confirm-button"));
        understandBtn.click();

        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("eurotech@gmail.com");

        //1st way
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("Test12345!");

        //2nd way-lazy way
        //driver.findElement(By.name("password")).sendKeys("Test12345!");

        //1st way
        WebElement loginButton= driver.findElement(By.id("loginpage-form-btn"));
        loginButton.click();

        //2nd way-lazy way
        //driver.findElement(By.id("loginpage-form-btn")).click();

        Thread.sleep(2000);

        WebElement verifyExperinceCredentials=driver.findElement(By.tagName("h2"));
        System.out.println(verifyExperinceCredentials.getText());

        driver.close();

    }
}