import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Route extends Vehicle{
//járat

	private static String [] departureTimes;
		
		public Route(String typeOfVehicle, int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
						double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
						boolean needToRepair, String typeOfFuel, boolean hasWheel) {
				super(typeOfVehicle, lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
						numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
				}

		
		public static DayType dayTypes;
		
		public static void readIn(String fileName){ 
			try {
				
				FileReader reader=new FileReader(fileName);
				BufferedReader buffer=new BufferedReader(reader);
				String queue=null;
				int i=0;
				
				while((queue=buffer.readLine())!=null) {
					
					departureTimes=new String[queue.length()];
					departureTimes[i]=queue;
					System.out.println(departureTimes[i]);
					i++;
					
				}buffer.close();
				
			}catch(FileNotFoundException e) {
				System.out.println("File not found.");
			}catch(IOException e) {
				System.out.println("e.getMessage()");
			}		
	}	
	//static DayType dt=DayType.NONWORKINGDAY;
	
		
	public static  void getsoff(int typeOfVehicle, int lineNum, String lineLetter, int way, DayType dt ) {
		
		System.out.println("This route gets off at the following times: ");
		if(dt==DayType.WORKINGDAY){
	    	
	    		if(lineNum==2 && way==1) { 
	    			readIn("working day departure times for 2 FORTH.txt");
				 }
	    		else if(lineNum==2 && way==2) { 
	    			readIn("working day departure times for 2 BACK.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way==1) { 
	    			readIn("working day departure times for 3F FORTH.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way==2) {
	    			readIn("working day departure times for 3F BACK.txt");
				 }
	    		else if(lineNum==4 && way==1) {
	    			readIn("working day departure times for 4 FORTH.txt");
				 }
	    		else if(lineNum==4 && way==2) { 
	    			readIn("working day departure times for 4 BACK.txt");
				 }
	    }
		
		else if(dt==DayType.NONWORKINGDAY){
	    	//for(Vehicle v:vehicles) {
	    		if(lineNum==2 && way==1) { 
	    			readIn("non_working day departure times for 2 FORTH.txt");
				 }
	    		else if(lineNum==2 && way==2) { 
	    			readIn("non_working day departure times for 2 BACK.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way==1) { 
	    			readIn("non_working day departure times for 3F FORTH.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way==2) { 
	    			readIn("non_working day departure times for 3F BACK.txt");
				 }
	    		else if(lineNum==4 && way==1) { 
	    			readIn("non_working day departure times for 4 FORTH.txt");
				 }
	    		else if(lineNum==4 && way==2) {
	    			readIn("non_working day departure times for 4 BACK.txt");
				 }
		}
		   else if(dt==DayType.DAYOFF){
		    		if(lineNum==2 && way==1) { //minden vonal mindkét irányára
		    			readIn("day off departure times for 2 FORTH.txt");
					 }
		    		else if(lineNum==2 && way==2) { 
		    			readIn("day off departure times for 2 BACK.txt");
					 }
		    		else if(lineNum==3 && lineLetter.equals("F") && way==1) { 
		    			readIn("day off departure times for 3F FORTH.txt");
					 }
		    		else if(lineNum==3 && lineLetter.equals("F") && way==2) {
		    			readIn("day off departure times for 3F BACK.txt");
					 }
		    		else if(lineNum==4 && way==1) {
		    			readIn("day off departure times for 4 FORTH.txt");
					 }
		    		else if(lineNum==4 && way==2) { 
		    			readIn("day off departure times for 4 BACK.txt");
					 }
		    }	
	}
	
	public static void getARoute() {
		
		Scanner type=new Scanner(System.in);
		System.out.println("Choose from the types of vehicles: BUS=1, TRAM=2, TROLLEY=3 : ");
		int typeOfVehicle=type.nextInt();
		
		
		Scanner scInt=new Scanner(System.in);
		System.out.println("Which vehicle do you want to travel with? Please enter the number, letter, direction of the vehicle and the type of the day.\nNumber: ");
		int num=scInt.nextInt();
			
		Scanner scStr1=new Scanner(System.in);
		System.out.println("Letter: ");
		String letter=scStr1.nextLine();
				
		Scanner scStr2=new Scanner(System.in);
		System.out.println("Way (FORTH=1 BACK=2) : ");
		int way=scStr2.nextInt();
	
		Scanner dtp=new Scanner(System.in);
	//	System.out.println("Choose from the following daytypes:WORKINGDAY,NONWORKINGDAY,DAYOFF,WORKINGDAYSDURINGSCHOOLYEAR,SUMMERBREAKWORKINGDAYS,ONPUBLICHOLIDAYS,DURINGSCHOOLHOLIDAYS,DAILYEXCEPTHOLIDAY,DAILYEXCEPTONPUBLICHOLIDAYS ");
	
		System.out.println("Choose from the following daytypes: ");
		for (DayType dt : DayType.values())
		    System.out.printf("\t%s\n", dt);
		
		DayType dayTypes  = DayType.valueOf(dtp.nextLine());//String to enum
	    
		getsoff(typeOfVehicle, num, letter, way, dayTypes); 
		scInt.close();
		scStr1.close();
		scStr2.close();
		dtp.close();
	}
	
	public static void main(String[] args) {
			getARoute();
	}
		
}