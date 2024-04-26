package Utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class Dataprovider {

	@DataProvider(name="website_link")
	public String[][] getData() throws IOException{ //getting webSite link
		
		String filepath="C:\\Users\\2318691\\eclipse-workspace\\Main_Project\\testDataChrome\\DataChrome.xlsx";
        
		String array[][]=new String[1][1];
		
		array[0][0]= ExcelUtils.getCellData(filepath,"Sheet1",6, 5);
		return array; 
				
	
}
}
