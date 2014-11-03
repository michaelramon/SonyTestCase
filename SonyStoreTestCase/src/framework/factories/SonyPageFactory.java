package framework.factories;


import org.openqa.selenium.WebDriver;
import framework.pages.SonyCreateAccountPage;
import framework.pages.SonyHeaderPage;
import framework.pages.SonyMyAccountPage;
import framework.pages.SonyProductsPage;
import framework.pages.SonyWishListPage;
import framework.utilities.SonyUtilities;

public class SonyPageFactory extends PageFactory {

	public SonyPageFactory(WebDriver driver) {
		super(driver);
	}

	@Override
	public SonyUtilities utilities()  {
		return new SonyUtilities(driver);
	}

	@Override
	public SonyMyAccountPage myAccountPage()  {
		return new SonyMyAccountPage(driver);
	}


	@Override
	public SonyWishListPage wishListPage()  {
		return new SonyWishListPage(driver);
	}


	@Override
	public SonyCreateAccountPage createAccountPage()
			 {
		return new SonyCreateAccountPage(driver);
	}

	@Override
	public SonyHeaderPage headerPage()  {
		return new SonyHeaderPage(driver);
	}
	@Override
	public SonyProductsPage productsPage() {
		return new SonyProductsPage(driver);

	}
	
	
}
