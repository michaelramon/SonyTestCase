package framework.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import framework.factories.SonyPageFactory;

public class SonyWishListPage extends WishListPage {
	SonyPageFactory pageFactory = new SonyPageFactory(driver);

	public SonyWishListPage(WebDriver driver){
		super(driver);
	}
	
	@Override
	//create a new wish list with info passes by customersData
	public void createPublicWishList(){
		Assert.assertTrue(getCreateWishList().isDisplayed());
		//clicks the create a wish list link
		getCreateWishList().click();
		//sends the wish list name to field
		getWishListName().sendKeys(dataFactory.customersData().getWishListName());
		//clicks the public privacy setting radio button
		getPublicPrivacySetting().click();
		//clicks the create a wish list link
		createNewWishList().click();
		// refresh the page
		driver.navigate().refresh();
		
	}
	
	
	private WebElement getCreateWishList() {
		return findByLink("Create New Wish List");
	}
	
	//gets the public privacy setting radio buttons
	private WebElement getPublicPrivacySetting(){
		return findByID("CreateWishlistForm_isPublic_true");
	}
	
	//get the create wish lish link
	private WebElement createNewWishList(){
		return findByName("createNewWishlist");
		
	}

}
