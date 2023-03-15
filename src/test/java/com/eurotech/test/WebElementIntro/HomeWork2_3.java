package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//-----------------HOMEWORK2--TestCase3-----------------------------
public class HomeWork2_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        WebElement searchBox=driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("selenium webdriver");
        Thread.sleep(2000);
        WebElement searchButton=driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement selenium=driver.findElement(By.cssSelector("[class='searchmatch']"));
        selenium.click();
        Thread.sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
       if((url.toLowerCase().substring(url.length()-8,url.length()).equals("selenium"))){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}