package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Bharathi\\eclipse-workspace\\New\\Cucmbber\\src\\test\\java\\features\\page.feature"
,glue= {"stepdefined"},
dryRun=false,
monochrome=true,
publish=true)
//tags="@Sce1")

public class Runner {
	

}