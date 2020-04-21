package automationRay;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName, String passWord, String text) throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage ldp = new LandingPage(driver);
		ldp.getLogin().click();
		
		LoginPage lgp = new LoginPage(driver);
		lgp.userEmail().sendKeys(userName);
		lgp.passWord().sendKeys(passWord);
		lgp.submit().click();		
		System.out.println(text);
	}
	
	@DataProvider
	public Object[][] getData() {
		//Raw stands for how many different data types test should run.
		//Column stands for how many values per each test.
		Object[][] data = new Object[2][3];
		
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "Non Restriected User";
		  
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "45678"; 
		data[1][2] = "Restricted User";
		  
		return data;
	}
	
}
