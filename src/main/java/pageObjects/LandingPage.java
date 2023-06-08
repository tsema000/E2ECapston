package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;

	By Register = By.cssSelector("[value='Register']");
	{
	}

	public LandingPage(WebDriver driver2) {
		this.driver = driver2;

	}

	public WebElement getRegister() {
		return driver.findElement(Register);

	}

}
