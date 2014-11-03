package framework.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.data.CustomersData;

public class SavedAddresessPage extends SonyBasePage{
	//creates an instance of the myaccountpage
	MyAccountPage myAccountPage = new MyAccountPage(driver);
	// creates an instance of a wait
	WebDriverWait wait = (new WebDriverWait(driver, 5));
	// creates an instance of CustomersData
	CustomersData customer = new CustomersData();
	// creates an instance of the select class
	Select selectBox;
	// create an instance of the action class
	Actions act = new Actions(driver);

	public SavedAddresessPage(WebDriver driver) throws IOException {
		super(driver);
	}
	
	// adds the shipping address
	public void addShippingAddress(CustomersData customer){
		myAccountPage.getAddNewAddress().click();
		setFirstName(customer.getFirstName());
		setLastName(customer.getLastName());
//		setShipAddress(customer.getShipAddress1());
		setShipZipcode(customer.getShipZipcode());
		setShipCity(customer.getShipCity());
		setState(customer.setState());
		setTelephone(customer.setTelephone());
		getPreferredShipping().click();
		getSaveChanges().click();	
	}
	
	// Address 1 first name
		public WebElement getFirstName() {
			wait.until(ExpectedConditions.elementToBeClickable(By
					.linkText("Cancel Updates")));
			return findByID("AddressForm_FirstName");
		}
		//set first name
		public void setFirstName(String customer1) {
			customer1 = customer.getFirstName();
			getFirstName().sendKeys(customer1);
		}

		// Address 1 last name
		public WebElement getLastName() {
			return findByID("AddressForm_LastName");
		}
		// set last name
		public void setLastName(String customer1) {
				customer1 = customer.getLastName();
				getLastName().sendKeys(customer1);
		}
		

		// Address 1 Ship
		public WebElement getShipAddress() {
			return findByID("AddressForm_Address1");
		}

//		public void setShipAddress(String customer1) {
//			customer1 = customer.getShipAddress1();
//			getShipAddress().sendKeys(customer1);
//		}

		// Address1 city ship
		public WebElement getShipCity() {
			return findByID("AddressForm_City");
		}

		public void setShipCity(String customer1) {
			customer1 = customer.getShipCity();
			getShipCity().sendKeys(customer1);
		}

		// Address 1 ship zip
		public WebElement getShipZipcode() {
			return findByID("AddressForm_PostalCode");
		}

		public void setShipZipcode(String customer1) {
			customer1 = customer.getShipZipcode();
			getShipZipcode().sendKeys(customer1);
		}
		public WebElement getPreferredShipping() {
			wait.until(ExpectedConditions.elementToBeClickable(By
					.linkText("Cancel Updates")));
			return findByID("PreferredShipping");
		}

		
		// get location of State field
		public WebElement getState() {
			return findByID("AddressForm_State");

		}

		// sends user data to state dropbox
		public void setState(String customer1) {
			customer1 = customer.getState();
			selectBox = new Select(driver.findElement(By.id("AddressForm_State")));
			selectBox.selectByValue(customer1);
		}
		
		// get telephone location
		public WebElement getTelephone() {
			return findByID("AddressForm_Phone");
		}

		public void setTelephone(String customer1) {
			getTelephone().sendKeys(customer1);
		}
		
		public WebElement getSaveChanges() {
			return findByName("createAddress");
		}
		
		public WebElement getSaveShipAddress(){
			return findByXPath("//div[contains(., '8111 Concord Mills Blvd')]");
			
		}
		
		//
		public WebElement getDeleteButton(){
			return findByLink("Delete");
		}
		public void deleteAddress() {
			//deletes the first address
			getDeleteButton().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.name("deleteAddress']")));
			// clicks a second time to delete a preferred address
			getDeleteButton().click();
////			wait.until(ExpectedConditions.visibilityOfElementLocated(By
////					.cssSelector("input[name='deleteAddress']")));
////			getBillDelete(customer).click();
//			getDeleteButton().click();
//		}
		
		}
}
