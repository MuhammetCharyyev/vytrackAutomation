package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US1_Test_MainModules extends TestBase {
//login as sales manager
    @Test
    public void verifying_modules_sales_man() {
        VytrackUtils.loginAsSalesManager();//called method to login from 'VytrackUtils'
      List<WebElement> moduleElements = Driver.getDriver().findElements
              ((By.xpath("//span[@class='title title-level-1']")) );

      List<String> actualMuduleTexts = new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualMuduleTexts.add(moduleElementText);
        }
       // System.out.println("actualMuduleTexts = " + actualMuduleTexts);
        //printed-> actualMuduleTexts = [Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System]

  //  moduleElements.forEach(k->actualMuduleTexts.add(k.getText()));
    //same as above but more professional way to iterate each ModuleText
        // using the lambda expression

        System.out.println("actualMuduleTexts = " + actualMuduleTexts);
        List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                "Dashboards",
                "Fleet",
                "Customers",
                "Sales",
                "Activities",
                "Marketing",
                "Reports & Segments",
                "System"        ));

        Assert.assertEquals(actualMuduleTexts, expectedModuleTexts);
    }
    //login as store manager
    @Test
    public void verifying_modules_store_man() {
        VytrackUtils.loginAsStoreManager();//called method to login from 'VytrackUtils'
        List<WebElement> moduleElements = Driver.getDriver().findElements
                ((By.xpath("//span[@class='title title-level-1']")) );

        List<String> actualMuduleTexts = new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualMuduleTexts.add(moduleElementText);
        }
        // System.out.println("actualMuduleTexts = " + actualMuduleTexts);
        //printed-> actualMuduleTexts = [Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System]

        //  moduleElements.forEach(k->actualMuduleTexts.add(k.getText()));
        //same as above but more professional way to iterate each ModuleText
        // using the lambda expression

        System.out.println("actualMuduleTexts = " + actualMuduleTexts);
        List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                "Dashboards",
                "Fleet",
                "Customers",
                "Sales",
                "Activities",
                "Marketing",
                "Reports & Segments",
                "System"        ));

        Assert.assertEquals(actualMuduleTexts, expectedModuleTexts);

    }
//login as driver
    @Test
    public void verifying_modules_driver() {
        VytrackUtils.loginAsDriver();//called method to login from 'VytrackUtils'
        List<WebElement> moduleElements = Driver.getDriver().findElements
                ((By.xpath("//span[@class='title title-level-1']")) );

        List<String> actualMuduleTexts = new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualMuduleTexts.add(moduleElementText);
        }
        // System.out.println("actualMuduleTexts = " + actualMuduleTexts);
        //printed-> actualMuduleTexts = [Fleet, Customers, Activities, System]

        //  moduleElements.forEach(k->actualMuduleTexts.add(k.getText()));
        //same as above but more professional way to iterate each ModuleText
        // using the lambda expression

        System.out.println("actualMuduleTexts = " + actualMuduleTexts);
        List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                "Fleet",
                "Customers",
                "Activities",
                "System"        ));
//for drivers module should be shorter
        Assert.assertEquals(actualMuduleTexts, expectedModuleTexts);

    }
}
