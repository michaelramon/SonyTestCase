package framework.data;

import java.io.IOException;

public class SonyProductData {
	

	SonyImportProductData product1;

	public SonyProductData() throws IOException {
		product1 = new SonyImportProductData();
	
	}
	

	public String getItem(int location){
		return product1.productString.get(location);
	}
	
	public int getListSize(){
		return product1.getSize();
	}
	
}
