package com.sweetch.testing.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PreferenceXmlPageObject extends AbstractPageObject {

    private static final String PARENT_PREFERENCE_CHECKBOX = "//*[@text='Parent checkbox preference']/../..//*[@resource-id='android:id/checkbox']";
    private static final String CHILD_PREFERENCE_CHECKBOX = "//*[@text='Child checkbox preference']/../..//*[@resource-id='android:id/checkbox']";

    public PreferenceXmlPageObject(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public PreferenceXmlPageObject clickOnParentCheckboxPreference() {
        findAndClickOnElementByXpath(PARENT_PREFERENCE_CHECKBOX);
        return this;
    }

    public PreferenceXmlPageObject clickOnChildCheckboxPreference() {
        findAndClickOnElementByXpath(CHILD_PREFERENCE_CHECKBOX);
        return this;
    }

    public boolean getChildCheckboxPreferenceState() {
        return findElementByXpath(CHILD_PREFERENCE_CHECKBOX)
                .getAttribute("checked")
                .equalsIgnoreCase("true");
    }

    public PreferenceXmlPageObject scrollUp() {
        super.scrollUp();
        return this;
    }

}
