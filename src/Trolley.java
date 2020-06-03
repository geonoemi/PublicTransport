
public class Trolley extends Vehicle implements Electric {
		
		private boolean hasWheel=true;
		
		public Trolley(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
						double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
						boolean needToRepair, String typeOfFuel, boolean hasWheel) {
				super(lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
						numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
		}

		@Override
		public boolean canRunAlongHere(Station station) {
			return station.hasCable();
		}
	
		
		public static void main(String[] args) {
			
			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\classes files\\trolleys.txt");
			for(Vehicle v: vehicles) {
				if(v.getClass().equals(Trolley.class)) {
					System.out.println("This is a trolley.");
				}
				if(v.lowFloor && v.numOfDisabledPlaces>=1) {
					//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(v.lineNum, v.lineLetter, v.way, v.articulated, v.lowFloor,
					//	v.operationCost,  v.numOfSeats, v.bicycleTransportOpp, v.numOfDisabledPlaces, v. needToRepair, v.typeOfFuel, v.hasWheel);
					wheelChairAccessibleVehicles.add((WheelChairAccessible) v);
				}
					
				if(v.needToRepair) {
					toService.add(v);
				}	
				
				if(v.bicycleTransportOpp) {
					bicycleVehicles.add(v);
				}
			}
		}	
	}
