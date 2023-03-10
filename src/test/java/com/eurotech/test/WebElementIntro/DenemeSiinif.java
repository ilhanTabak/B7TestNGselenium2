package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DenemeSiinif {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDreiverFactory.getDriver("chrome");
        driver.get("https://www.instagram.com");

        WebElement cerez=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/button[2]"));
        Thread.sleep(2000);
        cerez.click();



    }
}
