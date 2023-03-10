package com.eurotech.test.day04_basic_locators;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class odev1 {
    public static void main(String[] args) {
        WebDriver driver= WebDreiverFactory.getDriver("chrome");
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement wort1=driver.findElement(By.tagName("h3"));
        System.out.println(wort1.getText());

        WebElement wort2=driver.findElement(By.tagName("p"));
        System.out.println(wort2.getText());
    }
}
