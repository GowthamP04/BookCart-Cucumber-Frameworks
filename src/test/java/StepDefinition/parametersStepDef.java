/*
 * package StepDefinition;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert;
 * 
 * import drivers.DriverInstance; import io.cucumber.java.en.And; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When;
 * 
 * public class parametersStepDef extends DriverInstance {
 * 
 * //WebDriver driver;
 * 
 * @Given("user should navigate to the Bookcart") public void
 * userShouldNavigateToTheBookcart() {
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 * driver.get("https://bookcart.azurewebsites.net/"); }
 * 
 * @And("user click the login button") public void userClickTheLoginButton() {
 * driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click(); }
 * 
 * @And("user enter the username as {string}") public void
 * userEnterTheUsernameAs(String username) {
 * driver.findElement(By.cssSelector("input[formcontrolname='username']")).
 * sendKeys(username); }
 * 
 * @And("user enter the password as {string}") public void
 * userEnterThePasswordAs(String password) {
 * driver.findElement(By.cssSelector("input[formcontrolname='password']")).
 * sendKeys(password); }
 * 
 * @When("user click on the login btn") public void userClickOnTheLoginBtn() {
 * driver.findElement(By.cssSelector("button[color='primary']")).click(); }
 * 
 * @Then("Login should be success") public void loginShouldBeSuccess() { String
 * status =
 * driver.findElement(By.xpath("//span[text()=' Book Cart ']")).getText();
 * Assert.assertEquals(status, "book Book Cart"); driver.quit(); }
 * 
 * }
 */