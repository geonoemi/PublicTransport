import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
public class beolv {
	//trying class
	public static ArrayList<String> dtplist=new ArrayList<>();
	
	public static void getARoute() {
		//Bence tipp: app induláskor mindent beolvasni és majd adatszerkezeten iterálni, nem file-on
		//in-memory kollekcióknak utánaolvasni
		//menetrend class:tehát egy komplett menedtrend minkdeképp legyen egy ArrayList ami minden menetrend bejegyzést tartalmaz ilyen adattagokkal hogy Vehicle, egy indulás, Állomás objektum, érkezés
		//mi megy a stackbe,mi a heapbe?
		//git ignore?
		
		Vehicle.readIn("classes files\\vehicles.txt");
		
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
		Vehicle.fillArrayLists();
		String lineNumAndLetter="";
		
			if (typeOfVehicle==1) { 
				do {
					System.out.println("Choose from the following buses:");
					Vehicle.printBuses();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Vehicle.lineNums.contains(lineNumAndLetter))); //külön minden jármû lineNum-jaira listát!
			}
			
			else if (typeOfVehicle==2) { 
				do {					
					System.out.println("Choose from the following trams:");
					Vehicle.printTrams();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Vehicle.lineNums.contains(lineNumAndLetter)));
			}
			
			else if (typeOfVehicle==3) { 	
				do {					
					System.out.println("Choose from the following trolleys:");			
					Vehicle.printTrolleys();
					lineNumAndLetter=scanNumAndLetter.nextLine().toLowerCase();
					
				}while(!(Vehicle.lineNums.contains(lineNumAndLetter)));
			}
			
		Scanner scanWay=new Scanner(System.in);
		String way="";
	//	do {
			System.out.println("Way (FORTH = 1 BACK = 2) : ");
				if(scanWay.nextInt()==1) {
					way="forth";
				}else {//if(scanWay.nextInt()==2) 
					way="back";
				}
	//	}while(scanWay.nextInt()!=1 || scanWay.nextInt()!=2);
	
		Scanner scanDayType=new Scanner(System.in);
		String dayType=" ";
		
		do{
				System.out.println("Choose from the following daytypes: ");
				DayTypes.printdayTypes();
				dayType  = scanDayType.nextLine(); 
				
		}while(!(DayTypes.dayTypes.contains(dayType)));
		
		
	    Route.userChoice =dayType+" "+station +" "+lineNumAndLetter+" "+way ;
	   
		DepartureTimes.getsoff(Route.userChoice); 
		
		scanStation.close();
		scanTypeOfVehicle.close();
		scanNumAndLetter.close();
		scanWay.close();
		scanDayType.close();
	}
	
	public static void getsoff(String userChoice) {
		
		System.out.println("This route gets off at the following times from the chosen station: ");
		DepartureTimes.readInDepartureTimes("departure times");
		
	}
	public static void main(String[]args) {
		getARoute();
		//Station.printStations(Station.stationNames);
	}

}
