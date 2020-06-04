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
}


