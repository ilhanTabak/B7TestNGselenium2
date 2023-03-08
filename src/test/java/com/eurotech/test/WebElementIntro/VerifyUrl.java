package com.eurotech.test.WebElementIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://eurotech.study/login");


        WebElement understand=driver.findElement(By.id("rcc-confirm-button"));
        understand.click();
        Thread.sleep(3000);


        WebElement loginButton=driver.findElement(By.id("loginpage-form-btn"));
        loginButton.click();
        Thread.sleep(3000);




        driver.close();

    }
}
