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
							System.out.println("Choose way ( Napf�nyf�rd� = 1  Mars-t�r = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Napf�nyf�rd�";
							}else if(way.equals("2")) {
								way="Mars-t�r";
							}
						}while(!(way.equals("Napf�nyf�rd�") || way.equals("Mars-t�r")));
					}
					else if(lineNumAndLetter.equals("90H")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames90H());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames90H().contains(station));	
						
						do{
							System.out.println("Choose way ( Szegedi Ipari Logisztikai K�zpont = 1  Lugas utca = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Szegedi Ipari Logisztikai K�zpont";
							}else if(way.equals("2")) {
								way="Lugas utca";
							}
						}while(!(way.equals("Szegedi Ipari Logisztikai K�zpont") || way.equals("Lugas utca")));
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
							System.out.println("Choose way ( F�v�szkert = 1  Mars-t�r = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="F�v�szkert";
							}else if(way.equals("2")) {
								way="Mars-t�r";
							}
						}while(!(way.equals("F�v�szkert") || way.equals("Mars-t�r")));
						
					}
						
					else if(lineNumAndLetter.equals("71A")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames71A());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames71A().contains(station));	
						
						do{
							System.out.println("Choose way ( Napf�nyf�rd� = 1  Mars-t�r = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Napf�nyf�rd�";
							}else if(way.equals("2")) {
								way="Mars-t�r";
							}
						}while(!(way.equals("Napf�nyf�rd�") || way.equals("Mars-t�r")));
					}
						
					else if(lineNumAndLetter.equals("90H")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames90H());				
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames90H().contains(station));	
						
						do{
							System.out.println("Choose way ( Szegedi Ipari Logisztikai K�zpont = 1  Lugas utca = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Szegedi Ipari Logisztikai K�zpont";
							}else if(way.equals("2")) {
								way="Lugas utca";
							}
						}while(!(way.equals("Szegedi Ipari Logisztikai K�zpont") || way.equals("Lugas utca")));
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
							System.out.println("Choose way ( Szem�lyi p�lyaudvar = 1  Eur�pa-liget = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Szem�lyi p�lyaudvar";
							}else if(way.equals("2")) {
								way="Eur�pa-liget";
							}
						}while(!(way.equals("Szem�lyi p�lyaudvar") || way.equals("Eur�pa-liget")));
					}
					
					else if(lineNumAndLetter.equals("3F")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames3F());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames3F().contains(station));	
						
						do{
							System.out.println("Choose way ( Tarj�n = 1  Fon�gy�ri �t = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Tarj�n";
							}else if(way.equals("2")) {
								way="Fon�gy�ri �t";
							}
						}while(!(way.equals("Tarj�n") || way.equals("Fon�gy�ri �t")));
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
							System.out.println("Choose way ( Szem�lyi p�lyaudvar = 1  Eur�pa-liget = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Szem�lyi p�lyaudvar";
							}else if(way.equals("2")) {
								way="Eur�pa-liget";
							}
						}while(!(way.equals("Szem�lyi p�lyaudvar") || way.equals("Eur�pa-liget")));
					}
					
					else if(lineNumAndLetter.equals("3F")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames3F());
							
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames3F().contains(station));	
						
						do{
							System.out.println("Choose way ( Tarj�n = 1  Fon�gy�ri �t = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Tarj�n";
							}else if(way.equals("2")) {
								way="Fon�gy�ri �t";
							}
						}while(!(way.equals("Tarj�n") || way.equals("Fon�gy�ri �t")));
					}
					
					else if(lineNumAndLetter.equals("4")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames4());
														
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames4().contains(station));	
						
						do{
							System.out.println("Choose way ( Tarj�n = 1  Kecsk�s = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Tarj�n";
							}else if(way.equals("2")) {
								way="Kecsk�s";
							}
						}while(!(way.equals("Tarj�n") || way.equals("Kecsk�s")));
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
							System.out.println("Choose way ( Klinik�k = 1  Makkosh�z = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinik�k";
							}else if(way.equals("2")) {
								way="Makkosh�z";
							}
						}while(!(way.equals("Klinik�k") || way.equals("Makkosh�z")));
					}
					
					else if(lineNumAndLetter.equals("10")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.getStationNames10());
							
							station=scanStation.nextLine();
								
						}while(!Station.getStationNames10().contains(station));	
						
						do{
							System.out.println("Choose way ( Klinik�k = 1  V�ztorony t�r = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinik�k";
							}else if(way.equals("2")) {
								way="V�ztorony t�r";
							}
						}while(!(way.equals("Klinik�k") || way.equals("V�ztorony t�r")));
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
							System.out.println("Choose way ( Klinik�k = 1  Makkosh�z = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinik�k";
							}else if(way.equals("2")) {
								way="Makkosh�z";
							}
						}while(!(way.equals("Klinik�k") || way.equals("Makkosh�z")));
					}
					
					else if(lineNumAndLetter.equals("10")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames10());
							
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames10().contains(station));	
						
						do{
							System.out.println("Choose way ( Klinik�k = 1  V�ztorony t�r = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Klinik�k";
							}else if(way.equals("2")) {
								way="V�ztorony t�r";
							}
						}while(!(way.equals("Klinik�k") || way.equals("V�ztorony t�r")));
					}
					
					else if(lineNumAndLetter.equals("19")) {
						
						do {
							System.out.println("Choose station: ");
							
							Station.printStations(Station.getStationNames19());
														
							station=scanStation.nextLine();
							
						}while(!Station.getStationNames19().contains(station));	
						
						do{
							System.out.println("Choose way ( Makkosh�z = 1  V�ztorony t�r = 2 ) : ");
							
							while(!scanWay.hasNextInt()){ 												

								System.out.println("Invalid input! Type an integer of 1 / 2  : ");
								scanWay.nextLine(); 
							} 	
							way=scanWay.nextLine();
							
							if(way.equals("1")) {
								way="Makkosh�z";
							}else if(way.equals("2")) {
								way="V�ztorony t�r";
							}
						}while(!(way.equals("Makkosh�z") || way.equals("V�ztorony t�r")));
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