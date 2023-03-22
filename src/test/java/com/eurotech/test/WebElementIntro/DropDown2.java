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

public class DropDown2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void test2() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);

       WebElement dropp= driver.findElement(By.cssSelector("[id=\"oldSelectMenu\"]"));

        Select select=new Select(dropp);

        List<WebElement>droppList=select.getOptions();
        System.out.println(droppList.size());

        for (WebElement webElement : droppList) {
            System.out.println(webElement.getText());

        }


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }



}
