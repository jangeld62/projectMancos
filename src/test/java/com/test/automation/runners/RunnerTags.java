package com.test.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/java/features/test.feature",
        tags = "@test1",
        glue = "com.test.automation.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {



}
