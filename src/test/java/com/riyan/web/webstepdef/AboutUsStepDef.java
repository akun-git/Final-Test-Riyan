package com.riyan.web.webstepdef;

import com.riyan.helper.BaseTest;
import com.riyan.web.webpage.AboutUsPage;
import com.riyan.web.webpage.FirstPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsStepDef extends BaseTest {

    FirstPage firstPage;
    AboutUsPage aboutUsPage;

    @Given("user is on about us page")
    public void userIsOnAboutUsPage() {
        firstPage = new FirstPage(getDriver());
        aboutUsPage = new AboutUsPage(driver);

        firstPage.openWeb();
        aboutUsPage.clickLinkAboutUs();
    }

    @When("user click play button")
    public void userClickPlayButton() {
        aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.clickPlayButton();
    }

    @Then("close after video played")
    public void closeAfterVideoPlayed() {
        aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.closeAfterVideoPlay();
    }

    @And("user click link about us")
    public void userClickLinkAboutUs() {
        aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.clickLinkAboutUs();
    }
}
