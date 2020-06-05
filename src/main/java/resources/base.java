package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		//Based on the variable to setup the browser, such as Chrome, Firefox, IE, or Safari
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\RayzAutomationProject\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String homeUrl = prop.getProperty("url");
		
		if (browserName.contentEquals("chrome")) {
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.contentEquals("firefox")) {
			//execute in firefox driver
			driver = new FirefoxDriver();

		}
		else if (browserName.contentEquals("ie")) {
			//execute in chrome driver
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;

	}
}
