package AirlineReservationSystem.JavaProject;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;

//class for fetching data from csv files and storing into a list 
public class ArrayListData 
{ 
	List<FlightDetails> list = new ArrayList<FlightDetails>(); 
	public List<FlightDetails> getArray() 
	{ 
		CSVParser csvParser = new CSVParserBuilder().withSeparator('|').build(); 
		File dir = new File("\"C:\\Users\\reddy\\OneDrive\\Drive\\Flights.docx\""); 
		File[] file = dir.listFiles(); 
		for (File f : file) 
		{ 
			try 
			{ 
				CSVReader csvReader = new CSVReaderBuilder(new FileReader(f.getAbsolutePath())).withCSVParser(csvParser).withSkipLines(1).build();
				String[] record = null;
				while((record= csvReader.readNext()) != null) 
				{
					FlightDetails fm = new FlightDetails (record[0], record[1], record[2], record[3], record[4], Double.parseDouble  										(record [5]), Double.parseDouble (record [6]), record [7], record [8]); 
					list.add(fm); 
				} 
			} 
			catch (Exception e) 
			{
				e.printStackTrace(); 
			} 
		}
		return list;
	}
}