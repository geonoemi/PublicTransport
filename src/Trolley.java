
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
}
