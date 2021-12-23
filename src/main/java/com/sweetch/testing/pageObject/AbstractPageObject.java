package com.sweetch.testing.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class AbstractPageObject {

    protected AppiumDriver<MobileElement> driver;

    public AbstractPageObject(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    protected MobileElement findElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    protected void findAndClickOnElementByXpath(String xpath) {
        MobileElement element = findElementByXpath(xpath);
        element.click();
    }

    public AbstractPageObject scrollUp() {
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

        return this;
    }
}
