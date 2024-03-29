package com.eurotech.test.day20_DDF;

import com.eurotech.pages.DashBoardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {

    @DataProvider
    public Object [][] userData(){
        ExcelUtil testData = new ExcelUtil("src/test/resources/Batch7DevEx.xlsx","Test Data");
        return testData.getDataArrayWithoutFirstRow();
    }
    @Test(dataProvider = "userData")
    public void ddfLoginTest(String username, String password, String title, String company, String name){
        LoginPage loginPage = new LoginPage();
        DashBoardPage dashboardPage = new DashBoardPage();
        extentLogger = report.createTest(name+"'s Login Test");

        extentLogger.info("Click understand button");
        loginPage.understandBtn.click();

        extentLogger.info("Enter username");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter password");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click login button");
        loginPage.loginBtn.click();

        String expectedMessage = "Welcome "+name;
        extentLogger.info("Verify that the welcome message is "+expectedMessage);
        Assert.assertEquals(dashboardPage.welcomeMessage.getText(),expectedMessage);

        //Assert.assertEquals(dashboardPage.getTitle(title),title);
        Assert.assertEquals(dashboardPage.getCommonText(title),title);
        extentLogger.info("Verify that "+name+" is working in "+company);
        //Assert.assertEquals(dashboardPage.getCompany(company),company);
        Assert.assertEquals(dashboardPage.getCommonText(company),company);

        extentLogger.pass("PASSED");

    }
}
