package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMesaj {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDreiverFactory.getDriver("chrome");

        driver.get("http://eurotech.study/login");

        WebElement understand=driver.findElement(By.id("rcc-confirm-button"));
        understand.click();
        Thread.sleep(3000);


        WebElement loginButton=driver.findElement(By.id("loginpage-form-btn"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement email=driver.findElement(By.id("loginpage-input-email"));

        email.sendKeys("eurotech@gmail.com");


        WebElement password=driver.findElement(By.id("loginpage-form-pw-input"));

        password.sendKeys("Test12345!");

        Thread.sleep(3000);
        WebElement LoginBtn=driver.findElement(By.id("loginpage-form-btn"));
        LoginBtn.click();

        Thread.sleep(3000);
        WebElement firstWord=driver.findElement(By.id("dashboard-p1"));
        String acteltext=firstWord.getAttribute("dashboard-user-icon");
        System.out.println(acteltext);

        Thread.sleep(3000);
         if(acteltext.equals("Welcome Teacher")){

            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }


    }
}
