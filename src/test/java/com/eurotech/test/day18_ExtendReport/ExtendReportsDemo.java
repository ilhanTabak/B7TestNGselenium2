package com.eurotech.test.day18_ExtendReport;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.eurotech.utilities.ConfigurationReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtendReportsDemo {

    ExtentReports report;
    ExtentHtmlReporter htmlReporter;

    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp(){
        report=new ExtentReports();

        String projectPath=System.getProperty("user.dir");

        String path=projectPath+"/test-output/report.html";
        htmlReporter= new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Eurotech smoke test");
        report.setSystemInfo("Environment","Production");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
        report.setSystemInfo("Test Engineer","Ilhan T");

    }

    @Test
    public void test1(){

        extentLogger=report.createTest("TC001 Login Test");

        extentLogger.info("Open the Browser");
        extentLogger.info("go to urlhttp:// eurotech.study/login");
        extentLogger.info("Login as teacher");
        extentLogger.info("Enter teacher userName");
        extentLogger.info("Enter teacher password");
        extentLogger.info("Click loggin button");
        extentLogger.info("Verify  login in");
        extentLogger.info("TC001 login Test is passed");

    }

    @AfterMethod
    public void tearDown(){

        report.flush();
    }
}
