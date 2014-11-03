package framework.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.factories.SonyPageFactory;

public class SonyMyAccountPage extends MyAccountPage{
	SonyPageFactory pageFactory = new SonyPageFactory(driver);

	public SonyMyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public WebElement getCreateAccount(){
		return findByCSSselector("a.sny-create-account-link");
	}
	
	public WebElement getLogout(){
		return findByCSSselector("a.sny-menu-logout");
	}
	

}
