package com.sweetch.testing;

import com.sweetch.testing.pageObject.ApiDemosPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest extends BaseTest {

    @Test
    public void test() {

        boolean isChildCheckboxPreferenceSelected = new ApiDemosPageObject(driver)
                .clickOnPreference()
                .clickOnPreferencesFromXml()
                .scrollUp()
                .clickOnParentCheckboxPreference()
                .clickOnChildCheckboxPreference()
                .getChildCheckboxPreferenceState();

        Assert.assertTrue(isChildCheckboxPreferenceSelected);

    }
}
