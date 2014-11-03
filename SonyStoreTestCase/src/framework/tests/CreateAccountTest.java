package framework.tests;

import java.io.IOException;

import org.testng.annotations.Test;


public class CreateAccountTest extends SonyTestBase {

	@Test
	public void test() throws IOException {
		// given: "Create a user account"
		
		
		// when: "The user navigates to login page"
		pageFactory.headerPage(driver).getSignIn().click();
		// and:  "the user navigates to the create account page"
		pageFactory.myAccountPage(driver).getCreateAccount().click();
		// and:  "User enters data into email aad password fields"
		pageFactory.createAccountPage(driver).createAccount();
		//then:  "User account is created"
		
	}

}