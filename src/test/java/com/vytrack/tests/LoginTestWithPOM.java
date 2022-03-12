package com.vytrack.tests;


import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTestWithPOM extends TestBase {


    @Test
    public void login_test() {

        //goto login page
      loginPage.goToLoginPage();//called from 'VytrackLoginPage'
       //enter username
       loginPage.inputUsername.sendKeys
                (ConfigurationReader.getProperty("driver_username"));
       //enter password
        loginPage.inputPassword.sendKeys
                (ConfigurationReader.getProperty("driver_password"));
       //click login btn
       loginPage.loginButton.click();

//verify page header

        Boolean isDisplayedPageHeader=dashboardPage.pageHeader.isDisplayed();
        //called from DashboardPage
        Assert.assertTrue(isDisplayedPageHeader);

    }

    @Test
    public void login_test_with_method(){//instead of above
//goto login page
        loginPage.goToLoginPage();//called from 'VytrackLoginPage'
        //login method getting from VytrackLoginPage package includes all login credentials
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"),
                ConfigurationReader.getProperty("sales_manager_password") );

        //verify page header
        String expectedPageHeader = "Dashboard";
        String actualPageHeader = dashboardPage.pageHeader.getText();
        //getting text from header after login

        Assert.assertEquals(actualPageHeader, expectedPageHeader);
    }


    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
