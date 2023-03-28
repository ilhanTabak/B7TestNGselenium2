package com.eurotech.test.testNG_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTable {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void PrintTable() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.findElement(By.id("ez-accept-all")).click();
        WebElement demoTable = driver.findElement(By.xpath("//h3[.='Demo Table 2']"));
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",demoTable);

        List<WebElement> column = driver.findElements(By.xpath("//table[@border='1']/thead/tr/th"));
        System.out.println("column.size() = " + column.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@border='1']/tbody/tr"));
        System.out.println("rows.size() = " + rows.size());

        for (int i = 1; i <column.size() ; i++) {

            for (int j = 1; j <= rows.size() ; j++) {


            WebElement bkockName=driver.findElement(By.xpath("//table[@border='1']/tbody/tr["+j+"]/td["+i+"]"));
                System.out.println("bkockName.getText() = " + bkockName.getText());
            }
        }
        for (WebElement coo:column) {

            System.out.println("coo.getText() = " + coo.getText());

        }

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }
}
