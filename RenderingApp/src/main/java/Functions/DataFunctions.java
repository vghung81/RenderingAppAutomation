package Functions;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import au.com.bytecode.opencsv.*;
public class DataFunctions {

	String CSV_PATH;
	
	
	public void csvDataRead(String CSV_PATH) throws IOException{
		  
		  CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		  String [] csvCell;
		  //while loop will be executed till the last line In CSV.
		  while ((csvCell = reader.readNext()) != null) {   
		   String FName = csvCell[0];
		   String LName = csvCell[1];
		   String Email = csvCell[2];
		   String Mob = csvCell[3];
		   String company = csvCell[4];
		  
		  }  
		 }
	
}
	
	
	
	
	
