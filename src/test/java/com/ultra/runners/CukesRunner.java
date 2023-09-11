package com.ultra.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml",
                "rerun:target/rerun.txt",


        },
        features = "src/test/resources/features",
        glue = "com/ultra/step_definitions",

        dryRun = false,
        tags = "@ultra1",
        //stepNotifications = true,
        publish = true


)
public class CukesRunner {
}

