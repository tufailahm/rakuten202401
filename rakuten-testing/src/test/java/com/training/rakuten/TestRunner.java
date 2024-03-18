package com.training.rakuten;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Features", 
		glue= {"com.training.rakuten"},
		plugin = {"pretty", "html:target/HtmlReports/reports.html",
	            "json:target/JSONReports/report.json",
	            "junit:target/XMLReports/report.xml"
		}
		
		)
public class TestRunner {

}
