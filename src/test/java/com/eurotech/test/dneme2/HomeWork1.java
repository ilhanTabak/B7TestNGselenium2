package com.eurotech.test.dneme2;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeWork1 {

    //-----------------HOMEWORK 1------------------
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String ForgotPassword=driver.findElement(By.xpath("//h2[text()='Forgot Password']")).getText();

        String email=driver.findElement(By.xpath("//label[@for='email']")).getText();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ilhan@gmail.com");

        String RetrievePassword=driver.findElement(By.xpath("//i[text()='Retrieve password']")).getText();

        System.out.println(ForgotPassword);
        System.out.println(email);
        System.out.println(RetrievePassword);

    }
}
