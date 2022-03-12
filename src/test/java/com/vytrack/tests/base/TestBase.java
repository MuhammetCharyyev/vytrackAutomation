package com.vytrack.tests.base;


import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    public VytrackLoginPage loginPage;
    public DashboardPage dashboardPage;
    @BeforeMethod
    public void setUp() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //called method from 'Driver' Utils and config.prop
        System.out.println("Test is started");
        loginPage = new VytrackLoginPage();
        dashboardPage = new DashboardPage();
            }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();//called method from 'Driver' Utils
    }
}
