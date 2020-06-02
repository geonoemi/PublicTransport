import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
import java.util.InputMismatchException;
	
public class Vehicle {
		protected String typeOfVehicle;
		protected int lineNum;
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
		protected static ArrayList<Trolley> trolleys=new ArrayList<>();
		protected static ArrayList<Tram> trams=new ArrayList<>();
		protected static ArrayList<Bus> buses=new ArrayList<>();
		protected static ArrayList<WheelChairAccessible> wheelChairAccessibleVehicles = new ArrayList<>();
		protected static ArrayList<Vehicle> toService = new ArrayList<>();
		protected static ArrayList<Vehicle> bicycleVehicles=new ArrayList<>();
		protected static ArrayList<Vehicle> fossilVehicles=new ArrayList<>();
		protected static ArrayList<Vehicle> electricVehicles=new ArrayList<>();
		
		
		public Vehicle( int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
						boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,String typeOfFuel, boolean hasWheel) {
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
						int[]lineNum=new int[line.length()];
						String[]lineLetter=new String[line.length()];
						String[]way=new String[line.length()];
						boolean[]articulated=new boolean[line.length()];
						boolean[]lowFloor=new boolean[line.length()];
						double[]operationCost=new double[line.length()];
						int[]numOfSeats=new int[line.length()];
						boolean[]bicycleTransportOpp=new boolean[line.length()];
						int[]numOfDisabledPlaces=new int[line.length()];
						boolean[]needToRepair=new boolean[line.length()];
						String[]typeOfFuel=new String[line.length()];
						boolean[]hasWheel=new boolean[line.length()];
						
						typeOfVehicle[i]=parts[0];
						lineNum[i]=Integer.parseInt(parts[1]);
						lineLetter[i]=parts[2];
						way[i]=parts[3];
						articulated[i]=Boolean.valueOf(parts[4]);
						lowFloor[i]=Boolean.parseBoolean(parts[5]);
						operationCost[i]=Double.parseDouble(parts[6]);
						numOfSeats[i]=Integer.parseInt(parts[7]);
						bicycleTransportOpp[i]=Boolean.parseBoolean(parts[8]);
						numOfDisabledPlaces[i]=Integer.parseInt(parts[9]);
						needToRepair[i]=Boolean.parseBoolean(parts[10]);
						typeOfFuel[i]=parts[11];
						hasWheel[i]=Boolean.parseBoolean(parts[12]);
									
						
						Vehicle vehicle=new Vehicle( lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
						bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i], hasWheel[i]);
						vehicles.add(vehicle);	
						System.out.println(vehicle);	
						
						vehicleTypes.add(typeOfVehicle[i]);
											
					/*	System.out.print(typeOfVehicle[i]+" "+lineNum[i] + " "+lineLetter[i]+ " "+ way[i]+  " "+articulated[i]+ " "+lowFloor[i]+  " "+operationCost[i]+ 
						 " "+numOfSeats[i]+ " "+bicycleTransportOpp[i]+  " "+numOfDisabledPlaces[i]+ " "+needToRepair[i]+ " "+typeOfFuel[i]+" "+hasWheel[i]);
							System.out.println();		*/				
					i++;
				}
				buffer.close();
								
				for(Vehicle v: vehicles) {
					
					if(v.typeOfFuel.equals("electrical energy") && v.hasWheel) {
							trolleys.add((Trolley) v);
							System.out.println("trolleys: "+v.toString());
					}
					else if(v.typeOfFuel.equals("electrical energy") && !v.hasWheel) {
							trams.add((Tram) v);
							System.out.println("trams: "+v.toString());
					}
					else if(v.typeOfFuel.equals("petrol") || v.typeOfFuel.equals("diesel oil") && v.hasWheel) {
							buses.add((Bus) v);
							System.out.println("buses: "+v.toString());
					}	
				}
				
			}catch(FileNotFoundException e) {
				System.out.println("File not found.");
			}catch(IOException e) {
				System.out.println("e.getMessage()");
			}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
			}		
		}
		
		public static void vehicles(ArrayList <Vehicle> vehicles) {
			
			for(int i=0;i<vehicles.size();i++) {
				System.out.println(vehicles.get(i));
			}	
		}

		public static void vehicleTypes(ArrayList <String> vehicleTypes) {
			
			for(int i=0;i<vehicleTypes.size();i++) {
				System.out.println(vehicleTypes.get(i));
			}	
		}
		
		public  String toString() {
			
			return typeOfVehicle+" "+lineNum+" "+lineLetter+" "+way+" "+articulated+" "+ lowFloor+" "+  operationCost
					+" "+numOfSeats+" "+	bicycleTransportOpp+" "+numOfDisabledPlaces
					+" "+needToRepair+" "+typeOfFuel+" "+hasWheel;
		}
		public static void main(String[] args) {

			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\classes files\\vehicles.txt");
			vehicleTypes(vehicleTypes);
			vehicles(vehicles);
		}	
	}

