package com.eurotech.test.dneme2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://eurotech.study/");
        Thread.sleep(3000);

        driver.get("https:\\www.google.com");
        //Thread.sleep(2000);
        driver.quit();

    }
}
