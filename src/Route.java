import java.util.*;

public class Route extends Line {

	protected static String userChoice;
	
	public Route(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
				 boolean needToRepair, String typeOfFuel, boolean hasWheel, String typeOfVehicle) {
			super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
	}

	
	@SuppressWarnings("unlikely-arg-type")
	public static void getARoute() {
	
		Scanner scanTypeOfVehicle=new Scanner(System.in);
		int typeOfVehicle;
			
			do{
				System.out.println("Choose from the types of vehicles: BUS = 1, TRAM = 2, TROLLEY = 3 : ");
		
				while(!scanTypeOfVehicle.hasNextInt()){ // && !( scanTypeOfVehicle.nextInt()==1) ||  (scanTypeOfVehicle.nextInt()==2) ||  (scanTypeOfVehicle.nextInt()==3)
					
					System.out.println("Invalid input! Enter an integer of 1 / 2 / 3 : ");
		            scanTypeOfVehicle.next(); 
				} 
							
				typeOfVehicle=scanTypeOfVehicle.nextInt(); 
				
			}while( !(typeOfVehicle==1 || typeOfVehicle==2 || typeOfVehicle==3) ); 
				
			
		Scanner scanNumAndLetter=new Scanner(System.in);
		String lineNumAndLetter="";
		
		Scanner scanStation=new Scanner(System.in);
		String station="";
		
		Scanner scanDisabled=new Scanner(System.in);
		int disabled=0;
		
		if (typeOfVehicle==1) { 	//busz ág
			do {
				
				System.out.println("Do you need disabled route? YES : 1  NO : 0 ");
				disabled=scanDisabled.nextInt();
				
				if(disabled ==1) {
					
					do {
						System.out.println("Choose from the following buses:");
						Disabled.printDisabledBuses();
						
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						System.out.println("lineNumAndLetter: "+lineNumAndLetter);
						
					}while(! (Disabled.disabledBuses.contains(lineNumAndLetter)) ); 
					
					if(lineNumAndLetter.equals("71A")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.stationNames71A);
							
							station=scanStation.nextLine();
								
						}while(!Station.stationNames71A.contains(station));	
					}
					
				}else {
					Bus.readIn(); //ArrayLists from Bus

					do {
						
						System.out.println("Choose from the following buses:");
						Bus.printBusLineNums();
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
				
					}while(! (Bus.busesLineNums.contains(lineNumAndLetter)) ); 
					
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
				
				
			}while(!(disabled==1 || disabled==0));
		}	
				/*		do {
								
							System.out.println("Choose from the following buses:");
							Bus.printBusLineNums();
							lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
					
						}while(! (Bus.busesLineNums.contains(lineNumAndLetter)) ); 
						
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
							
					}*/

		else if (typeOfVehicle==2) { 	//villamos ág			
			do {
				
				System.out.println("Do you need disabled route? YES : 1  NO : 0 ");
				disabled=scanDisabled.nextInt();
				
				if(disabled ==1) {
					
					do {
						System.out.println("Choose from the following trams:");
						Disabled.printDisabledTrams();
						
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						System.out.println("lineNumAndLetter: "+lineNumAndLetter);
						
					}while(! (Disabled.disabledTrams.contains(lineNumAndLetter)) ); 
					
					if(lineNumAndLetter.equals("3F")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.stationNames3F);
							
							station=scanStation.nextLine();
								
						}while(!Station.stationNames3F.contains(station));	
					}
					
				}else {
					Tram.readIn();
					
					do {					
						System.out.println("Choose from the following trams:");
						Tram.printTramLineNums();
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						
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
			}while(!(disabled==1 || disabled==0));
		}
//troli ág			
		else if (typeOfVehicle==3) { 
			
			do {
				
				System.out.println("Do you need disabled route? YES : 1  NO : 0 ");
				disabled=scanDisabled.nextInt();
				
				if(disabled ==1) {
					
					do {
						System.out.println("Choose from the following trams:");
						Disabled.printDisabledTrolleys();
						
						lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
						System.out.println("lineNumAndLetter: "+lineNumAndLetter);
						
					}while(! (Disabled.disabledTrolleys.contains(lineNumAndLetter)) ); 
					
					if(lineNumAndLetter.equals("10")) {
						
						do {
							System.out.println("Choose station: ");
								
							Station.printStations(Station.stationNames10);
							
							station=scanStation.nextLine();
								
						}while(!Station.stationNames10.contains(station));	
					}
					
				}else {
					
				Trolley.readIn();
						
				do {					
					System.out.println("Choose from the following trolleys:");			
					Trolley.printTrolleyLineNums();
					lineNumAndLetter=scanNumAndLetter.nextLine().toUpperCase();
					
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
		}while(!(disabled==1 || disabled==0));
	}
			
		Scanner scanWay=new Scanner(System.in);
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
			
			}while(!(way.equals("back") || way.equals("forth")));
						
	
		Scanner scanDayType=new Scanner(System.in);
		String dayType=" ";
		
		do {
				System.out.println("Choose from the following daytypes: ");
				DayTypes.printDayTypes();		
				dayType  = scanDayType.nextLine(); 
				
		}while(!(DayTypes.dayTypes.contains(dayType)));
		
		userChoice =lineNumAndLetter+" "+station+" "+dayType+" "+way;
		//System.out.println(lineNumAndLetter+" "+station+" "+dayType+" "+way);
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