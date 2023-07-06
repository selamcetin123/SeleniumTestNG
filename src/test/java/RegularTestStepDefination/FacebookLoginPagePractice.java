package RegularTestStepDefination;

import POM_Page.FacebookLoginPage;
import Utilities.BrowserUtiliesGEREKYOK;
import Utilities.ConfigurationReaderUtilies;
import Utilities.DriverUtilies;
import org.testng.annotations.Test;

public class FacebookLoginPagePractice {

    FacebookLoginPage facebookLoginPage=new FacebookLoginPage();

    @Test
    public void loginPageTest1(){
        DriverUtilies.getDriver().get(ConfigurationReaderUtilies.getProperties("URL"));
        BrowserUtiliesGEREKYOK.theadMethod(3);

     facebookLoginPage.loginPageTest1(ConfigurationReaderUtilies.getProperties("username"),ConfigurationReaderUtilies.getProperties("password"));

        BrowserUtiliesGEREKYOK.theadMethod(3);

//        facebookLoginPage.mainPageTestEanbleFBLogo();
    }
}
