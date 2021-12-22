package com.sweetch.testing.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ApiDemosPageObject extends AbstractPageObject {

    public ApiDemosPageObject(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public PreferencePageObject clickOnPreference() {
        findAndClickOnElementByXpath("//*[@content-desc='Preference']");
        return new PreferencePageObject(driver);
    }
}
