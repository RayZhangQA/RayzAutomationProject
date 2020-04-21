package automationRay;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigationBar extends base{
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage ldp = new LandingPage(driver);
		Assert.assertTrue(ldp.getNavigationBar().isDisplayed());

	}	
}
