package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReaderUtilies {

    private static Properties properties;


    static  {
        properties=new Properties();

        try {
            FileInputStream fileInputStream=new FileInputStream("configuration.properties"); // you can check exception compile exception
            properties.load(fileInputStream);
        } catch (IOException e) {
                e.printStackTrace();
        }

    }
    public static String getProperties(String str) {

        return properties.getProperty(str);
    }


}
