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
//j�rat
	public static String userChoice;

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
		//Bence tipp: app indul�skor mindent beolvasni �s majd adatszerkezeten iter�lni, nem file-on
		//in-memory kollekci�knak ut�naolvasni
		//menetrend class
		//teh�t egy komplett menedtrend minkdek�pp legyen egy ArrayList ami minden menetrend bejegyz�st tartalmazv
		//Menetrend class �s ilyen adattagokkal hogy Vehicle, egy indul�s, �llom�s objektum, �rkez�s
		//mi megy a stackbe,mi a heapbe?
		//relativepath-nak ut�naj�rni
		//git ignore
		
		
		Scanner scStation=new Scanner(System.in);
		System.out.println("Choose station: ");
		Station.readIn("classes files\\stations.txt");
		
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		Station.sortStationNames(hu,Station.stationNames);
		String station=scStation.nextLine();
		//stat.nextLine(); //Attila szerint 2 beolvas�s k�z� -> nem kell �j Scanner, de nem m�k�dik
			
		Scanner scTypeOfVehicle=new Scanner(System.in);
		System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		int typeOfVehicle=scTypeOfVehicle.nextInt();
		
		Scanner scNumAndLetter=new Scanner(System.in);
		
		Vehicle.fillArrayLists();
		
		if (typeOfVehicle==1) { //buszok sz�m�t �rja ki
			System.out.println("Choose from the following buses:");
			printBuses();
		}
		else if (typeOfVehicle==2) { //villamosok sz�m�t �rja ki
			System.out.println("Choose from the following trams:");
			printTrams();
		}
		else if (typeOfVehicle==3) { //trolik sz�m�t �rja ki	
			System.out.println("Choose from the following trolleys:");			
			printTrolleys();
		}	
			
		String lineNumAndLetter=scNumAndLetter.nextLine();
	
		Scanner scWay=new Scanner(System.in);
		System.out.println("Way (FORTH=1 BACK=2) : ");
		String way=" ";
		if(scWay.nextInt()==1) {
			way="forth";
		}else {
			way="back";
		}
	
		Scanner scDayType=new Scanner(System.in);
		System.out.println("Choose from the following daytypes: ");
		
		for (DayType dayType : DayType.values()) {
			System.out.printf( "\t%s\n", dayType.toString().replaceAll("(?<=[A-Z])\\_", " ").toLowerCase());
		}
		
		String dayType  = scDayType.nextLine(); 
		
	   
	    	userChoice =dayType+" "+station +" "+lineNumAndLetter+" "+way ;
	   
		DepartureTimes.getsoff(userChoice); 
		
		scStation.close();
		scTypeOfVehicle.close();
		scNumAndLetter.close();
		scWay.close();
		scDayType.close();
	}
	
	public static void printStations(ArrayList<String> stationNames) {
		
		for (String stationName : stationNames) {
			System.out.println(stationName);
		}
	}

		
}