package POM_Page;

import Utilities.DriverUtilies;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocateWebelement {

    public LocateWebelement() {
        PageFactory.initElements(DriverUtilies.getDriver(),this);
    }

    @FindBy(id ="twotabsearchtextbox")
    public WebElement login;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement movetoelement;


    @FindBy(xpath = "(//span[text()='Sign in'])[1]")
    public WebElement getLogin;






}
