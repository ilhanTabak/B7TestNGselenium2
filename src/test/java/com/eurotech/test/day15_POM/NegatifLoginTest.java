package com.eurotech.test.day15_POM;

import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegatifLoginTest extends TestBase {

    @Test
    public void wrongPassword() {
       /* driver.get(ConfigurationReader.get("url"));
        WebElement usernameInput = driver.findElement(By.id("loginpage-input-email"));
        WebElement passwordInput = driver.findElement(By.id("loginpage-form-pw-input"));
        usernameInput.sendKeys(ConfigurationReader.get("usernameTeacher"));
        passwordInput.sendKeys("invalid password");
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("loginpage-form-btn")).click();

        WebElement warningMessage = driver.findElement(By.xpath("//*[.='Invalid Credentials!']"));
        Assert.assertEquals(warningMessage.getText(), "Invalid Credentials!");*/
        driver.get(ConfigurationReader.get("url"));
        LoginPage loginPage=new LoginPage();
        loginPage.understandBtn.click();
        loginPage.usernameInput.sendKeys(("eurotechB7@gmail.com"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("passwordTeacher"));
        loginPage.loginBtn.click();
        String actuelMessage= loginPage.warningMessage.getText();
        System.out.println("actuelMessage = " + actuelMessage);
        Assert.assertEquals(actuelMessage,"Invalid Credentials!");




    }
}