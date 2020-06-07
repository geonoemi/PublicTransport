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
	
public Route(String lineNum, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

//járat
	public static String userChoice;
	public static ArrayList<String>departureTimes=new ArrayList<>();
 

	public static void readIn(String fileName){ 
			
			try {
				
				FileReader reader=new FileReader(fileName);
				BufferedReader buffer=new BufferedReader(reader);
				String line=null;
				int i=0;
				
				while((line=buffer.readLine())!=null) {
					
					departureTimes.add(line);
					System.out.println(departureTimes.get(i));
					
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

	public static void getARoute() {
		//Bence tipp: app induláskor mindent beolvasni és majd adatszerkezeten iterálni, nem file-on
		//in-memory kollekcióknak utánaolvasni
		//menetrend class:tehát egy komplett menedtrend minkdeképp legyen egy ArrayList ami minden menetrend bejegyzést tartalmaz ilyen adattagokkal hogy Vehicle, egy indulás, Állomás objektum, érkezés
		//mi megy a stackbe,mi a heapbe?
		//git ignore?
//	try {	
		Vehicle.readIn("classes files\\vehicles.txt"); //Vehicle példányokat tömblistába
		
		Scanner scanStation=new Scanner(System.in);
		String station="";
			do {
				System.out.println("Choose station: ");
				Station.printStations(Station.stationNames);
				station=scanStation.nextLine();
				
			}while(!Station.stationNames.contains(station));		//stat.nextLine(); //Attila szerint 2 beolvasás közé -> nem kell új Scanner, de nem mûködik
			
			
		Scanner scanTypeOfVehicle=new Scanner(System.in);
		int typeOfVehicle;
		System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		
			do{
				
				while(!scanTypeOfVehicle.hasNextInt()){ // && !( scanTypeOfVehicle.nextInt()==1) ||  (scanTypeOfVehicle.nextInt()==2) ||  (scanTypeOfVehicle.nextInt()==3)
		            System.out.println("Invalid input! Enter an integer of 1 / 2 / 3 ! ");
		            scanTypeOfVehicle.next(); 
		            continue;
		        }
				typeOfVehicle=scanTypeOfVehicle.nextInt(); //inputmismatchexception!
				
			}while(!(typeOfVehicle==1 || typeOfVehicle==2 || typeOfVehicle==3) ); //!scanTypeOfVehicle.hasNextInt()
			
		Scanner scanNumAndLetter=new Scanner(System.in);
		Vehicle.fillVehicles(); //jármûtípusok tömbistáinak feltöltése
		String lineNumAndLetter="";
		
			if (typeOfVehicle==1) { 
			
				do {
					System.out.println("Choose from the following buses:");
					Vehicle.printBusLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(busesLineNums.contains(lineNumAndLetter))); //külön minden jármû lineNum-jaira listát!
			}
			
			else if (typeOfVehicle==2) { 
				do {					
					System.out.println("Choose from the following trams:");
					Vehicle.printTramLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(tramsLineNums.contains(lineNumAndLetter)));
			}
			
			else if (typeOfVehicle==3) { 	
				do {					
					System.out.println("Choose from the following trolleys:");			
					Vehicle.printTrolleyLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Vehicle.trolleysLineNums.contains(lineNumAndLetter)));
			}
			
		Scanner scanWay=new Scanner(System.in);
		String way="";
	//	do {
			System.out.println("Way (FORTH = 1 BACK = 2) : ");
				if(scanWay.nextInt()==1) {
					way="forth";
				}else {				//if(scanWay.nextInt()==2) 
					way="back";
				}
	//	}while(scanWay.nextInt()!=1 || scanWay.nextInt()!=2);
	
		Scanner scanDayType=new Scanner(System.in);
		String dayType=" ";
		
		do{
				System.out.println("Choose from the following daytypes: ");
				DayTypes.printdayTypes();		//dayTypes tömblista kiíratása
				dayType  = scanDayType.nextLine(); 
				
		}while(!(DayTypes.dayTypes.contains(dayType)));
		
		userChoice =dayType+" "+station +" "+lineNumAndLetter+" "+way ;
	   
		getsoff(userChoice); //kiírja az indulási idõket
		
		scanStation.close();
		scanTypeOfVehicle.close();
		scanNumAndLetter.close();
		scanWay.close();
		scanDayType.close();
	
	/*}catch (InputMismatchException exception) {
		System.out.println("Not appropriate input type.");
	}*/
	}
	public static void getsoff(String userChoice) {
		
		System.out.println("This route gets off at the following times from the chosen station: ");
		DepartureTimes.readInDepartureTimes("departure times");
		
	}		
}