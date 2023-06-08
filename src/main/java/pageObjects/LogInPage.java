package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	public WebDriver driver;

	By LoginID = By.cssSelector("input[name='userid']");
	By LoginBtn = By.cssSelector("input[value='Login']");

	public LogInPage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement getLogin() {
		return driver.findElement(LoginID);
	}

	public WebElement getLoginBtn() {
		return driver.findElement(LoginBtn);
	}

}
