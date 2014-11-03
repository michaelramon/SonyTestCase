package framework.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;

import framework.factories.SonyPageFactory;
import framework.utilities.Utilities;



public class SonyUtilities extends Utilities {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	SonyPageFactory pageFactory = new SonyPageFactory(driver);

	public SonyUtilities(WebDriver driver )  {
		// instantiate the firefox  passed from Base Page
		super(driver);
	}

	@Override
	public void signInInitial() {
		// click log in button and navigate to my account page
		pageFactory.headerPage().getSignIn().click();
		// add a wait for element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.linkText("Login")));
		// input customer email into form field
		pageFactory.myAccountPage().enterDatainEmail(
				dataFactory.customersData().setEmail());
		// input customer password into form field
		pageFactory.myAccountPage().enterDataInPassword(
				dataFactory.customersData().setPassword());
		// Click the sign in button at bottom of login credentials.
		pageFactory.myAccountPage().clickSignIn();
		// assert that the user is signed in
		Assert.assertTrue(
				pageFactory.myAccountPage().getLogout().isDisplayed(),
				String.format("Expected link to be found is \"Logoout\""));

	}

	// Seaches for item and navigates to its product page
	public void searchForItem(String item)  {
		pageFactory.headerPage().searchForItem(item);
		pageFactory.productFrontPage().getProduct().click();
	}

	// asserts the correct item is on page and adds to wish list
	public void AddItemToWishList(String item)  {
		Assert.assertEquals(
				String.format("Expected product title to be %s", pageFactory
						.productsPage().getProductTitle().getText()),
						item,
				pageFactory.productsPage().getProductTitle().getText());
		pageFactory.productsPage().addItemtoWishList();
	}

}


