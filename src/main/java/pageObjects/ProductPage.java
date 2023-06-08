package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	WebDriver driver;

	By AddProd1 = By.cssSelector("tbody .odd:nth-of-type(1) td:nth-of-type(1) [action] .btn-primary:nth-child(6)");
	By AddProd2 = By.cssSelector("tbody .odd:nth-of-type(1) td:nth-of-type(2) [action] .btn-primary:nth-child(6)");

	// valdation
	By title = By.xpath("/html//nav//a[.='Craft Online Shopping']");
	By CartLink = By.xpath("//a[@href='/cart']");

	public ProductPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getProd1() {
		return driver.findElement(AddProd1);
	}

	public WebElement getProd2() {
		return driver.findElement(AddProd2);
	}

	public WebElement getCartLink() {
		return driver.findElement(CartLink);
	}

}
