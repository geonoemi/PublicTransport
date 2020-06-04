
public class Tram extends Vehicle implements Electric{

	
	public Tram( int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
				double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
				boolean needToRepair, String typeOfFuel, boolean hasWheel) {
			super( lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
				numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
	}

	@Override
	public boolean canRunAlongHere(Station station) {
		return station.hasCable();
	}

	public static void main(String[] args) {
		
		readIn("classes files\\trams.txt");
		
		for(Vehicle vehicle: vehicles) {
			if(vehicle.getClass().equals(Tram.class)) {
				System.out.println("This is a tram.");
			}
			if(vehicle.lowFloor && vehicle.numOfDisabledPlaces>=1) {
				//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(vehicle.lineNum, vehicle.lineLetter, vehicle.way, vehicle.articulated, vehicle.lowFloor,
				//vehicle.operationCost,  vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces, vehicle. needToRepair, vehicle.typeOfFuel, vehicle.hasWheel);
				wheelChairAccessibleVehicles.add( vehicle);
			}
				
			if(vehicle.needToRepair) {
				toService.add(vehicle);
			}	
			
			if(vehicle.bicycleTransportOpp) {
				bicycleVehicles.add(vehicle);
			}
		}
	}




}


