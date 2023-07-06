package POM_Page;

import Utilities.DriverUtilies;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FacebookLoginPage {

    public FacebookLoginPage(){
        PageFactory.initElements(DriverUtilies.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logoEnable;




    public void loginPageTest1(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();
    }

    public void mainPageTestEanbleFBLogo(){
    logoEnable.isDisplayed();

    }





}
