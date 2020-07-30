package com.tcs.trainingxi.dafitimovil.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TheApp {
    private WebDriver driver;

    public static TheApp onThePhone(){
        return  new TheApp();
    }
    public WebDriver getDriver(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","Dafiti");
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("platformVersion","7.1.1");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("appPackage","br.com.dafiti");
        capabilities.setCapability("appActivity","br.com.dafiti.activity.SplashSelectCountry_");


             try{
                 //hub se encarga de crear sesiones
                 driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
             }
             catch (MalformedURLException e){
                 //implementacion logger
             }
                 return driver;
    }
}
