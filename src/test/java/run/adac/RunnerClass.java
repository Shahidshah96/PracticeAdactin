package run.adac;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\Login.Feature", dryRun = false, glue = "stepdef.adac", monochrome = true, strict = false)
public class RunnerClass {

}
