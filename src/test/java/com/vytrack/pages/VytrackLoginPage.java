package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage(){
//initElement will create connection between the current driver session(instance)
        //and the object of current class
        PageFactory.initElements(Driver.getDriver(), this);
        // from PageFactory library// 'this' referring to this class itself
 //expression in () is saying "take 'Driver.getDriver()' and place to 'this' class"
    }

    @FindBy(className = "title")//locating 'loading' function
    public WebElement loadingLabel;

    @FindBy(id = "prependedInput")//locating 'username' field
    public WebElement inputUsername;

    @FindBy(css = "input[id='prependedInput2']")//locating 'password' field
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@id='_submit']")//locate 'submit' button
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeMessage;//locating 'error' message

    public void goToLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

public void login(String userName, String password){
   goToLoginPage();
   inputUsername.sendKeys(userName);
    BrowserUtils.sleep(2);
    inputPassword.sendKeys(password);
    BrowserUtils.sleep(2);
    loadingLabel.click();

}

}
