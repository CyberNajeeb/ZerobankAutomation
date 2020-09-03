package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src.test.com.zerobank.stepdefnitions",
        dryRun = true,
        strict = false,
        tags = "@account_summary",
        plugin = {
                "html:target/cucumber_html_reports",
                "json:target/cucumber_reports.json",
                "rerun:target/rerun.txt"
        }
)

public class AccountSummaryRunner {
}
