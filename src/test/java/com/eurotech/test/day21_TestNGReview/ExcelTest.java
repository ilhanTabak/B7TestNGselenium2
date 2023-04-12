package com.eurotech.test.day21_TestNGReview;

import com.eurotech.pages.DashBoardPage;
import com.eurotech.pages.ExelTestPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest extends TestBase {


    @DataProvider
    public Object [][] userData(){
        ExcelUtil testData = new ExcelUtil("src/test/resources/SwagLab.xlsx","Credentials");
        return testData.getDataArrayWithoutFirstRow();
    }
    @Test(dataProvider = "userData")
    public void ddfLoginTest(String username, String password,String Page){
        ExelTestPage exelTestPage=new ExelTestPage();

        extentLogger = report.createTest(username+"'s Login Test");

        driver.get("https://www.saucedemo.com/");

        extentLogger.info("Enter username");
        exelTestPage.username.sendKeys(username);

        extentLogger.info("Enter password");
        exelTestPage.password.sendKeys(password);

        extentLogger.info("Click login button");
        exelTestPage.loginButton.click();





    }





}
