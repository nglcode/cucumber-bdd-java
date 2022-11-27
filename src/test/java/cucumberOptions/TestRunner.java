package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions", stepNotifications = true, tags = "not @SanityTest")
// tags = "@RegTest"
// @SmokeTest or @RegTest"
// not @SanityTest
// @SmokeTest and @RegTest
public class TestRunner {
	
}
