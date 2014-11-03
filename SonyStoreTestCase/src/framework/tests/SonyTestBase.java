package framework.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import framework.factories.DataFactory;
import framework.factories.SonyPageFactory;

public class SonyTestBase extends TestBase {
	protected SonyPageFactory pageFactory;

	@BeforeTest
	@Override
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://store.sony.com");
	}

	@BeforeClass
	@Override
	public void createVariables() throws IOException {
		pageFactory = new SonyPageFactory(driver);
		dataFactory = new DataFactory();
	}

}
