package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.zerobank.stepdefnitions",
        dryRun = false,
        strict = false,
        tags = "",
        plugin = {
                "html:target/cucumber_html_reports",
                "json:target/cucumber_reports.json",
                "rerun:target/rerun.txt"
        }
)
public class CukesRunner {
}
