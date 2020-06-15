import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Trolley extends Line  {	
	
	private static ArrayList<Trolley> trolleys=new ArrayList<>();
	private static ArrayList<String> trolleysLineNums=new ArrayList<>();
	
	public static ArrayList<Trolley> getTrolleys() {
		return trolleys;
	}

	public static ArrayList<String> getTrolleysLineNums() {
		return trolleysLineNums;
	}

	public Trolley(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces, 
					   Boolean needToRepair, String typeOfFuel,	boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
	}

	public static void readIn(){ 
			
		try {
				
			FileReader reader=new FileReader("txt files of classes\\trolleys.txt");
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
						
				Trolley trolley=new Trolley(lineNums.get(i), isArticulate.get(i), isLowFloor.get(i), operationCosts.get(i),  numberOfSeats.get(i), 	
											hasBicycleTransportOpp.get(i),  disabledPlaces.get(i), 	needsToRepair.get(i), fuelTypes.get(i), hasWheels.get(i), typeOfVehicles.get(i));
				trolleys.add(trolley);				
				
				i++;
			}
				
			buffer.close();
				
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
			System.out.println("Not appropriate input type.");
		}		
	}

	public static void fillTrolleyLineNums() { //used in printTrolleyNums
		//fillVehicles();
		for(Trolley trolley:trolleys) {
			trolleysLineNums.add(trolley.lineNum);
		}
	}
		
	public static void printTrolleyLineNums() { //used in Route.getARoute()
		
		trolleysLineNums.clear();
		fillTrolleyLineNums();
		for(String linenum: trolleysLineNums) {
			System.out.println(linenum);
		}
	}		
}
