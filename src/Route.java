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
		//itt amit v�laszt, annak a j�rm�t�pusnak a sz�m�t, bet�j�t adja fel v�laszt�si lehet�s�gnek, vagy nem...
		int typeOfVehicle=scTypeOfVehicle.nextInt();
		
		Scanner scNum=new Scanner(System.in);
		System.out.println("Which vehicle do you want to travel with? Please choose the number, letter, direction of the vehicle and the type of the day.\nNumber: \nLetter:  ");
		
			if (typeOfVehicle==1) { //buszok sz�m�t �rja ki
				
				for(Vehicle buses:buses) {
					System.out.println(buses.lineNum+" "+buses.lineLetter);
				}
			}
			else if (typeOfVehicle==2) { //villamosok sz�m�t �rja ki
				
				for(Vehicle trams:trams) {
					System.out.println(trams.lineNum+" "+trams.lineLetter);
				}
			}
			else if (typeOfVehicle==3) { //trolik sz�m�t �rja ki
				
				for(Vehicle trolleys:trolleys) {
					System.out.println(trolleys.lineNum+" "+trolleys.lineLetter);
				}
			}
			
		int num=scNum.nextInt();
			
		Scanner scLetter=new Scanner(System.in);
		//System.out.println("Letter: ");
		String letter=scLetter.nextLine().toLowerCase();
				
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
		
		String dayType  = scDayType.nextLine();  //.toString().replaceAll("(?<=[A-Z])\\_", " ")
		
	    
		userChoice =dayType+" "+station +" "+num+ " "+letter+" "+way ;
		DepartureTimes.getsoff(station, typeOfVehicle, num, letter, way, dayType); 
		
		scStation.close();
		scTypeOfVehicle.close();
		scNum.close();
		scLetter.close();
		scWay.close();
		scDayType.close();
	}
	
	public static void printStations(ArrayList<String> stationNames) {
		
		for (String stationName : stationNames) {
			System.out.println(stationName);
		}
	}

		
}