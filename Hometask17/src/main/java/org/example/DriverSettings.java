package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;
import java.time.Duration;



public class DriverSettings {
    @BeforeAll
    public static void setUp()throws MalformedURLException {
        AndroidDriver driver=DriverInitializer.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterAll
    public static void tearDown(){
        DriverInitializer.quitDriver();
    }
}
