
public class Trolley extends Vehicle implements Electric {
		
		public Trolley(String lineNum, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel) {
		super(lineNum, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel);
	}



		private boolean hasWheel=true;
		
	

		@Override
		public boolean canRunAlongHere(Station station) {
			return station.hasCable();
		}
}
