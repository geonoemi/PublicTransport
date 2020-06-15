import java.util.ArrayList;

public class Disabled extends Line {

	public Disabled(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,	boolean bicycleTransportOpp, int numOfDisabledPlaces, 
					boolean needToRepair, String typeOfFuel,boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
	}
	static ArrayList<Disabled> disabledVehicles = new ArrayList<>();
	
	static ArrayList<Disabled> disabledTrams = new ArrayList<>();
	static ArrayList<Disabled> disabledBuses = new ArrayList<>();
	static ArrayList<Disabled> disabledTrolleys = new ArrayList<>();

	
	public static void fillDisabledTrams() {
		
		Tram.readIn();
		
		for(Tram trams: Tram.trams) {
		
			if(trams.lowFloor && trams.numOfDisabledPlaces>=1) {
			
				Disabled disabledTram=new Disabled(trams.lineNum,  trams.articulate, trams.lowFloor, trams.operationCost, trams.numOfSeats, trams.bicycleTransportOpp,
												   trams.numOfDisabledPlaces, trams.needToRepair, trams.typeOfFuel, trams.hasWheel, trams.typeOfVehicle);
				
				disabledVehicles.add(disabledTram);
			}	
		}
	}
	
	public static void printDisabledTrams() {
		
		disabledVehicles.clear();
		fillDisabledTrams();
		
		for(Disabled disabledTrams: disabledVehicles ) {
			System.out.println(disabledTrams.lineNum);
		}
	}
	
	public static void fillDisabledBuses() {	
		
		Bus.readIn();
			
		for(Bus buses: Bus.buses) {
			
			if(buses.lowFloor && buses.numOfDisabledPlaces>=1) {
				
				Disabled disabledBus=new Disabled(buses.lineNum,  buses.articulate, buses.lowFloor, buses.operationCost, buses.numOfSeats, buses.bicycleTransportOpp, 
												  buses.numOfDisabledPlaces, buses.needToRepair, buses.typeOfFuel, buses.hasWheel, buses.typeOfVehicle);
			
				disabledVehicles.add(disabledBus);
			}	
		}
	}
	
	public static void printDisabledBuses() {
		
		disabledVehicles.clear();
		fillDisabledBuses();
		
		for(Disabled disabledBuses: disabledVehicles ) {
			System.out.println(disabledBuses.lineNum);
		}
	}
	
	public static void fillDisabledTrolleys() {	
		
		Trolley.readIn();
		
		for(Trolley trolleys: Trolley.trolleys) {
		
			if(trolleys.lowFloor && trolleys.numOfDisabledPlaces>=1) {
				
				Disabled disabledTrolley=new Disabled(trolleys.lineNum,  trolleys.articulate, trolleys.lowFloor, trolleys.operationCost, trolleys.numOfSeats, 
													  trolleys.bicycleTransportOpp, trolleys.numOfDisabledPlaces,	trolleys.needToRepair, trolleys.typeOfFuel, 
													  trolleys.hasWheel, trolleys.typeOfVehicle); 
			
				disabledVehicles.add(disabledTrolley);
			}	
		}
	}	

	public static void printDisabledTrolleys() {
		
		disabledVehicles.clear();
		fillDisabledTrolleys();
		
		for(Disabled disabledTrolleys: disabledVehicles ) {
			System.out.println(disabledTrolleys.lineNum);
		}
	}
	
	public static void main (String[]args) {
	
		printDisabledTrams();
		printDisabledBuses();
		printDisabledTrolleys();
	/*	for(Disabled disabled: disabledVehicles ) {
			System.out.println(disabled.lineNum);
		}*/
	}
}
