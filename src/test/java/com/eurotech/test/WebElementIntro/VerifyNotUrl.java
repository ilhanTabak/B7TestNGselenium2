package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyNotUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriver druver=WebDreiverFactory.getDriver("chrome");

        druver.get("http://eurotech.study/login");

        WebElement understand=druver.findElement(By.id("rcc-confirm-button"));
        understand.click();
        Thread.sleep(3000);


        WebElement loginButton=druver.findElement(By.id("loginpage-form-btn"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement email=druver.findElement(By.id("loginpage-input-email"));

        email.sendKeys("eurotech@gmail.com");


        WebElement password=druver.findElement(By.id("loginpage-form-pw-input"));

        password.sendKeys("Test12345!");

        WebElement LoginBtn=druver.findElement(By.id("loginpage-form-btn"));
        LoginBtn.click();


    }
}
