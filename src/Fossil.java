import java.util.ArrayList;

public class Fossil extends Vehicle{
	
	public Fossil(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces, 
				  boolean needToRepair, String typeOfFuel, boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
	}

	protected static ArrayList<Fossil> fossilVehicles=new ArrayList<>();
/*	public static void fillFossilVehicles() {
		
		for (Vehicle vehicle : Vehicle.vehicles) {
			
			if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil")) {
				
				Fossil fossil=new Fossil(vehicle.lineNum,  vehicle.articulate, vehicle.lowFloor, vehicle.operationCost, vehicle.numOfSeats, vehicle.bicycleTransportOpp, 
										 vehicle.numOfDisabledPlaces, vehicle.needToRepair, vehicle.typeOfFuel, vehicle.hasWheel, vehicle.typeOfVehicle);

				fossilVehicles.add(fossil);
			}
		}
	}
	
	public static void printFossilVehicles() {
		
		fillFossilVehicles();
		
		for( Fossil fossil:fossilVehicles) {
			System.out.println(fossil);
		}
	}
	*/
}
