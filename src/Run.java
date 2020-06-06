import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class Run {

	public static void main(String[] args) {

		Route.getARoute();

		//Vehicle.readIn("classes files\\vehicles.txt");
		//Vehicle.fillArrayLists();
		//Vehicle.printBuses();
		
		//Route.printDayTypeList(Route.dayTypeList);
		
		//Vehicle.printLineNums();
	//	Station.readIn("classes files\\stations.txt");
		//Station.printStations(Station.stationNames);
		
		//Vehicle.printVehicleTypes(vehicleTypes);
		//Vehicle.printVehicles(Vehicle.vehicles);
			
		
		/*for(Vehicle vehicles: Vehicle.vehicles) {
			System.out.println(trolleys.toString());
		}*/
		
		//Route.printVehicleTypes(Route.vehicleTypes); //szülõ public static metódusát a gyermek nem éri el 
		//Route.printVehicles(Route.vehicles);	//itt sem
		
		//Route.printStations(Station.stationNames);
		
		
		//Station.readIn("classes files\\stations.txt");
		
		//Collator hu = Collator.getInstance(new Locale("hu","HU"));
		//Station.sortStationNames(hu,Station.stationNames);

		//Station.printStations(Station.stations); 
		//Station.canRunAlongHere(false); // TODO: method returns true or false, but return value not used, just displaying
		
		
	/*	Bus.readIn("classes files\\buses.txt");
		
		for(Vehicle vehicle: Vehicle.vehicles) {
			if(vehicle.getClass().equals(Bus.class)) {
				System.out.println("This is a bus.");
			}
			if(vehicle.lowFloor && vehicle.numOfDisabledPlaces>=1) {
				//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(vehicle.lineNum, vehicle.lineLetter, vehicle.way, vehicle.articulated, vehicle.lowFloor,
				//	vehicle.operationCost,  vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces, vehicle. needToRepair, vehicle.typeOfFuel, vehicle.hasWheel);
				Bus.wheelChairAccessibleVehicles.add(vehicle); // TODO: may cause ClassCastEx.
			}
				
			if(vehicle.needToRepair) {
				Bus.toService.add(vehicle);
			}
			
			if(vehicle.bicycleTransportOpp) {
				Bus.bicycleVehicles.add(vehicle);
			}
			
			if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil")) {
				Bus.fossilVehicles.add(vehicle);
			}else {
				Bus.electricVehicles.add(vehicle);
			} 
		}*/

		
	/*	Tram.readIn("classes files\\trams.txt");
		
		for(Vehicle vehicle: Vehicle.vehicles) {
			if(vehicle.getClass().equals(Tram.class)) {
				System.out.println("This is a tram.");
			}
			if(vehicle.lowFloor && vehicle.numOfDisabledPlaces>=1) {
				//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(vehicle.lineNum, vehicle.lineLetter, vehicle.way, vehicle.articulated, vehicle.lowFloor,
				//vehicle.operationCost,  vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces, vehicle. needToRepair, vehicle.typeOfFuel, vehicle.hasWheel);
				Tram.wheelChairAccessibleVehicles.add( vehicle);
			}
				
			if(vehicle.needToRepair) {
				Tram.toService.add(vehicle);
			}	
			
			if(vehicle.bicycleTransportOpp) {
				Tram.bicycleVehicles.add(vehicle);
			}
		}
	}	*/
	
	/*	Trolley.readIn("classes files\\trolleys.txt");
		for(Vehicle vehicle: Vehicle.vehicles) {
			
			if(vehicle.getClass().equals(Trolley.class)) {
				System.out.println("This is a trolley.");
			}
			if(vehicle.lowFloor && vehicle.numOfDisabledPlaces>=1) {
				//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(vehicle.lineNum, vehicle.lineLetter, vehicle.way, vehicle.articulated, vehicle.lowFloor,
				//	vehicle.operationCost,  vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces, vehicle. needToRepair, vehicle.typeOfFuel, vehicle.hasWheel);
				Trolley.wheelChairAccessibleVehicles.add(vehicle);
			}
				
			if(vehicle.needToRepair) {
				Trolley.toService.add(vehicle);
			}	
			
			if(vehicle.bicycleTransportOpp) {
				Trolley.bicycleVehicles.add(vehicle);
			}
		}*/
		
		
		
		//DirectoryTry.readInDepartureTimes("departure times");
		//System.out.println(Route.userChoice);
		
		//FileWriting.fileWriting();
	}
}
