package com.riyan.helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{

    @Before
    public void beforeTest() {
        getDriver(); // Initialize the WebDriver
    }

    @After
    public void afterTest() {
        closeDriver(); // Close and clean up the WebDriver
    }



}
