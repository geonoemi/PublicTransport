
public interface Fossil {

	public static void fillFossilVehicles() {
		
		for (Vehicle vehicle : Vehicle.vehicles) {
			if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil")) {
				Vehicle.fossilVehicles.add(vehicle);
			}
		}
	}
	
	public static void printFossilVehicles() {
		
		fillFossilVehicles();
		for( Vehicle fossil:Vehicle.fossilVehicles) {
			System.out.println(fossil);
		}
	}
	
}
