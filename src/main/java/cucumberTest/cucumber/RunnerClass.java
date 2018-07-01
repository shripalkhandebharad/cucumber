package cucumberTest.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="SupportingFile")//,glue=["cucumberTest.cucumber"])

public class RunnerClass {

}
