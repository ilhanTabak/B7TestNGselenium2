package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDreiverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class odev2 {

    public static void main(String[] args) throws InterruptedException {

        Faker faker=new Faker();
        WebDriver driver = WebDreiverFactory.getDriver("chrome");
        driver.get(" https://www.browserstack.com/users/sign_up");

                driver.manage().window().maximize();


        WebElement AButton = driver.findElement(By.id("accept-cookie-notification"));
        AButton.click();
        Thread.sleep(3000);

        WebElement UserName = driver.findElement(By.id("user_full_name"));
        UserName.sendKeys(faker.name().fullName());
        Thread.sleep(3000);

        WebElement Email = driver.findElement(By.id("user_email_login"));
        Email.sendKeys(faker.internet().emailAddress());
        Thread.sleep(3000);

        WebElement Password = driver.findElement(By.id("user_password"));
        Password.sendKeys(faker.internet().password());
        Thread.sleep(3000);

        WebElement Checkbox = driver.findElement(By.id("tnc_checkbox"));
        Checkbox.click();

        Thread.sleep(3000);

        driver.close();
    }
}
