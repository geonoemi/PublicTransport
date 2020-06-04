import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Route extends Vehicle{
//járat

	private static String [] departureTimes;
		
		public Route( int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
						double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
						boolean needToRepair, String typeOfFuel, boolean hasWheel) {
				super(lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
						numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
		}

		public static DayType dayTypes;
		
		public static void readIn(String fileName){ 
			try {
				
				FileReader reader=new FileReader(fileName);
				BufferedReader buffer=new BufferedReader(reader);
				String line=null;
				int i=0;
				
				while((line=buffer.readLine())!=null) {
					
					departureTimes=new String[line.length()];
					departureTimes[i]=line;
					System.out.println(departureTimes[i]);
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
	//static DayType dt=DayType.NONWORKINGDAY;

	
	public static void getARoute() {
		//Bence tipp: app induláskor mindent beolvasni és majd adatszerkezeten iterálni, nem file-on
		//in-memory kollekcióknak utánaolvasni
		//menetrend class
		//tehát egy komplett menedtrend minkdeképp legyen egy ArrayList ami minden menetrend bejegyzést tartalmazv
		//Menetrend class és ilyen adattagokkal hogy Vehicle, egy indulás, Állomás objektum, érkezés
		//mi megy a stackbe,mi a heapbe?
		//relativepath-nak utánajárni
		
		
		Scanner stat=new Scanner(System.in);
		System.out.println("Choose station: ");
		Station.readIn("classes files\\stations.txt");
		
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		Station.sortStationNames(hu,Station.stationNames);
		String station=stat.nextLine();
		//stat.nextLine(); //Attila szerint 2 beolvasás közé -> nem kell új Scanner, de nem mûködik
			
		Scanner type=new Scanner(System.in);
		System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		//itt amit választ, annak a jármûtípusnak a számát, betûjét adja fel választási lehetõségnek, vagy nem...
		int typeOfVehicle=type.nextInt();
		
		Scanner scInt=new Scanner(System.in);
		System.out.println("Which vehicle do you want to travel with? Please choose the number, letter, direction of the vehicle and the type of the day.\nNumber: \nLetter:  ");
		
			if (typeOfVehicle==1) { //buszok számát írja ki
				
				for(Vehicle buses:buses) {
					System.out.println(buses.lineNum+" "+buses.lineLetter);
				}
			}
			else if (typeOfVehicle==2) { //villamosok számát írja ki
				
				for(Vehicle trams:trams) {
					System.out.println(trams.lineNum+" "+trams.lineLetter);
				}
			}
			else if (typeOfVehicle==3) { //trolik számát írja ki
				
				for(Vehicle trolleys:trolleys) {
					System.out.println(trolleys.lineNum+" "+trolleys.lineLetter);
				}
			}
			
		int num=scInt.nextInt();
			
		Scanner scStr1=new Scanner(System.in);
		//System.out.println("Letter: ");
		String letter=scStr1.nextLine();
				
		Scanner scStr2=new Scanner(System.in);
		System.out.println("Way (FORTH=1 BACK=2) : ");
		int way=scStr2.nextInt();
	
		Scanner dtp=new Scanner(System.in);
		System.out.println("Choose from the following daytypes: ");
		
		for (DayType dt : DayType.values()) {
			System.out.printf("\t%s\n", dt);  
		}
		
		DayType dayTypes  = DayType.valueOf(dtp.nextLine());//String to enum
	    
		DepartureTimes.getsoff(station, typeOfVehicle, num, letter, way, dayTypes); 
		
		stat.close();
		type.close();
		scInt.close();
		scStr1.close();
		scStr2.close();
		dtp.close();
	}
	

		
	public static void printStations(ArrayList<String> stationNames) {
		
		for (String name : stationNames) {
			System.out.println(name);
		}
	}

		
}