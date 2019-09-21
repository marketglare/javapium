package com.company;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        AndroidDriver<AndroidElement> driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.54.102:5555");
        //capabilities.setCapability(MobileCapabilityType.APP,
	//"C:\\javapim\\jaqqa.apk");

        capabilities.setCapability("appPackage", "com.blacklist.start.blacklist"); //com.android.calculator2
        capabilities.setCapability("appActivity", "com.blacklist.start.blacklist.MainActivity"); //com.android.calculator2.Calculator;
        capabilities.setCapability("noReset", "true");

        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        //driver.findElementById("button4").click(); // продолжить?
        driver.findElementById("button").click(); // добавить номер
        driver.findElementById("phone").click(); // paste number, нажать на строку номера
        var a="+79213451818" ;
        driver.findElementById("phone").sendKeys(a); // ввести номер
        driver.findElementById("radioButton3").click(); //change ban to forever
        driver.findElementById("button3").click(); //click Add number
        driver.findElementByXPath("//android.widget.LinearLayout").findElementByXPath("//android.widget.TextView[@text='+79213451818']").click();
        driver.findElementByXPath("//android.widget.ListView").findElementByXPath("//android.widget.CheckedTextView[@text='24 часа']").click(); //checked 24hours
        driver.findElementById("button1").click(); // button Save
        driver.findElementByXPath("//android.widget.LinearLayout").findElementByXPath("//android.widget.TextView[@text='+79213451818']").click(); //check number again
        driver.findElementById("button2").click(); // delete number
        driver.findElementById("action_bar").findElementByXPath("//android.widget.ImageButton").click(); // go back
        driver.findElementById("action_settings").click(); // меню настройки
        driver.findElementByXPath("//android.widget.LinearLayout").findElementByXPath("//android.widget.TextView[@text='Изменить язык']").click(); //check number again
        driver.findElementById("spinner1").click();
        driver.findElementByXPath("//android.widget.ListView").findElementByXPath("//android.widget.TextView[@text='English']").click(); //check number again
        driver.findElementById("button4").click();
        /* write your code here
        перевел код с руби на джаву (аппиум) меньше чем за час. Джава круто :)
	    */
    }
}
