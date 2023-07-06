package ScreenShotAndExcelFile;

import Utilities.DriverUtilies;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenSh1 {






    @Test
    public static void screenShot() throws IOException {

       try {
           TakesScreenshot takesScreenshot= (TakesScreenshot) DriverUtilies.getDriver();

           File geciciscreen=takesScreenshot.getScreenshotAs(OutputType.FILE);

           File tumsayfascreenshot=new File("target/ekranresimleri/tumsayfa.png");

           FileUtils.copyFile(geciciscreen,tumsayfascreenshot);
       }catch (IOException e){
           e.printStackTrace();
       }

    }
}
