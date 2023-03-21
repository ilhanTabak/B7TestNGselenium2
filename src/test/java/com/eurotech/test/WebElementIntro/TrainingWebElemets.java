package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TrainingWebElemets {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

       driver=WebDriverFactory.getDriver("chrome");

    }
    @Test
    public void test1() throws InterruptedException {

        driver.get("https://demo.aspnetawesome.com");
        Thread.sleep(2000);
        WebElement colorDropDown=driver.findElement(By.xpath("//div[text()='Mango']/.."));
        Thread.sleep(2000);
        //colorDropDown.click();
        Thread.sleep(2000);
        List<WebElement>listeler=driver.findElements(By.xpath("//ul/li/div[text()='Mango']/../.."));
        System.out.println(listeler.size());
        for (WebElement webElement : listeler) {
            System.out.println(webElement.getText());

        }


    }










    @AfterMethod

    public void tearDown() throws InterruptedException {


        Thread.sleep(2000);
    }
}
