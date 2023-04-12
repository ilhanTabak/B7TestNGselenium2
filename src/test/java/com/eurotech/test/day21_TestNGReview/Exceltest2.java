package com.eurotech.test.day21_TestNGReview;

import com.aventstack.extentreports.ExtentReports;
import com.eurotech.pages.ExelTestPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.Provider;

public class Exceltest2 extends TestBase {


    @DataProvider
    public Object[][] newTest(){

        ExcelUtil testData=new ExcelUtil("src/test/resources/SwagLab.xlsx","Credentials");
        return testData.getDataArrayWithoutFirstRow();

    }
    @Test(dataProvider="newTest")
    public void Test2(String Username,String Password,String Page){
        ExelTestPage exelTestPage=new ExelTestPage();
        extentLogger=report.createTest("falan filan");
        driver.get("https://www.saucedemo.com/");
        extentLogger.info("test devam ediyor");
        exelTestPage.username.sendKeys(Username);
        exelTestPage.password.sendKeys(Password);
        exelTestPage.loginButton.click();






    }

}
