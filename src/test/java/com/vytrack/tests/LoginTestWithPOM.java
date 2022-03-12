package com.vytrack.tests;

import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTestWithPOM {

    @Test
    public void login_test() {
        VytrackLoginPage loginPage = new VytrackLoginPage();
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

    }


}
