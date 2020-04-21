package automationRay;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateTitle extends base{
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		//driver.get("http://qaclickacademy.com/");
		
		LandingPage ldp = new LandingPage(driver);
		Assert.assertEquals(ldp.getTitle().getText(), "FEATURED COURSES");

	}	
}
