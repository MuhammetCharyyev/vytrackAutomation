package com.vytrack.tests.base;


import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //called method from 'Driver' Utils and config.prop
            }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();//called method from 'Driver' Utils
    }
}
