import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	
public class Vehicle {
	
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
		protected static ArrayList<Vehicle> vehicles=new ArrayList<>();
		protected static ArrayList<WheelChairAccessible> wheelChairAccessibleVehicles = new ArrayList<>();
		protected static ArrayList<Vehicle> toService = new ArrayList<>();
		protected static ArrayList<Vehicle> bicycleVehicles=new ArrayList<>();
		protected static ArrayList<Vehicle> fossilVehicles=new ArrayList<>();
		protected static ArrayList<Vehicle> electricVehicles=new ArrayList<>();
		
		
		public Vehicle(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
					boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,String typeOfFuel) {
		}
		
		public static void readIn(String fileName){ 
			try {
				
				FileReader reader=new FileReader(fileName);
				BufferedReader buffer=new BufferedReader(reader);
				String queue=null;
				int i=0;
				
				while((queue=buffer.readLine())!=null) {
					
						String parts[] = queue.split(",");
						int[]lineNum=new int[queue.length()];
						String[]lineLetter=new String[queue.length()];
						String[]way=new String[queue.length()];
						boolean[]articulated=new boolean[queue.length()];
						boolean[]lowFloor=new boolean[queue.length()];
						double[]operationCost=new double[queue.length()];
						int[]numOfSeats=new int[queue.length()];
						boolean[]bicycleTransportOpp=new boolean[queue.length()];
						int[]numOfDisabledPlaces=new int[queue.length()];
						boolean[]needToRepair=new boolean[queue.length()];
						String[]typeOfFuel=new String[queue.length()];
						
						lineNum[i]=Integer.parseInt(parts[0]);
						lineLetter[i]=parts[1];
						way[i]=parts[2];
						articulated[i]=Boolean.valueOf(parts[3]);
						lowFloor[i]=Boolean.parseBoolean(parts[4]);
						operationCost[i]=Double.parseDouble(parts[5]);
						numOfSeats[i]=Integer.parseInt(parts[6]);
						bicycleTransportOpp[i]=Boolean.parseBoolean(parts[7]);
						numOfDisabledPlaces[i]=Integer.parseInt(parts[8]);
						needToRepair[i]=Boolean.parseBoolean(parts[9]);
						typeOfFuel[i]=parts[10];
						
						Vehicle vehicle=new Vehicle(lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
								bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i]);
						vehicles.add(vehicle);
						
						Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
								bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i]);
						
						if(lowFloor[i] && numOfDisabledPlaces[i]>=1) {
							wheelChairAccessibleVehicles.add((WheelChairAccessible) wheelchairAccessibleVehicle);
						}
							
						if(needToRepair[i]) {
							toService.add(vehicle);
						}	
						
						if(bicycleTransportOpp[i]) {
							bicycleVehicles.add(vehicle);
						}
						
						if(typeOfFuel[i].contentEquals("benzin") || typeOfFuel[i].contentEquals("gázolaj")) {
							fossilVehicles.add(vehicle);
						}else {
							electricVehicles.add(vehicle);
						}
					i++;
				}
				buffer.close();
				
				for(Vehicle v: vehicles) {
					System.out.println("jármûvek: "+v.toString());
				}
			/*	for(Vehicle v: wheelChairAccessibleVehicles) {
					System.out.println("akadálymentesjarmuvek: "+v.toString());
				}
				for(Vehicle v: toService) {
					System.out.println("javítandó jármûvek: "+v.toString());
				}
				for(Vehicle v: bicycleVehicles) {
					System.out.println("kerékpárt szállító jármûvek: "+v.toString());
				}
				for(Vehicle v: fossilVehicles) {
					System.out.println("benzinnel/gázolajjal mûködõ jármûvek: "+v.toString());
				}
				for(Vehicle v: electricVehicles) {
					System.out.println("elektromos árammal mûködõ jármûvek: "+v.toString());
				}*/
				
				
			}catch(FileNotFoundException e) {
				System.out.println("File not found.");
			}catch(IOException e) {
				System.out.println("e.getMessage()");
			}		
		}
		public String toString() {
			return lineNum+" "+lineLetter+" "+way+" "+articulated+" "+ lowFloor+" "+  operationCost
					+" "+numOfSeats+" "+	bicycleTransportOpp+" "+numOfDisabledPlaces
					+" "+needToRepair+" "+typeOfFuel;
		}

	}

