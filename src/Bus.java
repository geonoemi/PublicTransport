	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

public class Bus extends Vehicle implements Fossil {

		public Bus(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

		private String plateNumber;
		
		public static void fillBus(){
			for(Vehicle vehicle: vehicles) {
				
				if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil") && vehicle.hasWheel) {
					buses.add(vehicle);
				}
			}
		}	
		public static void printBus() {
			fillBus();
			for(Vehicle bus:buses) {
				System.out.println(bus);
			}
		}
		public static void main (String[]args) {
			Vehicle.readIn("classes files\\vehicles.txt");
			printBus();
		}}


