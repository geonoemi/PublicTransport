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
		
		/*	do{
				System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		
				while(!scanTypeOfVehicle.hasNextInt()){ // && !( scanTypeOfVehicle.nextInt()==1) ||  (scanTypeOfVehicle.nextInt()==2) ||  (scanTypeOfVehicle.nextInt()==3)
					
					System.out.println("Invalid input! Enter an integer of 1 / 2 / 3 : ");
		            scanTypeOfVehicle.next(); 
				} 
				while(!(scanTypeOfVehicle.nextInt()==1 ||scanTypeOfVehicle.nextInt()==2 || scanTypeOfVehicle.nextInt()==3)){
					System.out.println("Wrong number! Enter an integer of 1 / 2 / 3  :"); 
					scanTypeOfVehicle.next(); 
				}
				typeOfVehicle=scanTypeOfVehicle.nextInt(); 
		//	}while(!(typeOfVehicle==1 ||typeOfVehicle==2 || typeOfVehicle==3) ); 
			
			}while(!(scanTypeOfVehicle.nextInt()==1 ||scanTypeOfVehicle.nextInt()==2 || scanTypeOfVehicle.nextInt()==3) ); */
							            
			

			
			
		Scanner scanNumAndLetter=new Scanner(System.in);
		String lineNumAndLetter="";
		
		Scanner scanStation=new Scanner(System.in);
		String station="";
		
//busz ág		
			if (typeOfVehicle==1) { 
				
				Bus.readIn(); //ArrayLists from Vehicles
				
				do {
					
					System.out.println("Choose from the following buses:");
					Bus.printBusLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Bus.busesLineNums.contains(lineNumAndLetter))); 
			
				Station.readInBuses();
				
				if(lineNumAndLetter.equals("70")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames70);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames70.contains(station));	
				}
				
				else if(lineNumAndLetter.equals("71A")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames71A);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames71A.contains(station));	
				}
				
				else if(lineNumAndLetter.equals("90H")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames90H);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames90H.contains(station));	
				}
				
			}
//villamos ág			
			else if (typeOfVehicle==2) { 
				Tram.readIn();
				//Tram.fillTram();
				do {					
					System.out.println("Choose from the following trams:");
					Tram.printTramLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Tram.tramsLineNums.contains(lineNumAndLetter)));
				
				Station.readInTrams();
				
				if(lineNumAndLetter.equals("2")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames2);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames2.contains(station));	
				}
				
				else if(lineNumAndLetter.equals("3F")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames3F);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames3F.contains(station));	
				}
				
				else if(lineNumAndLetter.equals("4")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames4);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames4.contains(station));	
				}
				
			}
//troli ág			
			else if (typeOfVehicle==3) { 	
				Trolley.readIn();
				
				//Trolley.fillTrolley();
				do {					
					System.out.println("Choose from the following trolleys:");			
					Trolley.printTrolleyLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Trolley.trolleysLineNums.contains(lineNumAndLetter)));
				
				Station.readInTrolleys();
				
				if(lineNumAndLetter.equals("8")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames8);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames8.contains(station));	
				}
				
				else if(lineNumAndLetter.equals("10")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames10);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames10.contains(station));	
				}
				
				else if(lineNumAndLetter.equals("19")) {
					do {
						System.out.println("Choose station: ");
						
						Station.printStations(Station.stationNames19);
						
						
						station=scanStation.nextLine();
						
					}while(!Station.stationNames19.contains(station));	
				}
			}
			
			Scanner scanWay=new Scanner(System.in);
			String way="";

			do{
				System.out.println("Choose way ( FORTH = 1  BACK = 2 ) : ");
				
				while(!scanWay.hasNextInt()){ 												// && !( scanTypeOfVehicle.nextInt()==1) ||  (scanTypeOfVehicle.nextInt()==2) ||  (scanTypeOfVehicle.nextInt()==3)
					
					System.out.println("Invalid input! Type an integer of 1 / 2  : ");
					scanWay.nextLine(); 
				} 		
				if(scanWay.nextLine().equals("1")){
					way="forth";
				}else if(scanWay.nextLine().equals("2")){
					way="back";
				}else {
					System.out.println("Wrong number! Type an integer of 1 / 2  : ");
					scanWay.nextLine(); 
				}
			//}while(!(way.equals("back") || way.equals("forth")));
			
			}while(!(scanWay.nextLine().equals("1") || scanWay.nextLine().equals("2")) );
			/*workingSystem.out.println("Way ( FORTH = 1 BACK = 2 ) : ");
			
			if(scanWay.nextLine().equals("1")){
				way="forth";
			}else if(scanWay.nextLine().equals("2")){
				way="back";
			}*/
					
	
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