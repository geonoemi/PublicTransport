
public class WheelChairAccessible  extends Vehicle{

	public WheelChairAccessible(String lineNum, boolean articulate, boolean lowFloor, double operationCost,
			int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,
			String typeOfFuel, boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	
	public static void fillWheelChairAccessibleVehicles() {
		
		for (Vehicle vehicle : vehicles) {
			if(vehicle.lowFloor && vehicle.numOfDisabledPlaces>=1) {
			 	
				Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(vehicle.lineNum,  vehicle.articulate, vehicle.lowFloor,
			 			vehicle.operationCost, vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces,
			 			vehicle.needToRepair, vehicle.typeOfFuel, vehicle.hasWheel, vehicle.typeOfVehicle);

						wheelChairAccessibleVehicles.add((Vehicle) wheelchairAccessibleVehicle);
			}
		}
	}

	public static void printWheelChairAccessibleVehicles() {
		
		fillWheelChairAccessibleVehicles();
		for(Vehicle wheelChairAccessibleVehicles:wheelChairAccessibleVehicles) {
			System.out.println(wheelChairAccessibleVehicles);
		}
		
	}
	public static void main (String[]args) {
		Vehicle.readIn("classes files\\vehicles.txt");

		printWheelChairAccessibleVehicles();
	}
	
}