package framework.factories;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import framework.pages.AddressBookPage;
import framework.pages.ChangeAddressPage;
import framework.pages.CreateAccountPage;
import framework.pages.EditAddressPage;
import framework.pages.HeaderPage;
import framework.pages.MyAccountPage;
import framework.pages.ProductsPage;
import framework.pages.WelcomePage;
import framework.pages.WishListPage;
import framework.utilities.Utilities;

public class PageFactory {
	
	public PageFactory(WebDriver driver){
	
	}

	public Utilities utilities(WebDriver driver) throws IOException{
		return new Utilities(driver);
	}
	public MyAccountPage myAccountPage(WebDriver driver) throws IOException{
		return new MyAccountPage(driver);
	}
	public WelcomePage welcomePage(WebDriver driver) throws IOException{
		return new WelcomePage(driver);
	}
	public AddressBookPage addressBookPage(WebDriver driver) throws IOException{
		return new AddressBookPage(driver);
	}
	public EditAddressPage editAddressPage(WebDriver driver) throws IOException{
		return new EditAddressPage(driver);
	}
	public ChangeAddressPage ChangeAddressPage(WebDriver driver) throws IOException{
		return new ChangeAddressPage(driver);
	}
	public WishListPage wishListPage(WebDriver driver) throws IOException{
		return new WishListPage(driver);
	}
	public ProductsPage productsPage(WebDriver driver) throws IOException{
		return new ProductsPage(driver);
	}
	public CreateAccountPage createAccountPage(WebDriver driver) throws IOException{
		return new CreateAccountPage(driver);
	}
	public HeaderPage headerPage(WebDriver driver) throws IOException{
		return new HeaderPage(driver);
	}

		
		
	}

