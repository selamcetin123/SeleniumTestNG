package Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class BaseTestGEREKYOK {

    @BeforeMethod
    public static void setUp(){
        DriverUtilies.getDriver().manage().window().maximize();
        DriverUtilies.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
    @AfterMethod
    public static void closeBrowser() throws IOException {
        DriverUtilies.TearDown();


    }
}
