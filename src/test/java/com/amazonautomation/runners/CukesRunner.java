package com.amazonautomation.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                //"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", //we can write anything instead of "rerun"
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/amazonautomation/stepDefinitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
