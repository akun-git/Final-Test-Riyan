package com.riyan.helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected static WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*", "--headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(option);
        }
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
