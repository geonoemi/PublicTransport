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

public class Route extends Line {

	protected static String userChoice;
	
	public Route(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
				 boolean needToRepair, String typeOfFuel, boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
	}

	
	public static void getARoute() {
	
		Scanner scanTypeOfVehicle=new Scanner(System.in);
		int typeOfVehicle;
		
			do{
				System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		
				while(!scanTypeOfVehicle.hasNextInt()){ // && !( scanTypeOfVehicle.nextInt()==1) ||  (scanTypeOfVehicle.nextInt()==2) ||  (scanTypeOfVehicle.nextInt()==3)
					
					System.out.println("Invalid input! Enter an integer of 1 / 2 / 3 : ");
		            scanTypeOfVehicle.next(); 
				} 
							
			/*	while(!(scanTypeOfVehicle.nextInt()==1 || scanTypeOfVehicle.nextInt()==2 || scanTypeOfVehicle.nextInt()==3) ){
					
	            	System.out.println("Wrong number! Enter an integer of 1 / 2 / 3  :"); 
	            	scanTypeOfVehicle.next(); 
	            }*/
				typeOfVehicle=scanTypeOfVehicle.nextInt(); 
				
			}while(!(typeOfVehicle==1 || typeOfVehicle==2 || typeOfVehicle==3) ); 
			
		Scanner scanNumAndLetter=new Scanner(System.in);
		String lineNumAndLetter="";
		
		Scanner scanStation=new Scanner(System.in);
		String station="";
		
//busz ág		
			if (typeOfVehicle==1) { 
				Bus.readIn("classes files\\buses.txt"); //ArrayLists from Vehicles
				

				do {
					
					System.out.println("Choose from the following buses:");
					Bus.printBusLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Bus.busesLineNums.contains(lineNumAndLetter))); 
			
				Station.readInBuses();
				
				if(lineNumAndLetter.equals("70")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations70(Station.stationNames70);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames70.contains(station));	
				}
				}
//villamos ág			
			else if (typeOfVehicle==2) { 
				Tram.readIn("classes files\\trams.txt");
				//Tram.fillTram();
				do {					
					System.out.println("Choose from the following trams:");
					Tram.printTramLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Tram.tramsLineNums.contains(lineNumAndLetter)));
			}
//troli ág			
			else if (typeOfVehicle==3) { 	
				Trolley.readIn("classes files\\trolleys.txt");
				
				//Trolley.fillTrolley();
				do {					
					System.out.println("Choose from the following trolleys:");			
					Trolley.printTrolleyLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Trolley.trolleysLineNums.contains(lineNumAndLetter)));
			}
		
	/*	Scanner scanStation=new Scanner(System.in);
		String station="";
			do {
				System.out.println("Choose station: ");
				Station.printStations(Station.stationNames);
				station=scanStation.nextLine();
				
			}while(!Station.stationNames.contains(station));		//station.nextLine(); //Attila szerint 2 beolvasás közé -> nem kell új Scanner, de nem mûködik
	*/			
			
		Scanner scanWay=new Scanner(System.in);
		String way="";
		
			do {
			//	try {
				System.out.println("Way ( FORTH = 1 BACK = 2 ) : ");
				
					if(scanWay.nextLine().equals("1")){
						way="forth";
					}else if(scanWay.nextLine().equals("2")){
						way="back";
					}else {
						System.out.println("Not appropriate input, please type 1 / 2 : ");
					}
			/*	}catch (InputMismatchException exception) {
					System.out.println("Not appropriate input, please type 1 / 2 : ");
				}	*/	
			}while(!(scanWay.nextLine().equals("1") || (scanWay.nextLine().equals("2"))));
		
		
	
		Scanner scanDayType=new Scanner(System.in);
		String dayType=" ";
		
		do{
				System.out.println("Choose from the following daytypes: ");
				DayTypes.printDayTypes();		
				dayType  = scanDayType.nextLine(); 
				
		}while(!(DayTypes.dayTypes.contains(dayType)));
		
		userChoice =lineNumAndLetter+" "+station+" "+dayType+" "+way;
	   
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