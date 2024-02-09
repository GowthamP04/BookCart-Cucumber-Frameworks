package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/featureFile"}, 
        dryRun = !true,
        
        //normal glue
        //glue = {"StepDefinition" , "hooks"},   
       
        //page object model glue
        glue = {"PageObject" , "hooks"},
       
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        
        //extent reports
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
      
       
        // different reports 
        
       //plugin = {"pretty"}   // getting log's to console
       //		"html:target/CucumberReports.html" }
        		//"json:reports/results.json",
        		//"junit:reports/results.xml"}
        
		//tags = "@reg"
		//tags = "@Sanity or @E2E" //--->Tags can be used in conditional format using "And", "or" & "not".It is similar to groups in TestNG
        				// multiple tags are using 
						// and ->"@smoke and @reg" ->only execute both condition are matching
						// or -> "@smoke or @reg"->default condition execute any one matching
						//not->"not @smoke"->execute condition but except not scenario
        )

public class Runner extends AbstractTestNGCucumberTests{
	
}
