package com.eurotech.test.dneme2;

import com.eurotech.utilities.WebDreiverFactory;
import org.openqa.selenium.WebDriver;

public class CallDriverFactory {
    public static void main(String[] args) {

        WebDriver driver=WebDreiverFactory.getDriver("chrome");
       driver.get("http://eurotech.study/");
       String gercekTitle=driver.getTitle();
       String expectedTitle="DevEx";

       if(gercekTitle.equals(expectedTitle)){

           System.out.println("passed");
       }
       else{
           System.out.println("Failed");
       }


    }
}
