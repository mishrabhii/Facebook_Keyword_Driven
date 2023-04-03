package com.bridgelabz.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    WebDriver driver;
    Properties prop;

    public  WebDriver init_driver(String browserName){
        ChromeOptions options = new ChromeOptions();
        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            if(prop.getProperty("headless").equals("yes")){
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            }else {
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            }
        }
        return driver;
    }
    public Properties init_Properties() throws FileNotFoundException {
        prop = new Properties();
        try{
            FileInputStream ip = new FileInputStream("/Users/atulnigam/Documents/Abhishek_IntelliJ_Workshop/CFP-216-KeyDriven-FaceBook/src/main/java/com/bridgelabz/configration/data.properties");
            prop.load(ip);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
}


