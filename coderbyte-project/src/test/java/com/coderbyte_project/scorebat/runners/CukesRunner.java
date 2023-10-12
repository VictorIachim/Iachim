package com.coderbyte_project.scorebat.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/coderbyte_project/scorebat/features",
        glue = "com/coderbyte_project/scorebat/stepdefinitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {	
}
