package RunningTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/main/java/sample"},
		glue = "StepD",
		dryRun = !true,
		snippets = SnippetType.CAMELCASE
		
		)
public class Selva extends AbstractTestNGCucumberTests{

}
