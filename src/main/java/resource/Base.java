package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	private String url;
	private Properties prop;

	public Base() throws IOException {
		prop = new Properties(); // create property object
		FileInputStream data = new FileInputStream(
				"C:\\Users\\tilah\\Desktop\\Resources\\myproject\\src\\main\\java\\resource\\data.properties");

		prop.load(data); // load is a method to connect prop object wit the path
	}

	public WebDriver getDriver() throws IOException {
		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;
	}

}
