package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtilies {

  private DriverUtilies(){

    }
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if ( driver== null){

            switch (ConfigurationReaderUtilies.getProperties("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    // burda BaseTest i yapmak daha mantikli , ozel bir class yapmaya gerek yok
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    // burda BaseTest i yapmak daha mantikli
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                default:
                    System.out.println("no find browser");
            }
        }
        return driver;
    }
    public static void TearDown() {
        if (driver!=null){
            driver.close();
            driver=null;

        }

    }
}
