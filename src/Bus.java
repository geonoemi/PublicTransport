import java.io.*;
import java.util.*;

public class Bus extends Line {
	
	private static ArrayList<Bus> buses=new ArrayList<>();
	private static ArrayList<String> busesLineNums=new ArrayList<>();
			
	public static ArrayList<Bus> getBuses() {
		return buses;
	}

	public static ArrayList<String> getBusesLineNums() {
		return busesLineNums;
	}

	public Bus(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces, 
			   Boolean needToRepair, String typeOfFuel, boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel, typeOfVehicle);
	}

	public static void readIn(){ 
			
		try {
				
			FileReader reader=new FileReader("classes files\\buses.txt");
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
				
			while((line=buffer.readLine())!=null) {
					
				String parts[] = line.split(",");
						
				lineNums.add(parts[0]);
				isArticulate.add(Boolean.valueOf(parts[1]));
				isLowFloor.add(Boolean.parseBoolean(parts[2]));
				operationCosts.add(Double.parseDouble(parts[3]));
				numberOfSeats.add(Integer.parseInt(parts[4]));
				hasBicycleTransportOpp.add(Boolean.parseBoolean(parts[5]));
				disabledPlaces.add(Integer.parseInt(parts[6]));
				needsToRepair.add(Boolean.parseBoolean(parts[7]));
				fuelTypes.add(parts[8]);
				hasWheels.add(Boolean.parseBoolean(parts[9]));
				typeOfVehicles.add(parts[10]);
								
				Bus bus=new Bus(lineNums.get(i), isArticulate.get(i), isLowFloor.get(i), operationCosts.get(i),  numberOfSeats.get(i),
								hasBicycleTransportOpp.get(i),  disabledPlaces.get(i), 	needsToRepair.get(i), fuelTypes.get(i), hasWheels.get(i), typeOfVehicles.get(i));

				buses.add((Bus) bus);
				
				i++;
			}
				
			buffer.close();
				
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
			System.out.println("Not appropriate input type.");			}		
	}
	
	public static void fillBusLineNums() { //used in printBusLineNums()
			
		for(Bus bus:buses) {
			busesLineNums.add(bus.lineNum);
		}
	}
		
	public static void printBusLineNums() { //used in Route.getARoute
			
		busesLineNums.clear();
		fillBusLineNums();
		
		for(String linenum: busesLineNums) {
			System.out.println(linenum);
		}
	}
}

