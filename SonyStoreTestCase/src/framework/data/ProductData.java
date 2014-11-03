package framework.data;

import java.io.IOException;

public class ProductData {
	

	ImportProductData product1;

	public ProductData() throws IOException {
		product1 = new ImportProductData();
	
	}
	

	public String getItem(int location){
		return product1.productString.get(location);
	}
	
	public int getListSize(){
		return product1.getSize();
	}
	
}
