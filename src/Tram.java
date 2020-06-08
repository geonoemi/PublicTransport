
public class Tram extends Vehicle implements Electric{

	

	public Tram(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	@Override
	public boolean canRunAlongHere(Station station) {
		return station.hasCable();
	}
	
	public static void fillTram(){
		
		for(Vehicle vehicle: vehicles) {
			
			if(vehicle.typeOfFuel.equals("electrical energy") && !vehicle.hasWheel) {
				trams.add(vehicle);
			}
		}
	}	
	
	public static void printTram() {
		fillTram();
		for(Vehicle tram:trams) {
			System.out.println(tram);
		}
	}
	
	public static void fillTramLineNums() { //used in printTramLineNums()
		//fillVehicles();
		for(Vehicle tram:trams) {
			tramsLineNums.add(tram.lineNum);
		}
	}
	
	public static void printTramLineNums() { //used in Route.getARoute()
		
		tramsLineNums.clear();
		fillTramLineNums();
		for(String linenum: tramsLineNums) {
			System.out.println(linenum);
		}
	}
	
}


