import java.util.ArrayList;

public class Electric extends Vehicle {
	
	public Electric(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}
	/*
	boolean canRunAlongHere(Station station);
	protected static ArrayList<Vehicle> electricVehicles=new ArrayList<>();

	public static void fillElectricVehicles() {
		
		for (Vehicle vehicle : Vehicle.vehicles) {
			
			if(vehicle.typeOfFuel.equals("electrical energy")){
				
				Electric electric=new Electric(vehicle.lineNum,  vehicle.articulate, vehicle.lowFloor,
			 			vehicle.operationCost, vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces,
			 			vehicle.needToRepair, vehicle.typeOfFuel, vehicle.hasWheel, vehicle.typeOfVehicle);

				electricVehicles.add((Electric) electric);
				
			}
		}
	}

	public static void printElectricVehicles() {
		
		fillElectricVehicles();
		
		for( Vehicle electric:electricVehicles) {
			System.out.println(electric);
		}
	}
	public static void main (String[]args) {
		
		
		printElectricVehicles();
	}*/
	
}
