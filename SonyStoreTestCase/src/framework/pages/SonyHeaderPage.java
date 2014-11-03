package framework.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SonyHeaderPage extends HeaderPage {

	public SonyHeaderPage(WebDriver driver)  {
		super(driver);
	}

	@Override
	public WebElement getSignIn() {
		// locate the sign in button on page
		return findByLink("Login");
	}

	@Override
	// gets the wish list link
	public WebElement getWishList() {
		final String linkText = "Wish List";
		wait.until(ExpectedConditions.elementToBeClickable(By
				.linkText(linkText)));
		return findByLink(linkText);

	}
	
	@Override
	// gets the location of the Logout outlink
	public WebElement getSignOut() {
		return findByCSSselector("a.sny-utility-link.login-link");
	}


}
