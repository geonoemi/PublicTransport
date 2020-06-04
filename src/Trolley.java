
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
}
