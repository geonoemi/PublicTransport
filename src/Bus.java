	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
import java.util.ArrayList;

public class Bus extends Vehicle {

		public Bus(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}
		protected static ArrayList<Bus> buses=new ArrayList<>();
		protected static ArrayList<String> busesLineNums=new ArrayList<>();
		
		private String plateNumber;
		
		public static void fillBus(){
		//	Vehicle.readIn("classes files\\vehicles.txt");
			for(Vehicle vehicle: vehicles) {
				
				if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil") && vehicle.hasWheel) {
					
					Bus bus=new Bus(vehicle.lineNum,  vehicle.articulate, vehicle.lowFloor,
				 			vehicle.operationCost, vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces,
				 			vehicle.needToRepair, vehicle.typeOfFuel, vehicle.hasWheel, vehicle.typeOfVehicle);

					buses.add((Bus) bus);
				}
			}
		}	
		
		public static void printBus() {
			fillBus();
			for(Vehicle bus:buses) {
				System.out.println(bus);
			}
		}
		
		public static void fillBusLineNums() { //used in printBusLineNums()
			//fillVehicles();
			for(Vehicle bus:buses) {
				busesLineNums.add(bus.lineNum);
			}
		}
		
		public static void printBusLineNums() { //used in Route.getARoute
			
			busesLineNums.clear();
			fillBusLineNums();
			for(String linenum: busesLineNums) {
				System.out.println(linenum);
			}
		}
		public static void main (String[]args) {
			
			Vehicle.readIn("classes files\\vehicles.txt");
			fillBus();
			printBusLineNums();
		}
}


