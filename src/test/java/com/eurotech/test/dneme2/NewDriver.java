package com.eurotech.test.dneme2;

import com.eurotech.test.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewDriver extends TestBase {

    @Test

    public void test1(){

        WebDriver driver= Driver.get();
        driver.get(ConfigurationReader.get("url"));


    }

}
