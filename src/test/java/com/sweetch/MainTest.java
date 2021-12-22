package com.sweetch;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MainTest {

    AppiumDriver<MobileElement> driver;

    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");


        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);


        MobileElement preferenceElement = driver.findElement(By.xpath("//*[@content-desc='Preference']"));
        preferenceElement.click();

        MobileElement preferenceXmlElement = driver.findElement(By.xpath("//*[@content-desc='1. Preferences from XML']"));
        preferenceXmlElement.click();

        Dimension dimension = driver.manage().window().getSize();

        int fromX = dimension.width / 2;
        int toX = dimension.width / 2;

        int fromY = (int) (dimension.height * 0.8);
        int toY = (int) (dimension.height * 0.2);

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(fromX, fromY))
                .moveTo(PointOption.point(toX, toY))
                .release()
                .perform();


        MobileElement parentCheckbox = driver.findElement(By.xpath("//*[@text='Parent checkbox preference']/../..//*[@resource-id='android:id/checkbox']"));
        parentCheckbox.click();
        MobileElement childCheckbox = driver.findElement(By.xpath("//*[@text='Child checkbox preference']/../..//*[@resource-id='android:id/checkbox']"));
        childCheckbox.click();


    }
}
