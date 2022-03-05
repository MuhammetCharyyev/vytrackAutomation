package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.VytrackUtils;
import org.testng.annotations.Test;

public class US1_Test_MainModules extends TestBase {

    @Test
    public void verifying_modules_sales_man() {
        VytrackUtils.loginAsSalesManager();//called method to login from 'VytrackUtils'
    }
}
