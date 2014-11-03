package framework.tests;

import java.io.IOException;
import org.testng.annotations.Test;



public class CreateAccount extends TestBase {

	@Test
	public void test() throws IOException {
		// given: "Create a user account"
		driver.get("http://store.sony.com");
		
		// when: "User navigates to login page"
		frontPage.getSignIn().click();
		// and:  "User enters data into email aad password fields"
		
		//then:  "User account is created"

	}

}