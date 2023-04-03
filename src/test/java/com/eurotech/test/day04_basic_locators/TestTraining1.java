package com.eurotech.test.day04_basic_locators;

import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestTraining1 extends TestBase {

    @Test

            public void test1() throws InterruptedException {

        WebDriver driver= Driver.get();
        driver.get(ConfigurationReader.get("url"));
        LoginPage loginPage=new LoginPage();
        Thread.sleep(2000);
        //loginPage.understandBtn.click();
        loginPage.warningMessage.click();


    }





}
