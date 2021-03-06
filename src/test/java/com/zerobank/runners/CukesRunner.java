package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com/zerobank/stepdefnitions",
        dryRun = false,
        strict = false,
        tags = "@validLogin",
        plugin = {
                "html:target/cucumber_html_reports",
                "json:target/cucumber_reports.json",
                "rerun:target/rerun.txt"
        }

)
public class CukesRunner {

}
