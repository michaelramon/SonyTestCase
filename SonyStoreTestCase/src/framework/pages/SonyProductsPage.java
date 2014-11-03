package framework.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SonyProductsPage extends ProductsPage {

	public SonyProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public WebElement getProductTitle(){
		return findByCSSselector("h1.ws-product-title.fn");
	}
	
	

}
