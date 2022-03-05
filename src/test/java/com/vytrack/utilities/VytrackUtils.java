package com.vytrack.utilities;

import org.openqa.selenium.By;

public class VytrackUtils {


    public static void login(String username, String password){
        //1.go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //called method from 'Driver' Utils and config.prop

        //2.insert username, password, click login
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);
        Driver.getDriver().findElement(By.tagName("button")).click();

    }

    public static void loginAsDriver (){
        //1.go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //called method from 'Driver' Utils and config.prop

        //2.insert username, password, click login
        Driver.getDriver().findElement(By.id("prependedInput")).
                sendKeys(ConfigurationReader.getProperty("driver_username"));
        //called method from 'Driver' Utils and config.prop

        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).
                sendKeys(ConfigurationReader.getProperty("driver_password"));
        //called method from 'Driver' Utils and config.prop

        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsStoreManager (){
        //1.go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //called method from 'Driver' Utils and config.prop

        //2.insert username, password, click login
        Driver.getDriver().findElement(By.id("prependedInput")).
                sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        //called method from 'Driver' Utils and config.prop

        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).
                sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        //called method from 'Driver' Utils and config.prop

        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsSalesManager (){
        //1.go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //called method from 'Driver' Utils and config.prop

        //2.insert username, password, click login
        Driver.getDriver().findElement(By.id("prependedInput")).
                sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        //called method from 'Driver' Utils and config.prop

        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).
                sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        //called method from 'Driver' Utils and config.prop

        Driver.getDriver().findElement(By.tagName("button")).click();
    }



}
