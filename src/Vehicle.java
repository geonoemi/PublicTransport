import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
import java.util.InputMismatchException;
	
public class Vehicle {
	//TODO make it abstract
		protected String typeOfVehicle;
		protected String lineNum;
		protected String lineLetter;
		protected String way;
		protected boolean articulated;
		protected boolean lowFloor;
		protected double operationCost;
		protected int numOfSeats;
		protected boolean bicycleTransportOpp;
		protected int numOfDisabledPlaces;
		protected boolean needToRepair;
		protected String typeOfFuel;
		protected boolean hasWheel;
		
		
		protected static ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		protected static ArrayList<String> vehicleTypes=new ArrayList<>();
		protected static ArrayList<String> lineNums=new ArrayList<>();

		protected static ArrayList<Vehicle> trolleys=new ArrayList<>();
		protected static ArrayList<Vehicle> trams=new ArrayList<>();
		protected static ArrayList<Vehicle> buses=new ArrayList<>();
		protected static ArrayList<Vehicle> wheelChairAccessibleVehicles = new ArrayList<>();
		protected static ArrayList<Vehicle> toService = new ArrayList<>();
		protected static ArrayList<Vehicle> bicycleVehicles=new ArrayList<>();
		protected static ArrayList<Vehicle> fossilVehicles=new ArrayList<>();
		protected static ArrayList<Vehicle> electricVehicles=new ArrayList<>();
		
		
		public Vehicle(String lineNum, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
						boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,String typeOfFuel, boolean hasWheel) {
		
		this.typeOfVehicle=typeOfVehicle;
		this.lineNum=lineNum;
		this.lineLetter=lineLetter;
		this.way=way;
		this.articulated=articulated;
		this.lowFloor=lowFloor;
		this.operationCost=operationCost;
		this.numOfSeats=numOfSeats;
		this.bicycleTransportOpp=bicycleTransportOpp;
		this.numOfDisabledPlaces=numOfDisabledPlaces;
		this.needToRepair=needToRepair;
		this.typeOfFuel=typeOfFuel;
		this.hasWheel=hasWheel;
		
		}
		
		public static void readIn(String fileName){ 
			
			try {
				
				FileReader reader=new FileReader(fileName);
				BufferedReader buffer=new BufferedReader(reader);
				String line=null;
				int i=0;
				
				while((line=buffer.readLine())!=null) {
					
						String parts[] = line.split(",");
						String typeOfVehicle[]=new String[line.length()];
						String[]lineNum=new String[line.length()];
						String[]lineLetter=new String[line.length()];
						//String[]way=new String[line.length()];
						boolean[]articulated=new boolean[line.length()];
						boolean[]lowFloor=new boolean[line.length()];
						double[]operationCost=new double[line.length()];
						int[]numOfSeats=new int[line.length()];
						boolean[]bicycleTransportOpp=new boolean[line.length()];
						int[]numOfDisabledPlaces=new int[line.length()];
						boolean[]needToRepair=new boolean[line.length()];
						String[]typeOfFuel=new String[line.length()];
						boolean[]hasWheel=new boolean[line.length()];
				//Bence ezt hogy máshogycsinálná?
						typeOfVehicle[i]=parts[0];
						lineNum[i]=parts[1];
						lineNums.add(lineNum[i]);
						//lineLetter[i]=parts[2];
						//way[i]=parts[3];
						articulated[i]=Boolean.valueOf(parts[3]);
						lowFloor[i]=Boolean.parseBoolean(parts[4]);
						operationCost[i]=Double.parseDouble(parts[5]);
						numOfSeats[i]=Integer.parseInt(parts[6]);
						bicycleTransportOpp[i]=Boolean.parseBoolean(parts[7]);
						numOfDisabledPlaces[i]=Integer.parseInt(parts[8]);
						needToRepair[i]=Boolean.parseBoolean(parts[9]);
						typeOfFuel[i]=parts[10];
						hasWheel[i]=Boolean.parseBoolean(parts[11]);
									
						
						Vehicle vehicle=new Vehicle( lineNum[i], articulated[i], lowFloor[i],  
								operationCost[i],  numOfSeats[i], bicycleTransportOpp[i],  numOfDisabledPlaces[i], 
								needToRepair[i], typeOfFuel[i], hasWheel[i]);
						
						vehicles.add(vehicle);	
						//System.out.println(vehicle);	
						
						vehicleTypes.add(typeOfVehicle[i]);
											
					/*	System.out.print(typeOfVehicle[i]+" "+lineNum[i] + " "+lineLetter[i]+ " "+ way[i]+  " "+articulated[i]+ " "+lowFloor[i]+  " "+operationCost[i]+ 
						 " "+numOfSeats[i]+ " "+bicycleTransportOpp[i]+  " "+numOfDisabledPlaces[i]+ " "+needToRepair[i]+ " "+typeOfFuel[i]+" "+hasWheel[i]);
						System.out.println();		*/				
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
		
		public static void printVehicles(ArrayList<Vehicle> vehicles) {
			
			for (Vehicle vehicle : vehicles) {
				System.out.println(vehicle);
			}
		}

		public static void printVehicleTypes(ArrayList<String> vehicleTypes) {
			
			for (String vehicleName : vehicleTypes) {
				System.out.println(vehicleName);
			}
		}
		
		public static void fillArrayLists() {
			
			for(Vehicle vehicle: vehicles) {
				
				if(vehicle.typeOfFuel.equals("electrical energy") && vehicle.hasWheel) {
					trolleys.add(vehicle);
				}
			}
		
			for(Vehicle vehicle: vehicles) {	
				
				if(vehicle.typeOfFuel.equals("electrical energy") && !vehicle.hasWheel) {
					trams.add(vehicle);
				}
			}
					
			for(Vehicle vehicle: vehicles) {
				
				if(vehicle.typeOfFuel.equals("petrol") || vehicle.typeOfFuel.equals("diesel oil") && vehicle.hasWheel) {
					buses.add( vehicle);
				}	
			}
		}
		public static void printLineNums() {
			for(String lineNum:lineNums) {
				System.out.println(lineNum);
			}
		}
		public static void printBuses() {
			for(Vehicle bus:buses) {
				System.out.println(bus.lineNum);
			}
		}
		public static void printTrams() {
			for(Vehicle trams:trams) {
				System.out.println(trams.lineNum);
			}
		}
		public static void printTrolleys() {
			for(Vehicle trolleys:trolleys) {
				System.out.println(trolleys.lineNum);
				}
		}
		public  String toString() {
			
			return lineNum+" "+lineLetter+" "+way+" "+articulated+" "+ lowFloor+" "+  operationCost
					+" "+numOfSeats+" "+	bicycleTransportOpp+" "+numOfDisabledPlaces
					+" "+needToRepair+" "+typeOfFuel+" "+hasWheel;
		}
	
	 static void main(String[] args) {

		 //	readIn("classes files\\vehicles.txt");
			//Vehicle.printVehicleTypes(vehicleTypes);
			//printVehicles(vehicles);
			//fillArrayLists();	
			//printLineNums();
			//printBuses(buses);
	}
}
