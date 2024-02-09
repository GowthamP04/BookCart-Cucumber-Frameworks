 package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseTest.DriverInstances;
import BaseTest.PageContext;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {


	PageContext context;
	
	public LoginPage(PageContext context) {
		this.context = context;
		
	}

	    //we need to change the driver instead of (context.getDriver)->context means call to context class driver
		//we need to change the wait instead of (context.getWait)->context means call to context class driver

	@Given("user enter the username as {string}") 
	public void userentertheusernameas(String username) {
		context.getDriver().findElement(By.cssSelector("input[formcontrolname='username']")).
		sendKeys(username);
		}

	@Given("user enter the password as {string}") 
	public void userenterthepasswordas(String password) {
		context.getDriver().findElement(By.cssSelector("input[formcontrolname='password']")).
		sendKeys(password); 
		}

	@When("User click the login button")
	 public void userclicktheloginbutton() {
		context.getDriver().findElement(By.cssSelector("button[color='primary']")).click();
		}

	@Then("Login should be success")
	 public void Loginshouldbesuccess() {
		WebElement userEle = context.getDriver().findElement(By.
			xpath("//button[contains(@class,'mat-focus-indicator ')][3]"));
		context.getWait().until(ExpectedConditions.visibilityOf(userEle)); 
	Assert.assertEquals(userEle.isDisplayed(), true);
	
	}

	//failed cases
	
	  @Given("User enter the username as {string}") 
	  public void UserEnterTheUsernameAs(String username) {
		  context.getDriver().findElement(By.cssSelector("input[formcontrolname='username']")).
	  sendKeys(username);
	  }
	  
	  @Given("User enter the password as {string}")
	  public void UserEnterThePasswordAs(String password) {
		  context.getDriver().findElement(By.cssSelector("input[formcontrolname='password']")).
	  sendKeys(password); 
	  }
	  
	  
	  @Given("User should login as {string} and {string}")
	  public void userShouldLoginAsAnd(String user, String pass) {
	      this.UserEnterTheUsernameAs(user);
	      this.UserEnterThePasswordAs(pass);
	      this.userclicktheloginbutton();
	      this.Loginshouldbesuccess();
	      
	  }
	 
	@But("Login should fail") 
	public void Loginshouldfail() { 
	String errorMsg = context.getDriver().findElement(By.cssSelector("mat-error[role='alert']")).getText();
	Assert.assertEquals(errorMsg, "Username or Password is incorrect.");
	
	
	context.getDriver().quit(); 
	} 
	}

	  
  