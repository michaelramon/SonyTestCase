package framework.tests;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import framework.data.CustomersData;
import framework.pages.*;


public class TestCase extends TestBase{
	static WebDriver driver;
	FrontPage frontPage;
	MyAccountPage myAccountPage;
	SavedAddresessPage savedAddressesPage;
	CustomersData customers;



	

	@Test
	public void test() throws IOException {

		// Start the web Driver and navigate to Sony
		driver.get("http://store.sony.com");
		
		// Sign in
		frontPage.signInInitial();
		
		// click Saved Addresses
		myAccountPage.getSavedAddresses().click();
		
		// add the first address
		savedAddressesPage.addShippingAddress(customers);
		//assert the address is correct and is preferred
		Assert.assertTrue(savedAddressesPage.getSaveShipAddress().isDisplayed(), String.format("Expected "));

	
	}

	@After
	public void removeAddresses() {
//		//  click the delete address button to reset test case		
//		// Start the web Driver and navigate to petsmart
//		driver.get("http://www.petsmart.com/");
//		
//
//		//Click the link to the MY Account Link
//		myAccountPage.clickSignIn();
//	
//
//		// Click the address book link in left column
//		myAccountPage.getSavedAddresses().click();
//		//delete the address stored to reset user data
//		driver.navigate().refresh();
//		editAddressPage.deleteAddress();

	}
	
	@AfterClass
	public static void afterClass(){

		
	}

}