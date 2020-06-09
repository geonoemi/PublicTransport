import java.util.ArrayList;

public class WheelChair extends Vehicle {

	public WheelChair(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	
	static ArrayList<WheelChair> wheelChairAccessibleVehicles = new ArrayList<>();
	
	public static void fillWheelChairAccessibleTrams() {
		
		Tram.readIn("classes files\\trams.txt");
		
		for(Tram trams: Tram.trams) {
			if(trams.lowFloor && trams.numOfDisabledPlaces>=1) {
				WheelChair wheelchairAccessibleTram=new WheelChair(trams.lineNum,  trams.articulate, trams.lowFloor,
			 			trams.operationCost, trams.numOfSeats, trams.bicycleTransportOpp, trams.numOfDisabledPlaces,
			 			trams.needToRepair, trams.typeOfFuel, trams.hasWheel, trams.typeOfVehicle);

						wheelChairAccessibleVehicles.add(wheelchairAccessibleTram);
					//System.out.println(wheelchairAccessibleTram);
			}	
		}
	}	
	public static void fillWheelChairAccessibleBuses() {	
		Bus.readIn("classes files\\buses.txt");
		
		for(Bus buses: Bus.buses) {
			if(buses.lowFloor && buses.numOfDisabledPlaces>=1) {
				WheelChair wheelchairAccessibleBus=new WheelChair(buses.lineNum,  buses.articulate, buses.lowFloor,
			 			buses.operationCost, buses.numOfSeats, buses.bicycleTransportOpp, buses.numOfDisabledPlaces,
			 			buses.needToRepair, buses.typeOfFuel, buses.hasWheel, buses.typeOfVehicle);

						wheelChairAccessibleVehicles.add(wheelchairAccessibleBus);
						//System.out.println(wheelchairAccessibleBus);
			}	
		}
	}

	public static void main (String[]args) {
		fillWheelChairAccessibleBuses();
		fillWheelChairAccessibleTrams();

		for(WheelChair wheelChairAccessibleVehicles : wheelChairAccessibleVehicles) {
				System.out.println(wheelChairAccessibleVehicles);
		}
	}
	/*	
	
	public static void main (String[]args) {
		
		Vehicle.readIn("classes files\\vehicles.txt");

		printWheelChairAccessibleVehicles();
	}
	*/
}
