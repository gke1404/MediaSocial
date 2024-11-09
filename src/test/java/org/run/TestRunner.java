package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\gkr01\\eclipse-workspace\\Cucumber\\src\\test\\resources"
,glue="org.cucum", dryRun=false, monochrome=true)


public class TestRunner {

}
