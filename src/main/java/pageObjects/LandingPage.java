package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By signIn = By.xpath("//span[text()='Login']");
	By title = By.xpath("//h2[text()='Featured Courses']");	
	By navBar = By.xpath("//header[@class='main-header']");
	
	//nav[@class='main-menu']/div[2]/ul

	public WebElement getLogin() {
		return driver.findElement(signIn);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navBar);
	}
	
}
