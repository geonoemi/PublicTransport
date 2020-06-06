import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepartureTimes extends Route {
	
	
	public DepartureTimes(String lineNum, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	public static void readInDepartureTimes(String directoryName) {
		   
        File directory = new File(directoryName);
        ArrayList<String> departureTimesList = new ArrayList<String>(Arrays.asList(directory.list()));
    
        for(String list: departureTimesList) {
        	
        	if(list.equals(userChoice+".txt")) {
        		Route.readIn("departure times\\"+list);
        	}
        }
    } 
}