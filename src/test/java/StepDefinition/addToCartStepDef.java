/*
 * package StepDefinition;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait; import org.testng.Assert;
 * 
 * import drivers.DriverInstance; import io.cucumber.java.en.And; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When;
 * 
 * public class addToCartStepDef extends DriverInstance{
 * 
 * //WebDriver driver; //WebDriverWait wait;
 * 
 * 
 * 
 * 
 * @Given("user should navigate to the application") public void
 * usershouldnavigatetotheBookcartapplication() {
 * 
 * //wait = new WebDriverWait(driver, Duration.ofSeconds(10)); driver = new
 * ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 * driver.get("https://bookcart.azurewebsites.net/"); }
 * 
 * 
 * 
 * 
 * @And("User should login as {string} and {string}") public void
 * userShouldLoginAsAnd(String username, String password) {
 * 
 * driver.findElement(By.xpath("(//span[text()='Login'])[1]/..")).click();
 * driver.findElement(By.cssSelector("input[formcontrolname='username']")).
 * sendKeys(username);
 * driver.findElement(By.cssSelector("input[formcontrolname='password']")).
 * sendKeys(password);
 * driver.findElement(By.cssSelector("button[color='primary']")).click();
 * 
 * //WebElement userele = driver.findElement(By.
 * xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigge')]"));
 * //wait.until(ExpectedConditions.visibilityOf(userele));
 * 
 * }
 * 
 * @And("user search a {string}") public void userSearchA(String book) throws
 * InterruptedException {
 * 
 * driver.findElement(By.cssSelector("input[type='search']")).sendKeys(book);
 * 
 * //search box
 * 
 * //WebElement searchoption =
 * driver.findElement(By.cssSelector("span.mat-option-text")).click();
 * //WebElement options =
 * wait.until(ExpectedConditions.visibilityOf(searchoption)); //options.click();
 * 
 * //search and enter the input }
 * 
 * @When("User add a book to the cart") public void
 * userAddABookToTheCart()throws InterruptedException {
 * 
 * 
 * driver.findElement(By.cssSelector("button[color='primary']")).click();
 * //click on add to cart option
 * 
 * //WebElement addToCart =
 * driver.findElement(By.cssSelector("button[color='primary']")).click();
 * //wait.until(ExpectedConditions.visibilityOf(addToCart)).click();
 * 
 * }
 * 
 * @Then("the cart badge shouls be updated") public void
 * theCartBadgeShoulsBeUpdated() {
 * 
 * WebElement toastMsg = driver.findElement(By.tagName("snack-bar-container"));
 * //once we click on add to cart then it will get one toast message
 * 
 * //wait.until(ExpectedConditions.visibilityOf(toastMsg));
 * //wait.until(ExpectedConditions.invisibilityOf(toastMsg));
 * 
 * String text =
 * driver.findElement(By.cssSelector("#mat-badge-content-0")).getText(); //once
 * add to cart shopping badge change 0 to 1
 * System.out.println("Number of books in cart: "+text);
 * Assert.assertEquals(Integer.parseInt(text)>0, true); // driver.quit(); }
 * 
 * }
 */