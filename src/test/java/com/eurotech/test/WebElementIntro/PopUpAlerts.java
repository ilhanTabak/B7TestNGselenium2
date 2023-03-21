package com.eurotech.test.WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpAlerts {

        WebDriver driver;

        @BeforeMethod
        public void setUp(){
            driver= WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

        }

        @Test
        public void popUp() throws InterruptedException {
            driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=37ab5");

            //click the Confirm Button
            driver.findElement(By.xpath("//span[.='Confirm']")).click();

            driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();
            Thread.sleep(2000);

            String expectedMessage="You have accepted";
            WebElement actualMessage = driver.findElement(By.xpath("//p[text()='You have accepted']"));
            Assert.assertEquals(actualMessage.getText(),expectedMessage);

        }

        @Test
        public void jsAlerts() throws InterruptedException {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            Thread.sleep(2000);

            //click => Click for JS Alert
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            //e.g. : switch to JS alert button
            Alert alert=driver.switchTo().alert();
            Thread.sleep(2000);
            //click to OK
            alert.accept();
            Thread.sleep(1000);


            //click => Click for JS Confirm
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            Thread.sleep(2000);
            //click to cancel
            alert.dismiss();

            //click=> Click for JS Prompt
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            Thread.sleep(1000);
            //send keys to JS Prompt
            alert.sendKeys("B7 is here");
            Thread.sleep(1000);
            alert.accept();

            //homework : verify all result above JS alerts
            //home task : https://demoqa.com/alerts
        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(4000);
            driver.close();
        }
    }

