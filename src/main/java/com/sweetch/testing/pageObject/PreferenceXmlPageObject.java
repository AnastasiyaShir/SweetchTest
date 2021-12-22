package com.sweetch.testing.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PreferenceXmlPageObject extends AbstractPageObject {

    public PreferenceXmlPageObject(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public PreferenceXmlPageObject clickOnParentCheckboxPreference() {
        findAndClickOnElementByXpath("//*[@text='Parent checkbox preference']/../..//*[@resource-id='android:id/checkbox']");
        return this;
    }

    public PreferenceXmlPageObject clickOnChildCheckboxPreference() {
        findAndClickOnElementByXpath("//*[@text='Child checkbox preference']/../..//*[@resource-id='android:id/checkbox']");
        return this;
    }

    public PreferenceXmlPageObject scrollUp() {
        super.scrollUp();
        return this;
    }

}
