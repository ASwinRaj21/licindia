package in.licindia.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\aswin\\eclipse-workspace\\licindia\\src\\test\\resources\\plan.feature",
glue = "in.licindia",
dryRun = false,
monochrome = true,
plugin = {"html:target/html","json:target/report.json"}
)

public class TestRunner {
	
	

}
