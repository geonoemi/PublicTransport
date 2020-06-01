import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	
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
				String queue=null;
				int i=0;
				
				while((queue=buffer.readLine())!=null) {
					
						String parts[] = queue.split(",");
						String typeOfVehicle[]=new String[queue.length()];
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
						boolean[]hasWheel=new boolean[queue.length()];
						
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
										
					//	System.out.print(lineNum[i] + " "+lineLetter[i]+ " "+ way[i]+  " "+articulated[i]+ " "+lowFloor[i]+  " "+operationCost[i]+ 
					//			 " "+numOfSeats[i]+ " "+bicycleTransportOpp[i]+  " "+numOfDisabledPlaces[i]+ " "+needToRepair[i]+ " "+typeOfFuel[i]+" "+hasWheel[i]);
					//	System.out.println();
										
						Vehicle vehicle=new Vehicle( lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
								bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i], hasWheel[i]);
						vehicles.add(vehicle);
						
				/*		if(typeOfFuel[i].equals("electrical energy") && hasWheel[i]) {
							Vehicle trolley=new Trolley(lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
									bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i], hasWheel[i]);
							trolleys.add((Trolley) trolley);
						}
						
						if(typeOfFuel[i].equals("electrical energy") && !hasWheel[i]) {
							Vehicle tram=new Tram(lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
									bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i], hasWheel[i]);
							trams.add((Tram) tram);
						}
						
						if(typeOfFuel[i].contentEquals("petrol") || typeOfFuel[i].contentEquals("diesel oil") && hasWheel[i]) {
							Vehicle bus=new Bus(lineNum[i], lineLetter[i], way[i], articulated[i], lowFloor[i],  operationCost[i],  numOfSeats[i],
									bicycleTransportOpp[i],  numOfDisabledPlaces[i],  needToRepair[i], typeOfFuel[i], hasWheel[i]);
							buses.add((Bus) bus);
						}*/
						
					i++;
				}
				buffer.close();
				
				
				for(Vehicle v: vehicles) {
					
					if(v.typeOfFuel.equals("electrical energy") && v.hasWheel) {
							trolleys.add((Trolley) v);
							System.out.println("trolleys: "+v.toString());
						//	System.out.println(trolleys+" "+v.toString());
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
			}		
		}
		public String toString() {
			return lineNum+" "+lineLetter+" "+way+" "+articulated+" "+ lowFloor+" "+  operationCost
					+" "+numOfSeats+" "+	bicycleTransportOpp+" "+numOfDisabledPlaces
					+" "+needToRepair+" "+typeOfFuel+" "+hasWheel;
		}

	}

