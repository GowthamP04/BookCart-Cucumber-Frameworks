 package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseTest.DriverInstances;
import BaseTest.PageContext;
import io.cucumber.java.en.When;

public class HomePage  {
  

	PageContext context;
	
	public HomePage(PageContext context) {
		this.context = context;
		
	}

	    //we need to change the driver instead of (context.getDriver)->context means call to context class driver
		//we need to change the wait instead of (context.getWait)->context means call to context class driver
	
	  @When("User add a book to the cart")
		public void userAddABookToTheCart()throws InterruptedException {
		
		  context.getDriver().findElement(By.cssSelector("button[color='primary']")).click();
			//click on add to cart option
			//WebElement addToCart = 
		  context.getDriver().findElement(By.cssSelector("button[color='primary']")).click();
			//context.getWait().until(ExpectedConditions.visibilityOf(addToCart)).click();

		}
  
	  
  }
 