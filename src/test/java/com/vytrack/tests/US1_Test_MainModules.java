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
//testing modules as sales manager
    @Test
    public void verifying_modules_sales_man() {
        VytrackUtils.loginAsSalesManager();//called method to login from 'VytrackUtils'
      List<WebElement> moduleElements = Driver.getDriver().findElements
              ((By.xpath("//span[@class='title title-level-1']")) );

      //creating ArrayList for all actual module elements
      List<String> actualModuleTexts = new ArrayList<>();
//iterating all module elements
        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            //get text of all module elements
            actualModuleTexts.add(moduleElementText);
            //adding text of all module elements to our created ArrList
        }

  //  moduleElements.forEach(w->actualModuleTexts.add(w.getText()));
    //same as above but more professional way to iterate each ModuleText
        // using the lambda expression

        System.out.println("actualModuleTexts = " + actualModuleTexts);

  // creating ArrayList for all module elements as expected
        List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                "Dashboards", "Fleet", "Customers","Sales", "Activities",
                "Marketing","Reports & Segments", "System" ));

        Assert.assertEquals(actualModuleTexts, expectedModuleTexts);
    }

    //testing modules as store manager
    @Test
    public void verifying_modules_store_man() {
        VytrackUtils.loginAsStoreManager();//called method to login from 'VytrackUtils'
        List<WebElement> moduleElements = Driver.getDriver().findElements
                ((By.xpath("//span[@class='title title-level-1']")) );

        //creating ArrayList for all actual module elements
        List<String> actualModuleTexts = new ArrayList<>();
//iterating all module elements
        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            //get text of all module elements
            actualModuleTexts.add(moduleElementText);
            //adding text of all module elements to our created ArrList
        }

        //  moduleElements.forEach(w->actualModuleTexts.add(w.getText()));
        //same as above but more professional way to iterate each ModuleText
        // using the lambda expression

        System.out.println("actualModuleTexts = " + actualModuleTexts);

        // creating ArrayList for all module elements as expected
        List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                "Dashboards", "Fleet", "Customers","Sales", "Activities",
                "Marketing","Reports & Segments", "System" ));

        Assert.assertEquals(actualModuleTexts, expectedModuleTexts);
    }

//testing modules as driver
    @Test
    public void verifying_modules_driver() {
        VytrackUtils.loginAsDriver();//called method to login from 'VytrackUtils'
        List<WebElement> moduleElements = Driver.getDriver().findElements
                ((By.xpath("//span[@class='title title-level-1']")) );

        //creating ArrayList for all actual module elements
        List<String> actualModuleTexts = new ArrayList<>();
//iterating all module elements
        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            //get text of all module elements
            actualModuleTexts.add(moduleElementText);
            //adding text of all module elements to our created ArrList
        }

        //  moduleElements.forEach(w->actualModuleTexts.add(w.getText()));
        //same as above but more professional way to iterate each ModuleText
        // using the lambda expression

        System.out.println("actualModuleTexts = " + actualModuleTexts);
        List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                "Fleet", "Customers","Activities","System" ));
//for drivers module should be shorter
        Assert.assertEquals(actualModuleTexts, expectedModuleTexts);

    }
}
