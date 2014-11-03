package framework.pages;



import org.openqa.selenium.WebDriver;

import framework.factories.SonyPageFactory;

public class SonyCreateAccountPage extends CreateAccountPage{
	SonyPageFactory pageFactory = new SonyPageFactory(driver);

	public SonyCreateAccountPage(WebDriver driver) {
		super(driver);
	}

}
