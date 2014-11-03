package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;




import framework.data.SonyCustomersData;
import framework.utilities.Utilities;

import java.io.IOException;

public class SonyUtilities extends Utilities {
	


	// create the instance of the customer
	SonyCustomersData customer = new SonyCustomersData();
	
	
	public SonyUtilities(WebDriver driver) throws IOException {
		// instantiate the firefox driver passed from Base Page
		super(driver);

	}

	@Override
	public void signInInitial() {
		// click log in button and navigate to my account page
		headerPage.getSignIn().click();
 		// add a wait for element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		// input customer email into form field
		myaccount.enterDatainEmail(customer.setEmail());
		// input customer password into form field
		myaccount.enterDataInPassword(customer.setPassword());
		// Click the sign in button at bottom of login credentials
		myaccount.clickSignIn();

	}

	
	
	


}