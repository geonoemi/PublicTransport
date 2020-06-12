import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
import java.util.InputMismatchException;
	
public abstract class Line {
	//láthatóságokat ellenõrizni	
		protected String lineNum;
		protected boolean articulate;
		protected boolean lowFloor;
		protected double operationCost;
		protected int numOfSeats;
		protected boolean bicycleTransportOpp;
		protected int numOfDisabledPlaces;
		protected boolean needToRepair;
		protected String typeOfFuel;
		protected boolean hasWheel;
		protected String typeOfVehicle;
		
		protected static ArrayList<String> lineNums=new ArrayList<>();
		protected static ArrayList<Boolean> isArticulate=new ArrayList<>();
		protected static ArrayList<Boolean> isLowFloor =new ArrayList<>();
		protected static ArrayList<Double> operationCosts=new ArrayList<>();
		protected static ArrayList<Integer> numberOfSeats =new ArrayList<>();
		protected static ArrayList<Boolean> hasBicycleTransportOpp =new ArrayList<>();
		protected static ArrayList<Integer> disabledPlaces =new ArrayList<>();
		protected static ArrayList<Boolean> needsToRepair =new ArrayList<>();
		protected static ArrayList<String> fuelTypes =new ArrayList<>();
		protected static ArrayList<Boolean> hasWheels =new ArrayList<>();
		protected static ArrayList<String> typeOfVehicles =new ArrayList<>();
		
		protected static ArrayList<Line> needsService = new ArrayList<>();
		protected static ArrayList<Line> bicycleVehicles=new ArrayList<>();
		
		public Line(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,	boolean bicycleTransportOpp, int numOfDisabledPlaces, 
						boolean needToRepair,String typeOfFuel,	boolean hasWheel, String typeOfVehicle) {

			this.lineNum=lineNum;
			this.articulate=articulate;
			this.lowFloor=lowFloor;
			this.operationCost=operationCost;
			this.numOfSeats=numOfSeats;
			this.bicycleTransportOpp=bicycleTransportOpp;
			this.numOfDisabledPlaces=numOfDisabledPlaces;
			this.needToRepair=needToRepair;
			this.typeOfFuel=typeOfFuel;
			this.hasWheel=hasWheel;
			this.typeOfVehicle=typeOfVehicle;
		
		}
		
	/*	
				
		public static void fillNeedToRepairVehicles() {
				
			for (Vehicle vehicle : vehicles) {
				if(vehicle.needToRepair) {
					needsService.add(vehicle);
				}	
			}
		}	
		
		public static void printNeedToRepair() {
			
			fillNeedToRepairVehicles();
			for( Vehicle repair:needsService) {
				System.out.println(repair);
			}
		}
		
		public static void fillBicycleVehicles() {
			
			for (Vehicle vehicle : vehicles) {
				
				if(vehicle.bicycleTransportOpp) {
					bicycleVehicles.add(vehicle);
				}
			}
		}
		
		public static void printBicycleVehicles() {
			
			fillBicycleVehicles();
			for( Vehicle bicycle:bicycleVehicles) {
				System.out.println(bicycle);
			}
		}
*/
		public  String toString() {
			
			return lineNum+" "+articulate+" "+ lowFloor+" "+  operationCost +" "+numOfSeats+" "+	bicycleTransportOpp+" "+numOfDisabledPlaces
					+" "+needToRepair+" "+typeOfFuel+" "+hasWheel+" "+typeOfVehicle;
		}	
	/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Line{
	
	private int numberLetter;
	private String type;
	private double length;
	public static ArrayList<String>lineNumberLetter=new ArrayList<>();

	public Line(int numberLetter, String type, double length) {

		this.numberLetter = numberLetter;
		this.type = type;
		this.length = length;
	}

	public int getNumberLetter() {
		return numberLetter;
	}

	public String getType() {
		return type;
	}

	public double getLength() {
		return length;
	}
	public static void readIn(String fileName){ 
		
		try {
			
			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
					String parts[] = line.split(",");
					
					lineNumberLetter.add(parts[0]);
				
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
	public static void printLineNumberLetter() {
		for (String lineNumberLetter : lineNumberLetter) {
			System.out.println(lineNumberLetter);
		}
	}
	
	@Override
	public String toString() {
		return numberLetter + " " + type + " " + length;
	}
	
/*	public static void main (String[]args) {
		readIn("classes files\\vehicles.txt");
		printLineNumberLetter();
	}*/


	
}
