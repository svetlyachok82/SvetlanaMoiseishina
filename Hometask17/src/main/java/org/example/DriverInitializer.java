package org.example;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class DriverInitializer {
    public static AndroidDriver driver;
    public static AndroidDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }
    public static void initDriver(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy A50");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "Appium");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
    public static void quitDriver(){
        driver.quit();
    }
}

