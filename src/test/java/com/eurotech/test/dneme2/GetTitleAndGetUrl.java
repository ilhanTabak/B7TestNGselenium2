package com.eurotech.test.dneme2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //driver.navigate().to("https:\\www.eurotechstudy.com");
        driver.get("https://www.facebook.com");
        String expectedTitle="Facebook – Anmelden oder Registrieren";

       String realTitle=driver.getTitle();

       if(realTitle.equals(expectedTitle)){

           System.out.println("title ist pass");

       }else{
           System.out.println("title niicht pass");
       }

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);



    }
}
