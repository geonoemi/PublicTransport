import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
public class beolv {
	//trying class
	public static ArrayList<String> dtplist=new ArrayList<>();
	
	public static void getARoute() {
		//Bence tipp: app indul�skor mindent beolvasni �s majd adatszerkezeten iter�lni, nem file-on
		//in-memory kollekci�knak ut�naolvasni
		//menetrend class:teh�t egy komplett menedtrend minkdek�pp legyen egy ArrayList ami minden menetrend bejegyz�st tartalmaz ilyen adattagokkal hogy Vehicle, egy indul�s, �llom�s objektum, �rkez�s
		//mi megy a stackbe,mi a heapbe?
		//git ignore?
		
		Vehicle.readIn("classes files\\vehicles.txt");
		
		Scanner scanStation=new Scanner(System.in);
		String station="";
			do {
				System.out.println("Choose station: ");
				Station.printStations(Station.stationNames);
				station=scanStation.nextLine();
			}while(!Station.stationNames.contains(station));		//stat.nextLine(); //Attila szerint 2 beolvas�s k�z� -> nem kell �j Scanner, de nem m�k�dik
			
			
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
					
				}while(!(Vehicle.lineNums.contains(lineNumAndLetter))); //k�l�n minden j�rm� lineNum-jaira list�t!
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
