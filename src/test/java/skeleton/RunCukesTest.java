package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium_WS\\CucumberCs\\CS_Feature\\Feature13.feature", 
glue="cucum_Pack1", tags= {"@Sanity"},
plugin = {"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class RunnerCaseStudy {
	

}
