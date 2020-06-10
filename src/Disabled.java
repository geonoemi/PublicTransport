import java.util.ArrayList;

public class Disabled extends Vehicle {

	public Disabled(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	
	static ArrayList<Disabled> disabledTrams = new ArrayList<>();
	static ArrayList<Disabled> disabledBuses = new ArrayList<>();
	static ArrayList<Disabled> disabledTrolleys = new ArrayList<>();

	
	public static void fillDisabledTrams() {
		
		Tram.readIn("classes files\\trams.txt");
		
		for(Tram trams: Tram.trams) {
		
			if(trams.lowFloor && trams.numOfDisabledPlaces>=1) {
			
				Disabled disabledTram=new Disabled(trams.lineNum,  trams.articulate, trams.lowFloor,
			 			trams.operationCost, trams.numOfSeats, trams.bicycleTransportOpp, trams.numOfDisabledPlaces,
			 			trams.needToRepair, trams.typeOfFuel, trams.hasWheel, trams.typeOfVehicle);
				
				disabledTrams.add(disabledTram);
			}	
		}
	}
	
	public static void printDisabledTrams() {
		//disabledTrams.clear();
		fillDisabledTrams();
		
		for(Disabled disabledTrams: disabledTrams ) {
			System.out.println(disabledTrams);
		}
	}
	
	public static void fillDisabledBuses() {	
		
		Bus.readIn("classes files\\buses.txt");
			
		for(Bus buses: Bus.buses) {
			
			if(buses.lowFloor && buses.numOfDisabledPlaces>=1) {
				
				Disabled disabledBus=new Disabled(buses.lineNum,  buses.articulate, buses.lowFloor,
			 			buses.operationCost, buses.numOfSeats, buses.bicycleTransportOpp, buses.numOfDisabledPlaces,
			 			buses.needToRepair, buses.typeOfFuel, buses.hasWheel, buses.typeOfVehicle);
			
				disabledBuses.add(disabledBus);
			}	
		}
	}
	
	public static void printDisabledBuses() {
		//disabledBuses.clear();
		fillDisabledBuses();
		
		for(Disabled disabledBuses: disabledBuses ) {
			System.out.println(disabledBuses);
		}
	}
	
	public static void fillDisabledTrolleys() {	
		
		Trolley.readIn("classes files\\trolleys.txt");
		
		for(Trolley trolleys: Trolley.trolleys) {
		
			if(trolleys.lowFloor && trolleys.numOfDisabledPlaces>=1) {
				
				Disabled disabledTrolley=new Disabled(trolleys.lineNum,  trolleys.articulate, trolleys.lowFloor,
			 			trolleys.operationCost, trolleys.numOfSeats, trolleys.bicycleTransportOpp, trolleys.numOfDisabledPlaces,
			 			trolleys.needToRepair, trolleys.typeOfFuel, trolleys.hasWheel, trolleys.typeOfVehicle); 
			
				disabledTrolleys.add(disabledTrolley);
			}	
		}
	}	

	public static void printDisabledTrolleys() {
		//disabledTrolleys.clear();
		fillDisabledTrolleys();
		
		for(Disabled disabledTrolleys: disabledTrolleys ) {
			System.out.println(disabledTrolleys);
		}
	}
	
	public static void main (String[]args) {
			
		printDisabledTrams();
		printDisabledBuses();
		printDisabledTrolleys();

		
	/*	fillDisabledBuses();
		
		for(Disabled disabledBuses: disabledBuses ) {
			System.out.println(disabledBuses);
		}
		fillDisabledTrolleys();
		
		for(Disabled disabledTrolleys: disabledTrolleys ) {
			System.out.println(disabledTrolleys);
		}*/
	}
}
