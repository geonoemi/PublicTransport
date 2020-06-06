import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepartureTimes extends Route {
	
	public static DayType dayTypes;
	public static ArrayList<String> dayTypeList =new ArrayList<>();
	
	public DepartureTimes(String lineNum, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	public static void fillDayTypeList() {
		for (DayType dayTypes : DayType.values()) {
			dayTypeList.add(dayTypes.toString().replaceAll("(?<=[A-Z])\\_", " ").toLowerCase());
		}
	}
	
	public static void printDayTypeList(ArrayList<String> dayTypeList) {
		fillDayTypeList();
		for(String dayType : dayTypeList) {
			System.out.println(dayType);
		}
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
	public static void main(String[] args) {

		Vehicle.readIn("classes files\\vehicles.txt");
		printDayTypeList(dayTypeList);
	}
}