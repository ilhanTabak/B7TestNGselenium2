package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;
    @FindBy(id = "loginpage-input-email")
    public WebElement usernameInput;
    @FindBy(id = "loginpage-form-pw-input")
    public WebElement passwordInput;
    @FindBy(id = "loginpage-form-btn")
    public WebElement loginBtn;
    @FindBy(xpath = "//*[.='Invalid Credentials!']")
    public WebElement warningMessage;

    @FindBy(id="dashboard-h1")
    public WebElement dashboardText;

    public void login(){

        usernameInput.sendKeys(ConfigurationReader.get("usernameTeacher"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordTeacher"));
        understandBtn.click();
        loginBtn.click();

    }

    public void login(String userEmail,String password){

        usernameInput.sendKeys(userEmail);
        passwordInput.sendKeys(password);
        understandBtn.click();
        loginBtn.click();

    }

    public void loginAsStudent(){

        usernameInput.sendKeys(ConfigurationReader.get("usernameStudent"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordStudent"));
        understandBtn.click();
        loginBtn.click();
    }



    public void loginAsDeveloper(){

        usernameInput.sendKeys(ConfigurationReader.get("usernameDeveloper"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordDeveloper"));
        understandBtn.click();
        loginBtn.click();
    }



}


