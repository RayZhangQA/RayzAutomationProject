package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By userEmail = By.id("user_email");
	By passWord = By.id("user_password");
	By submit = By.xpath("//input[@type='submit']");	

	public WebElement userEmail() {
		return driver.findElement(userEmail);
	}
		
	public WebElement passWord() {
		return driver.findElement(passWord);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

}
