package com.riyan.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.riyan.api"},
        features = {"src/test/resources/apifeature"},
        tags = "@api"
)

public class ApiRunner {
}
