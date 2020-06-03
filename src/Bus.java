	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

public class Bus extends Vehicle implements Fossil {

		private String plateNumber;
		
		public Bus(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
					double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
					boolean needToRepair, String typeOfFuel, boolean hasWheel) {
			super( lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
					numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
		}
	
		
		public static void main(String[] args) {
		
			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\classes files\\buses.txt");
			
			for(Vehicle vehicle: vehicles) {
				if(vehicle.getClass().equals(Bus.class)) {
					System.out.println("This is a bus.");
				}
				if(vehicle.lowFloor && vehicle.numOfDisabledPlaces>=1) {
					//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(vehicle.lineNum, vehicle.lineLetter, vehicle.way, vehicle.articulated, vehicle.lowFloor,
					//	vehicle.operationCost,  vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces, vehicle. needToRepair, vehicle.typeOfFuel, vehicle.hasWheel);
					wheelChairAccessibleVehicles.add((WheelChairAccessible) vehicle); // TODO: may cause ClassCastEx.
				}
					
				if(vehicle.needToRepair) {
					toService.add(vehicle);
				}
				
				if(vehicle.bicycleTransportOpp) {
					bicycleVehicles.add(vehicle);
				}
				
				if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil")) {
					fossilVehicles.add(vehicle);
				}else {
					electricVehicles.add(vehicle);
				} 
			}
		}

	}


