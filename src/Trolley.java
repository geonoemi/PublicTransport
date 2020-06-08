
public class Trolley extends Vehicle implements Electric {
		
		
		public Trolley(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
				boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
				boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
					typeOfFuel, hasWheel, typeOfVehicle);
		}

		private boolean hasWheel=true;

		@Override
		public boolean canRunAlongHere(Station station) {
			return station.hasCable();
		}
		public static void fillTrolley(){
			
			for(Vehicle vehicle: vehicles) {
				
				if(vehicle.typeOfFuel.equals("electrical energy") && vehicle.hasWheel) {
					trolleys.add(vehicle);
				}
			}
		}	
		
		public static void printTrolley() {
			fillTrolley();
			for(Vehicle trolley:trolleys) {
				System.out.println(trolley);
			}
		}
		
		public static void main (String[]args) {
			Vehicle.readIn("classes files\\vehicles.txt");
			printTrolley();
		}
}
