package RegularTestStepDefination;

import ScreenShotAndExcelFile.ScreenSh1;
import Utilities.DriverUtilies;
import org.testng.Assert;

import java.io.IOException;

public class TestCase1 {


    public static void main(String[] args) throws IOException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.com/");GIT

        DriverUtilies.getDriver().get("https://www.amazon.com");

        String expectdata="Amazon.com. Spend less. Smile more.";
        String actualdata=DriverUtilies.getDriver().getTitle();
        System.out.println("actual data "+actualdata);

        Assert.assertEquals(actualdata,expectdata);



        // locater names
        // ID
        // NAME
        // TAGNAME
        // CLASSNAME
        //LINKTEXT
        // PARTIALLIK

        // TWO SPEACILE LOCATER
        //
        //

    }
}
