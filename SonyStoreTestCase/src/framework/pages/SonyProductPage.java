package framework.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SonyProductPage extends ProductsPage {

	public SonyProductPage(WebDriver driver) throws IOException {
		super(driver);
	}
	
	@Override
	public WebElement getProductTitle(){
		return findByCSSselector("h1.ws-product-title.fn");
	}
	
	

}
