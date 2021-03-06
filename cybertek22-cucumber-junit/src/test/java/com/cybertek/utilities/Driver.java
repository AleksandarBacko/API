package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){ }
    /*making our driver instance private so that is not reachable from outside of the class
     * we make it static because we want to run before everything else and we will use it in static method */
    private static ThreadLocal<WebDriver> driverPool=new ThreadLocal<>();
    /* creating re-usable utility method that will return same drivet instance everytime we call it  */
    public static WebDriver getDriver() {
        if (driverPool.get()==null){
            synchronized (Driver.class){
            /* we read our brwser type from configuration.properties file using .getProperty method we creating in ConfigurationReader class*/
            String browserType=ConfigurationReader.getProperty("browser");
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
            }
        }
        return driverPool.get();
    }


    public static void closeDriver(){
        if(driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
