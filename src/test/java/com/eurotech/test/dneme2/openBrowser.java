package com.eurotech.test.dneme2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https:\\www.amazon.com");
        Thread.sleep(4000);
        driver.close();
        Faker faker=new Faker();

        System.out.println(faker.ancient().hero());


    }
}
