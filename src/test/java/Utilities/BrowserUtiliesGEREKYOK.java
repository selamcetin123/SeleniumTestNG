package Utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtiliesGEREKYOK {


    public static void theadMethod(int second){
       try {
           Thread.sleep(1000*second);
       }catch (InterruptedException e) {
           e.printStackTrace();
       }
    }

    public static void impicityMethod(){
        DriverUtilies.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void explicityMethod(){
        WebDriverWait driverWait=new WebDriverWait(DriverUtilies.getDriver(),Duration.ofSeconds(15));
    }


}
