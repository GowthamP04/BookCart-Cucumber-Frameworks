package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BaseTest.DriverInstances;
import BaseTest.PageContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HeaderPage  {
	
	
	PageContext context;
	
	public HeaderPage(PageContext context) {
		this.context = context;
		
	}
	
	//we need to change the driver instead of (context.getDriver)->context means call to context class driver
	//we need to change the wait instead of (context.getWait)->context means call to context class driver
  
	  @Given("User clicks on the login link") 
		public void userclicksontheloginlink() {
		  context.getDriver().findElement(By.xpath("(//span[text()='Login'])[1]/..")).click();
			}
	  
	  @And("user search a {string}") 
		public void userSearchA(String book) throws InterruptedException {
		
		  context.getDriver().findElement(By.cssSelector("input[type='search']")).sendKeys(book);
			//WebElement searchoption = 
		  context.getDriver().findElement(By.cssSelector("span.mat-option-text")).click(); 
			//WebElement options = context.getWait().until(ExpectedConditions.visibilityOf(searchoption));
			//options.click();
 
					}
	  
	  @Then("the cart badge shouls be updated") 
		public void theCartBadgeShoulsBeUpdated() {

			WebElement toastMsg = context.getDriver().findElement(By.tagName("snack-bar-container"));
			//once we click on add to cart then it will get one toast message
			//context.getWait().until(ExpectedConditions.visibilityOf(toastMsg));
			//context.getWait().until(ExpectedConditions.invisibilityOf(toastMsg));

			String text = context.getDriver().findElement(By.cssSelector("#mat-badge-content-0")).getText(); //once add to cart shopping badge change 0 to 1
			System.out.println("Number of books in cart: "+text);
			Assert.assertEquals(Integer.parseInt(text)>0, true);
			 
			}
  
  }