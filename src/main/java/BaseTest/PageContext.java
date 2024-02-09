package BaseTest;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageContext {

	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	//dependency infection getter and setter
	public RemoteWebDriver getDriver() {
		return driver;
	}
	public void setDriver(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public WebDriverWait getWait() {
		return wait;
	}
	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
}
