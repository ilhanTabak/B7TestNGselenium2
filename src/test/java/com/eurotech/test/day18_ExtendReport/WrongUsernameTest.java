package com.eurotech.test.day18_ExtendReport;

import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WrongUsernameTest extends TestBase {

    @Test
    public void wrongUserName(){

        LoginPage loginPage=new LoginPage();

        extentLogger=report.createTest("wrong username test");
         driver.get(ConfigurationReader.get("url"));
        extentLogger.info("click understand button");
        loginPage.understandBtn.click();
        extentLogger.info("enter wrong user email");
        loginPage.usernameInput.sendKeys("ilhan@gmail.com");
        extentLogger.info("enter correct password");
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("passwordTeacher"));
        extentLogger.info("click loggin button");
        loginPage.loginBtn.click();

        String actuelMessage=loginPage.warningMessage.getText();
        extentLogger.info("Verify that not log in");
        Assert.assertEquals(actuelMessage,"invalid credantiel");




    }
}
