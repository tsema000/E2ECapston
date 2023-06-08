package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	public WebDriver driver;

	By Uname = By.cssSelector("input[name='username']");
	By email = By.cssSelector("input[name='email']");
	By RegButton = By.cssSelector("input[type='submit']");

	public RegistrationPage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement getUsername() {
		return driver.findElement(Uname);

	}

	public WebElement getEmail() {
		return driver.findElement(email);

	}

	public WebElement getRgB() {
		return driver.findElement(RegButton);
	}

}
