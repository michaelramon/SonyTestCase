package framework.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportProductData {
	
	
	String item;
	ArrayList<String> productString = new ArrayList<String>();
	int listSize;

	public ImportProductData() throws IOException {

		// import a File Reader and set up txt file to pull data from
		FileReader productPrint = new FileReader("Products.txt");
		// import a buffer reader
		BufferedReader productBuff = new BufferedReader(productPrint);

		// create a scanner
		Scanner productScanner = new Scanner(productBuff);
			
		try {
			// use while loop to pull data
			do {
				productString.add(productScanner.nextLine());

			} while (productScanner.hasNextLine());

		} catch (Exception IOException) {
		}

		listSize = getSize();
		productScanner.close();

	}
	public int getSize(){
		return productString.size();
	}

}
