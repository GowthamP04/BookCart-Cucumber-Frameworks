/*
 * package StepDefinition;
 * 
 * import java.time.Duration; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.edge.EdgeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait; import org.testng.Assert;
 * 
 * import drivers.DriverInstance; import io.cucumber.java.en.But; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When;
 * 
 * public class loginStepDef extends DriverInstance{
 * 
 * //WebDriver driver; //WebDriverWait wait;
 * 
 * 
 * 
 * 
 * 
 * 
 * @Given("user should navigate to the application login") public void
 * usershouldnavigatetotheapplication() {
 * 
 * driver = new ChromeDriver(); //wait = new WebDriverWait(driver,
 * Duration.ofSeconds(10)); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * driver.get("https://bookcart.azurewebsites.net/"); }
 * 
 * 
 * 
 * 
 * 
 * @Given("User clicks on the login link") public void
 * userclicksontheloginlink() {
 * driver.findElement(By.xpath("(//span[text()='Login'])[1]/..")).click(); }
 * 
 * @Given("user enter the username as {string}") public void
 * userentertheusernameas(String username) {
 * driver.findElement(By.cssSelector("input[formcontrolname='username']")).
 * sendKeys(username); }
 * 
 * @Given("user enter the password as {string}") public void
 * userenterthepasswordas(String password) {
 * driver.findElement(By.cssSelector("input[formcontrolname='password']")).
 * sendKeys(password); }
 * 
 * @When("User click the login button") public void userclicktheloginbutton() {
 * driver.findElement(By.cssSelector("button[color='primary']")).click(); }
 * 
 * @Then("Login should be success") public void Loginshouldbesuccess() {
 * WebElement userEle = driver.findElement(By.
 * xpath("//button[contains(@class,'mat-focus-indicator ')][3]"));
 * wait.until(ExpectedConditions.visibilityOf(userEle)); //driver.quit(); }
 * 
 * //failed cases
 * 
 * @Given("User enter the username as {string}") public void
 * UserEnterTheUsernameAs(String username) {
 * driver.findElement(By.cssSelector("input[formcontrolname='username']")).
 * sendKeys(username); }
 * 
 * @Given("User enter the password as {string}") public void
 * UserEnterThePasswordAs(String password) {
 * driver.findElement(By.cssSelector("input[formcontrolname='password']")).
 * sendKeys(password); }
 * 
 * @But("Login should fail") public void Loginshouldfail() { String errorMsg =
 * driver.findElement(By.cssSelector("mat-error[role='alert']")).getText();
 * Assert.assertEquals(errorMsg, "Username or Password is incorrect.");
 * //driver.quit(); } }
 */