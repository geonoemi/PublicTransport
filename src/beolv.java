import java.io.File;
import java.text.Collator;
import java.util.*;
public class beolv {
	//trying class
	public static void readInDepartureTimes(String directoryName) {
		   
        File directory = new File(directoryName);
        ArrayList<String> departureTimesList = new ArrayList<String>(Arrays.asList(directory.list()));

        for(String list: departureTimesList) {
        	if(list.contains("2 FORTH")) {
        	System.out.println(list);
        	}
        }
    } 
	
	public static void main(String[] args) {

		   readInDepartureTimes("departure times");

	}
}
