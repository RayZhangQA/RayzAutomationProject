package automationRay;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateTitle extends base{
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized!");
		
		driver.get(prop.getProperty("url"));

		log.info("Navigated to Home Page!");
	}

	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPage ldp = new LandingPage(driver);
		Assert.assertEquals(ldp.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated Text Massage!");
	}	

	@AfterTest
	public void teardown() {
		System.out.println(driver.getTitle());
		driver.close();
	}

}
