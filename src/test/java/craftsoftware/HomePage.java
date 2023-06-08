package craftsoftware;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LandingPage;
import pageObjects.LogInPage;
import pageObjects.ProductPage;
import pageObjects.RegistrationPage;
import resource.Base;

public class HomePage extends Base {

	public HomePage() throws IOException {
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
		// Landing Page
		LandingPage l = new LandingPage(driver);
		l.getRegister().click();

		// RegistrationPage
		RegistrationPage r = new RegistrationPage(driver);
		r.getUsername().sendKeys("Abebe");
		r.getEmail().sendKeys("gekt@gmail.com");
		r.getRgB().click();

		// LoginPage
		driver.get(getUrl());
		LogInPage log = new LogInPage(driver);
		log.getLogin().sendKeys("2764");
		log.getLoginBtn().click();

		// Product Page

		ProductPage p = new ProductPage(driver);
		p.getProd1().click();
		p.getProd2().click();

		// CartPage

		CartPage c = new CartPage(driver);
		c.getCart().click();
		c.getBuyBtn().click();

	}

}
