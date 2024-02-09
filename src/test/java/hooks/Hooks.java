package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import BaseTest.DriverInstances;
import BaseTest.PageContext;
import drivers.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	PageContext context;
	
	public Hooks(PageContext context) {
		this.context = context;
		
	}
	

	@BeforeStep
	public void beforeSteps(Scenario scenario) {
		
	}
	
	@AfterStep
	public void afterSteps(Scenario scenario) {
		
		//each & every pass steps screenshot
		
		//byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
		//scenario.attach(screenshot, "image/png", "image");
	}

	@Before
	public void beforescenario(Scenario scenario) {
		
		  RemoteWebDriver driver = new ChromeDriver();
		   
		   context.setDriver(driver); //we are using setter 
		   
		   //we need to change the driver instead of (context.getDriver)->context means call to context class driver
		   //we need to change the wait instead of (context.getWait)->context means call to context class driver
		   driver.manage().window().maximize(); 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   context.getDriver().get("https://bookcart.azurewebsites.net/");
		   
		//cucumber scenario methods 
		   
		String name = scenario.getName();
		System.out.println("scenario name :" +name);
		
		System.out.println("ID :"+scenario.getId()); //getid means print scenario path and line number
		System.out.println("lines :"+scenario.getLine()); //getlines means print the array number ex: [15,6]
		System.out.println("URI :"+scenario.getUri()); //geturi means print scenario path
		System.out.println("Tags :"+scenario.getSourceTagNames()); //print array value in tags names
		System.out.println("status :"+scenario.getStatus()); // print the status
		
	}
	
	@After("@clearUp")  //after the executed if we have to clear data concept
	public void clearData(Scenario scenario) throws IOException {
		
		
		// before screenshot 
		 
		//byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
		//scenario.attach(screenshot, "image/png", "image");
		
		//we need to change the driver instead of (context.getDriver)->context means call to context class driver
		//we need to change the wait instead of (context.getWait)->context means call to context class driver
		
		context.getDriver().findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-icon-button')][2]")).click();
		context.getDriver().findElement(By.xpath("//div[@class='ng-star-inserted']//button[1]")).click(); //clear the data
		String text = context.getDriver().findElement(By.tagName("mat-card-title")).getText();
		Assert.assertEquals(text, "Shopping cart is empty");
		
		//after screenshot
		
		//byte[] screenshot1 = driver.getScreenshotAs(OutputType.BYTES);
		//scenario.attach(screenshot1, "image/png", "image");
	}
	
	
	@After
	public void afterscenario(Scenario scenario) throws IOException {
		boolean failed = scenario.isFailed();
		System.out.println("is failed :" +failed);
		if(failed) {
			//only failed screenshot
			
			byte[] screenshot = context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
		}
		context.getDriver().quit();
	}
	
}
