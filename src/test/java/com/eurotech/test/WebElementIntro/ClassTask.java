package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
        Thread.sleep(2000);
        WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        Thread.sleep(2000);
        String actuel=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        Thread.sleep(2000);
        System.out.println(actuel);

        if(actuel.equals("\"selenium\"")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
