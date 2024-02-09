package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/featureFile/addToCart.feature"}, 
        dryRun = !true,
        //page object model glue
        glue = {"PageObject" , "hooks"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
       
        //extent reports
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
      
		//tags = "@reg"
		
        )

public class CartTestRunner extends AbstractTestNGCucumberTests{
	
}
