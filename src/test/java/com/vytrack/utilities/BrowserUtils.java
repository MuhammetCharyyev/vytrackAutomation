package com.vytrack.utilities;

/*
In this class only general utility methods that are not related to some specific page
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     */

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }
    }

     /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */

    public static void switchWindowAndVerify (WebDriver driver, String expectedInURL, String expectedTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL is : " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    /*
 This method accepts a String "expectedTitle" and Asserts if it is true
  */
    public static void verifyTitle (WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    //Create hover(WebElement element) method, hovering the required place

public static void hover(WebElement element){
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(element).pause(3).perform();
    //(element) is changeable as we need
}

    //Create scrollToElement(WebElement element) method
    public static void scrollToElement (WebElement element1){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("argument[0].scrollIntoView(true);", element1);
    }

    //Create waituntilTitleDisplay(String title) method
    public static void waitUntilTitleDisplay (String title){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        //if only contains title
        wait.until(ExpectedConditions.titleContains(title));
        //exact matching title
        wait.until(ExpectedConditions.titleIs(title));
    }


    //Create waituntilInvisibilityOfElement(WebElement element,int timeout) method

    public static void waitUntilInvisibilityOfElement(WebElement element,int timeout){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        //'timeout' is to enter customer data for wait
        wait.until(ExpectedConditions.invisibilityOf(element));
        //wait while the customer element will be invisible
    }

    //Create doubleClick(WebElement element) method
    public static void doubleClick(WebElement element){
        new Actions(Driver.getDriver()).doubleClick(element).perform();
        //method for double clicking customer element

    }


}

  /*
    1. Create a new class called BrowserUtils
    2. Create a method to make Task1 logic re-usable
    3. When method is called, it should switch window and verify title.


    Method info:
    • Name: switchWindowAndVerify
    • Return type: void
    • Arg1: WebDriver
    • Arg2: String expectedInUrl
    • Arg3: String expectedTitle
     */
