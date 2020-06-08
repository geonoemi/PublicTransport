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

public class Route extends Vehicle {

	protected static String userChoice;
	
	public Route(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	
	public static void getARoute() {
		//in-memory kollekcióknak utánaolvasni
		//menetrend class:tehát egy komplett menedtrend minkdeképp legyen egy ArrayList ami minden menetrend bejegyzést tartalmaz ilyen adattagokkal hogy Vehicle, egy indulás, Állomás objektum, érkezés
		//mi megy a stackbe,mi a heapbe?
		//git ignore?

	
		Scanner scanStation=new Scanner(System.in);
		String station="";
			do {
				System.out.println("Choose station: ");
				Station.printStations(Station.stationNames);
				station=scanStation.nextLine();
				
			}while(!Station.stationNames.contains(station));		//station.nextLine(); //Attila szerint 2 beolvasás közé -> nem kell új Scanner, de nem mûködik
			
			
		Scanner scanTypeOfVehicle=new Scanner(System.in);
		int typeOfVehicle;
		System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		
			do{
				
				while(!scanTypeOfVehicle.hasNextInt()){ // && !( scanTypeOfVehicle.nextInt()==1) ||  (scanTypeOfVehicle.nextInt()==2) ||  (scanTypeOfVehicle.nextInt()==3)
		            System.out.println("Invalid input! Enter an integer of 1 / 2 / 3 ! ");
		            scanTypeOfVehicle.next(); 
		            continue;
		        }
				typeOfVehicle=scanTypeOfVehicle.nextInt(); 
				
			}while(!(typeOfVehicle==1 || typeOfVehicle==2 || typeOfVehicle==3) ); 
			
		Scanner scanNumAndLetter=new Scanner(System.in);
		String lineNumAndLetter="";
		
			if (typeOfVehicle==1) { 
				Bus.readIn("classes files\\buses.txt"); //ArrayLists from Vehicles

				//Bus.fillBus();
				do {
					System.out.println("Choose from the following buses:");
					Bus.printBusLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Bus.busesLineNums.contains(lineNumAndLetter))); 
			}
			
			else if (typeOfVehicle==2) { 
				Tram.readIn("classes files\\trams.txt");
				//Tram.fillTram();
				do {					
					System.out.println("Choose from the following trams:");
					Tram.printTramLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Tram.tramsLineNums.contains(lineNumAndLetter)));
			}
			
			else if (typeOfVehicle==3) { 	
				Trolley.readIn("classes files\\trolleys.txt");
				
				//Trolley.fillTrolley();
				do {					
					System.out.println("Choose from the following trolleys:");			
					Trolley.printTrolleyLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Trolley.trolleysLineNums.contains(lineNumAndLetter)));
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
				DayTypes.printDayTypes();		
				dayType  = scanDayType.nextLine(); 
				
		}while(!(DayTypes.dayTypes.contains(dayType)));
		
		userChoice =dayType+" "+station +" "+lineNumAndLetter+" "+way ;
	   
		getsoff(userChoice); //prints deparure Times
		
		scanStation.close();
		scanTypeOfVehicle.close();
		scanNumAndLetter.close();
		scanWay.close();
		scanDayType.close();
	
	/*}catch (InputMismatchException exception) {
		System.out.println("Not appropriate input type.");
	}*/
	}
	
	public static void getsoff(String userChoice) { //used in getARoute()
		
		System.out.println("This route gets off at the following times from the chosen station: ");
		DepartureTimes.readInDepartureTimes("departure times");
		
	}
}