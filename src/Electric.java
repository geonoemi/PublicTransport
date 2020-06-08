
public interface Electric {
	
	boolean canRunAlongHere(Station station);
	
	public static void fillElectricVehicles() {
		
		for (Vehicle vehicle : Vehicle.vehicles) {
			if(vehicle.typeOfFuel.equals("electrical energy")){
				Vehicle.electricVehicles.add(vehicle);
			}
		}
	}

	public static void printElectricVehicles() {
		
		fillElectricVehicles();
		for( Vehicle electric:Vehicle.electricVehicles) {
			System.out.println(electric);
		}
	}
	public static void main (String[]args) {
		Vehicle.readIn("classes files\\vehicles.txt");
		printElectricVehicles();
	}
	
}
