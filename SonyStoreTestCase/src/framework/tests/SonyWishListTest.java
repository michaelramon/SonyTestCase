package framework.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SonyWishListTest extends SonyTestBase {

	@Test
	public void verifyWishList() throws IOException {
		// given: "A registered user is logged into account"
		pageFactory.utilities().signInInitial();
		// and: "The user clicks on the wish list"
		pageFactory.headerPage().getWishList().click();
		// and: "A wish list is created"
		pageFactory.wishListPage().createPublicWishList();
		
		// when: "The user searches for an item and navigates to its product page
		pageFactory.utilities().searchForItem(
				dataFactory.productData().getItem(0));
		// and: "the user asserts item is correct and adds it to wish list"
		pageFactory.utilities().AddItemToWishList(
				dataFactory.productData().getItem(0));
		
		// when: "The user searches for a 2nd item and navigates to its product page
		pageFactory.utilities().searchForItem(
				dataFactory.productData().getItem(1));
		// and: "the user asserts item is correct and adds it to wish list"
		pageFactory.utilities().AddItemToWishList(
				dataFactory.productData().getItem(1));
		
		// when: "The user searches for a 3rd item and navigates to its product page
		pageFactory.utilities().searchForItem(
				dataFactory.productData().getItem(2));
		// and: "the user asserts item is correct and adds it to wish list"
		pageFactory.utilities().AddItemToWishList(
				dataFactory.productData().getItem(2));
		// and: "The user signs out"
		pageFactory.headerPage().getSignOut().click();
		
		// when: "A guest user searches for wish list"
		pageFactory.headerPage().getWishList().click();
		// and: "The list is found"
		pageFactory.wishListPage().searchWishLists();
		// then: "The list contains the three items"
		Assert.assertEquals(pageFactory.wishListPage().getTotalItems()
				.getText(), ("" + dataFactory.productData().getSize()), String
				.format("Expected total item count to be %s", dataFactory
						.productData().getSize()));
	}

	@AfterClass
	public void teardown() throws IOException {
		// when: "The user signs into account"
		pageFactory.utilities().signInInitial();
		// and: "The user clicks on the wish list link"
		pageFactory.headerPage().getWishList().click();
		// and: "The user deletes account"
		pageFactory.wishListPage().deleteWishList();

	}

}
