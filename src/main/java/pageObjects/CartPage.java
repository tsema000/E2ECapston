package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;

	By CartLink = By.xpath("//nav/div/div[3]/ul//a[@href='/cart']");
	By ByBtn = By.xpath("//input[@id='btn2']");

	public CartPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getCart() {
		return driver.findElement(CartLink);
	}

	public WebElement getBuyBtn() {
		return driver.findElement(ByBtn);

	}

}
