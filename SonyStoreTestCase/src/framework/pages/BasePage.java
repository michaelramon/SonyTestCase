package framework.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class BasePage extends SonyBasePage{
	protected WebDriver driver;

	// return the location of sign in button
	public WebElement getSignIn() {
		// locate the sign in button on page
		return findByLink("Sign in");
	}
	
}
