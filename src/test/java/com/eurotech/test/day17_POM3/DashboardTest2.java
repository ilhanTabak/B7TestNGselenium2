package com.eurotech.test.day17_POM3;

import com.beust.ah.A;
import com.eurotech.pages.DashBoardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DashboardTest2 extends TestBase {

    DashBoardPage dashBoardPage=new DashBoardPage();


    LoginPage loginPage=new LoginPage();

    @Test
    public void verifyList() {
        driver.get(ConfigurationReader.get("url"));
        loginPage.login();
        String expectedMessage="Welcome Teacher";
        Assert.assertEquals(dashBoardPage.welcomeMessage.getText(),expectedMessage);

        List<String> expectedList=new ArrayList<>();
        expectedList.add("Developers");
        expectedList.add("All Posts");
        expectedList.add("My Account");

        List<String> actualList=new ArrayList<>();
        for (WebElement menu:dashBoardPage.menuList) {

            actualList.add(menu.getText());

        }
        Assert.assertEquals(actualList,expectedList);

    }

    @Test
    public void verifyList2() {
        //Use BrowserUtils in this test
        driver.get(ConfigurationReader.get("url"));
        loginPage.login();
        String expectedText = "Welcome Teacher";
        Assert.assertEquals(dashBoardPage.welcomeMessage.getText(),expectedText,"Verify that log in is successful");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Developers");
        expectedList.add("All Posts");
        expectedList.add("My Account");

        //1st way -- Lazy way
        //Assert.assertEquals(BrowserUtils.getElementsText(dashboardPage.menuList),expectedList);

        //2nd way
        List<String> actualList= BrowserUtils.getElementsText(dashBoardPage.menuList);
        Assert.assertEquals(actualList,expectedList);

    }
    @Test

    public void navigateToTest(){

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginAsTeacher();

        Actions actions1=new Actions(driver);
        actions1.moveToElement(dashBoardPage.myAccount).perform();
        dashBoardPage.myPosts.click();
        dashBoardPage.submit.isDisplayed();
        dashBoardPage.logOut.click();
        String url=driver.getCurrentUrl();
        String url2="http://eurotech.study/login";
        Assert.assertEquals(url,url2);





    }



    }


