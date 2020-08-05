import java.util.*;

public class Route extends Line {

	private static String userChoice;
		
	public static String getUserChoice() {
		return userChoice;
	}

	public Route(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
				 boolean needToRepair, String typeOfFuel, boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
	}

	public static void getARoute() { //used in IsEmptyCheck.getStarted()
	
		Scanner scanTypeOfVehicle=new Scanner(System.in);
		int typeOfVehicle;
			
			do{
				System.out.println("Choose from the types of vehicles: BUS = 1, TRAM = 2, TROLLEY = 3 : ");
		
				while(!scanTypeOfVehicle.hasNextInt()){ 
					
					System.out.println("Invalid input! Enter an integer of 1 / 2 / 3 : ");
		            scanTypeOfVehicle.next(); 
				} 
							
				typeOfVehicle=scanTypeOfVehicle.nextInt(); 
				
			}while( !(typeOfVehicle==1 || typeOfVehicle==2 || typeOfVehicle==3) ); 
				
			
		Scanner scanNumAndLetter=new Scanner(System.in);
		String lineNumAndLetter="";
		
		Scanner scanStation=new Scanner(System.in);
		String station="";
		Scanner scanWay=new Scanner(System.in);
		String way="";
		Scanner scanDisabled=new Scanner(System.in);
		int disabled=0;
		
		if (typeOfVehicle==1) { 	//if bus
			
			do {
				
				System.out.println("Do you need disabled bus? YES : 1  NO : 0 ");
				
				while(!scanDisabled.hasNextInt()){ 
					
					System.out.println("Invalid input! Enter an integer of 1 / 0 : ");
					scanDisabled.next(); 
				} 
				disabled=scanDisabled.nextInt();
				
				if(disabled==1) {
					
					do {
						System.out.println("Choose from the following buses:");
						Disabled.printDisabledBuses();
						
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						
					}while(! (Disabled.getDisabledBuses().contains(lineNumAndLetter)) ); 
					
					if(lineNumAndLetter.equals("71A")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames71A());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames71A().contains(station));	
						
						do{
							System.out.println("Choose way ( Napfényfürdõ = 1  Mars-tér = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Napfényfürdõ";
							}else if(way.equals("2")) {
								way="Mars-tér";
							}
						}while(!(way.equals("Napfényfürdõ") || way.equals("Mars-tér")));
					}
					else if(lineNumAndLetter.equals("90H")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames90H());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames90H().contains(station));	
						
						do{
							System.out.println("Choose way ( Szegedi Ipari Logisztikai Központ = 1  Lugas utca = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Szegedi Ipari Logisztikai Központ";
							}else if(way.equals("2")) {
								way="Lugas utca";
							}
						}while(!(way.equals("Szegedi Ipari Logisztikai Központ") || way.equals("Lugas utca")));
					}
					
				}else if(disabled==0) {
					
					Bus.readIn(); //ArrayLists from Bus

					do {
						
						System.out.println("Choose from the following buses:");
						Bus.printBusLineNums();
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
				
					}while(! (Bus.getBusesLineNums().contains(lineNumAndLetter)) ); 
					
					Station.readInBuses();
						
					if(lineNumAndLetter.equals("70")) {
						
						do {
							System.out.println("Choose station: ");						
							Station.printStations(Station.getStationNames70());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames70().contains(station));	
						
						
						do{
							System.out.println("Choose way ( Füvészkert = 1  Mars-tér = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Füvészkert";
							}else if(way.equals("2")) {
								way="Mars-tér";
							}
						}while(!(way.equals("Füvészkert") || way.equals("Mars-tér")));
						
					}
						
					else if(lineNumAndLetter.equals("71A")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames71A());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames71A().contains(station));	
						
						do{
							System.out.println("Choose way ( Napfényfürdõ = 1  Mars-tér = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Napfényfürdõ";
							}else if(way.equals("2")) {
								way="Mars-tér";
							}
						}while(!(way.equals("Napfényfürdõ") || way.equals("Mars-tér")));
					}
						
					else if(lineNumAndLetter.equals("90H")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames90H());				
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames90H().contains(station));	
						
						do{
							System.out.println("Choose way ( Szegedi Ipari Logisztikai Központ = 1  Lugas utca = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Szegedi Ipari Logisztikai Központ";
							}else if(way.equals("2")) {
								way="Lugas utca";
							}
						}while(!(way.equals("Szegedi Ipari Logisztikai Központ") || way.equals("Lugas utca")));
					}
				}
			}while(!(disabled==1 || disabled==0));
		}	
		
		else if (typeOfVehicle==2) { 	//if tram		
			
			do {
				
				System.out.println("Do you need disabled tram? YES : 1  NO : 0 ");
				
				while(!scanDisabled.hasNextInt()){ 
					
					System.out.println("Invalid input! Enter an integer of 1 / 0 : ");
					scanDisabled.next(); 
				} 
				disabled=scanDisabled.nextInt();
				
				if(disabled ==1) {
					
					do {
						System.out.println("Choose from the following trams:");
						Disabled.printDisabledTrams();
						
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						
					}while(! (Disabled.getDisabledTrams().contains(lineNumAndLetter)) ); 
					
					if(lineNumAndLetter.equals("2")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames2());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames2().contains(station));	
						
						do{
							System.out.println("Choose way ( Személyi pályaudvar = 1  Európa-liget = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Személyi pályaudvar";
							}else if(way.equals("2")) {
								way="Európa-liget";
							}
						}while(!(way.equals("Személyi pályaudvar") || way.equals("Európa-liget")));
					}
					
					else if(lineNumAndLetter.equals("3F")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames3F());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames3F().contains(station));	
						
						do{
							System.out.println("Choose way ( Tarján = 1  Fonógyári út = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Tarján";
							}else if(way.equals("2")) {
								way="Fonógyári út";
							}
						}while(!(way.equals("Tarján") || way.equals("Fonógyári út")));
					}
					
				}else if(disabled ==0) {
					
					Tram.readIn();
					
					do {					
						System.out.println("Choose from the following trams:");
						Tram.printTramLineNums();
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						
					}while(!(Tram.getTramsLineNums().contains(lineNumAndLetter)));
					
					Station.readInTrams();
					
					if(lineNumAndLetter.equals("2")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames2());
														
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames2().contains(station));	
						
						do{
							System.out.println("Choose way ( Személyi pályaudvar = 1  Európa-liget = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Személyi pályaudvar";
							}else if(way.equals("2")) {
								way="Európa-liget";
							}
						}while(!(way.equals("Személyi pályaudvar") || way.equals("Európa-liget")));
					}
					
					else if(lineNumAndLetter.equals("3F")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames3F());
							
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames3F().contains(station));	
						
						do{
							System.out.println("Choose way ( Tarján = 1  Fonógyári út = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Tarján";
							}else if(way.equals("2")) {
								way="Fonógyári út";
							}
						}while(!(way.equals("Tarján") || way.equals("Fonógyári út")));
					}
					
					else if(lineNumAndLetter.equals("4")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames4());
														
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames4().contains(station));	
						
						do{
							System.out.println("Choose way ( Tarján = 1  Kecskés = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Tarján";
							}else if(way.equals("2")) {
								way="Kecskés";
							}
						}while(!(way.equals("Tarján") || way.equals("Kecskés")));
					}
				}
			}while(!(disabled==1 || disabled==0));
		}
			
		else if (typeOfVehicle==3) { //if trolley
			
			do {
				
				System.out.println("Do you need disabled trolley? YES : 1  NO : 0 ");
				
				while(!scanDisabled.hasNextInt()){ 
					
					System.out.println("Invalid input! Enter an integer of 1 / 0 : ");
					scanDisabled.next(); 
				} 
				
				disabled=scanDisabled.nextInt();
				
				if(disabled ==1) {
					
					do {
						System.out.println("Choose from the following trams:");
						Disabled.printDisabledTrolleys();
						
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						
					}while(! (Disabled.getDisabledTrolleys().contains(lineNumAndLetter)) ); 
					
					if(lineNumAndLetter.equals("8")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames8());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames8().contains(station));	
						
						do{
							System.out.println("Choose way ( Klinikák = 1  Makkosház = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinikák";
							}else if(way.equals("2")) {
								way="Makkosház";
							}
						}while(!(way.equals("Klinikák") || way.equals("Makkosház")));
					}
					
					else if(lineNumAndLetter.equals("10")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames10());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames10().contains(station));	
						
						do{
							System.out.println("Choose way ( Klinikák = 1  Víztorony tér = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinikák";
							}else if(way.equals("2")) {
								way="Víztorony tér";
							}
						}while(!(way.equals("Klinikák") || way.equals("Víztorony tér")));
					}
					
				}else if(disabled ==0) {
					
					Trolley.readIn();
							
					do {					
						System.out.println("Choose from the following trolleys:");			
						Trolley.printTrolleyLineNums();
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						
					}while(!(Trolley.getTrolleysLineNums().contains(lineNumAndLetter)));
					
					Station.readInTrolleys();
					
					if(lineNumAndLetter.equals("8")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames8());
														
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames8().contains(station));	
						
						do{
							System.out.println("Choose way ( Klinikák = 1  Makkosház = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinikák";
							}else if(way.equals("2")) {
								way="Makkosház";
							}
						}while(!(way.equals("Klinikák") || way.equals("Makkosház")));
					}
					
					else if(lineNumAndLetter.equals("10")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames10());
							
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames10().contains(station));	
						
						do{
							System.out.println("Choose way ( Klinikák = 1  Víztorony tér = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinikák";
							}else if(way.equals("2")) {
								way="Víztorony tér";
							}
						}while(!(way.equals("Klinikák") || way.equals("Víztorony tér")));
					}
					
					else if(lineNumAndLetter.equals("19")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames19());
														
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames19().contains(station));	
						
						do{
							System.out.println("Choose way ( Makkosház = 1  Víztorony tér = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Makkosház";
							}else if(way.equals("2")) {
								way="Víztorony tér";
							}
						}while(!(way.equals("Makkosház") || way.equals("Víztorony tér")));
					}
				}
			}while(!(disabled==1 || disabled==0));
		}
			
		/*Scanner scanWay=new Scanner(System.in);
		String way="";
			do{
				System.out.println("Choose way ( FORTH = 1  BACK = 2 ) : ");
				
				while(!scanWay.hasNextInt()){ 												

					System.out.println("Invalid input! Type an integer of 1 / 2  : ");
					scanWay.nextLine(); 
				} 	
				way=scanWay.nextLine();
				
				if(way.equals("1")) {
					way="forth";
				}else if(way.equals("2")) {
					way="back";
				}
			}while(!(way.equals("back") || way.equals("forth")));	*/
						
	
		Scanner scanDayType=new Scanner(System.in);
		String dayType=" ";
		
		do {
			System.out.println("Choose from the following daytypes: ");
			DayTypes.printDayTypes();		
			dayType  = scanDayType.nextLine(); 
				
		}while(!(DayTypes.getDayTypes().contains(dayType)));
		
		userChoice =lineNumAndLetter+" "+station+" "+dayType+" "+way;
		getsOff(userChoice); //prints deparure Times
		
		scanStation.close();
		scanTypeOfVehicle.close();
		scanDisabled.close();
		scanNumAndLetter.close();
		scanWay.close();
		scanDayType.close();
	}
	
	public static void getsOff(String userChoice) { //used in getARoute()
		
		System.out.println("This route gets off at the following times from the chosen station: ");
		DepartureTimes.readInDepartureTimes("departure times");
		
	}
}