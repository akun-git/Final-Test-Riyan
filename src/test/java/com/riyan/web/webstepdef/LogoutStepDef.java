package com.riyan.web.webstepdef;

import com.riyan.helper.BaseTest;
import com.riyan.web.webpage.LogoutPage;
import io.cucumber.java.en.And;


public class LogoutStepDef extends BaseTest {

    LogoutPage logoutPage;

    @And("user click logout button")
    public void userClickLogoutButton() {
        logoutPage = new LogoutPage(driver);
        logoutPage.clickLogoutButton();
    }
}
