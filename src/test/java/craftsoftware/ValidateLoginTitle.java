package craftsoftware;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LandingPage;
import pageObjects.LogInPage;
import pageObjects.ProductPage;
import pageObjects.RegistrationPage;
import resource.Base;

public class ValidateLoginTitle extends Base {

	public ValidateLoginTitle() throws IOException {
		super();

	}

	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}

	@Test
	public void endToEndTest() throws IOException, InterruptedException {

		LogInPage log = new LogInPage(driver);
		log.getLogin().sendKeys("1451");
		log.getLoginBtn().click();

		// product page
		ProductPage p = new ProductPage(driver);
		p.getProd1().click();
		p.getProd2().click();
		Thread.sleep(5000);
		p.getCartLink().click();

		// compare the test from the browser with actual text
		System.out.println(p.getTitle().getText());
		Assert.assertEquals("Craft Online Shopping", p.getTitle().getText());

		LandingPage l = new LandingPage(driver);
		l.getRegister().click();

		RegistrationPage r = new RegistrationPage(driver);
		r.getUsername().sendKeys("Abebe");
		r.getEmail().sendKeys("A@gmail.com");
		r.getRgB().click();
		driver.get(getUrl());

		CartPage c = new CartPage(driver);
		c.getCart().click();
		c.getBuyBtn().click();

		c.getCart().getText();
		Assert.assertFalse(c.getBuyBtn().isDisplayed());

	}

}
