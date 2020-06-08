import java.util.ArrayList;

public class Trolley extends Vehicle  {	
	
	private boolean hasWheel=true;
	protected static ArrayList<String> trolleysLineNums=new ArrayList<>();
		
	protected static ArrayList<Trolley> trolleys=new ArrayList<>();
		
		public Trolley(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
				boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
				boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
					typeOfFuel, hasWheel, typeOfVehicle);
		}

		public static void fillTrolley(){
			
			for(Vehicle vehicle: vehicles) {
				
				if(vehicle.typeOfFuel.equals("electrical energy") && vehicle.hasWheel) {
					
					Trolley trolley=new Trolley(vehicle.lineNum,  vehicle.articulate, vehicle.lowFloor,
				 			vehicle.operationCost, vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces,
				 			vehicle.needToRepair, vehicle.typeOfFuel, vehicle.hasWheel, vehicle.typeOfVehicle);

					trolleys.add((Trolley) trolley);
				}
			}
		}	
		
		public static void printTrolley() {
			fillTrolley();
			for(Vehicle trolley:trolleys) {
				System.out.println(trolley);
			}
		}
		
		public static void fillTrolleyLineNums() { //used in printTrolleyNums
			//fillVehicles();
			for(Vehicle trolley:trolleys) {
				trolleysLineNums.add(trolley.lineNum);
			}
		}
		
		public static void printTrolleyLineNums() { //used in Route.getARoute()
			
			trolleysLineNums.clear();
			fillTrolleyLineNums();
			for(String linenum: trolleysLineNums) {
				System.out.println(linenum);
			}
		}		
		public static void main(String[] args) {
			Vehicle.readIn("classes files\\vehicles.txt");
			fillTrolley();

			printTrolleyLineNums();	
		}
	
}
