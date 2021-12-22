package com.sweetch.testing.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PreferencePageObject extends AbstractPageObject {

    public PreferencePageObject(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public PreferenceXmlPageObject clickOnPreferencesFromXml() {
        findAndClickOnElementByXpath("//*[@content-desc='1. Preferences from XML']");
        return new PreferenceXmlPageObject(driver);
    }

}
