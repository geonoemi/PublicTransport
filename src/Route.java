import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Route extends Vehicle{
//járat

	private static String [] departureTimes;
		
		public Route(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
						double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
						boolean needToRepair, String typeOfFuel, boolean hasWheel) {
				super(lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
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
	
		
	public static  void getsoff(DayType dt, int lineNum, String lineLetter, String way ) {
		
		if(dt==DayType.WORKINGDAY){
	    	
	    		if(lineNum==2 && way.equals("FORTH")) { 
	    			readIn("working day departure times for 2 FORTH.txt");
				 }
	    		else if(lineNum==2 && way.equals("BACK")) { 
	    			readIn("working day departure times for 2 BACK.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way.equals("FORTH")) { 
	    			readIn("working day departure times for 3F FORTH.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way.equals("BACK")) {
	    			readIn("working day departure times for 3F BACK.txt");
				 }
	    		else if(lineNum==4 && way.equals("FORTH")) {
	    			readIn("working day departure times for 4 FORTH.txt");
				 }
	    		else if(lineNum==4 && way.equals("BACK")) { 
	    			readIn("working day departure times for 4 BACK.txt");
				 }
	    }
		
		else if(dt==DayType.NONWORKINGDAY){
	    	//for(Vehicle v:vehicles) {
	    		if(lineNum==2 && way.equals("FORTH")) { 
	    			readIn("non_working day departure times for 2 FORTH.txt");
				 }
	    		else if(lineNum==2 && way.equals("BACK")) { 
	    			readIn("non_working day departure times for 2 BACK.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way.equals("FORTH")) { 
	    			readIn("non_working day departure times for 3F FORTH.txt");
				 }
	    		else if(lineNum==3 && lineLetter.equals("F") && way.equals("BACK")) { 
	    			readIn("non_working day departure times for 3F BACK.txt");
				 }
	    		else if(lineNum==4 && way.equals("FORTH")) { 
	    			readIn("non_working day departure times for 4 FORTH.txt");
				 }
	    		else if(lineNum==4 && way.equals("BACK")) {
	    			readIn("non_working day departure times for 4 BACK.txt");
				 }
	    	//}
	 }
		   else if(dt==DayType.DAYOFF){
			//   for(Vehicle v:vehicles) {
		    		if(lineNum==2 && way.equals("FORTH")) { //minden vonal mindkét irányára
		    			readIn("day off departure times for 2 FORTH.txt");
					 }
		    		else if(lineNum==2 && way.equals("BACK")) { 
		    			readIn("day off departure times for 2 BACK.txt");
					 }
		    		else if(lineNum==3 && lineLetter.equals("F") && way.equals("FORTH")) { 
		    			readIn("day off departure times for 3F FORTH.txt");
					 }
		    		else if(lineNum==3 && lineLetter.equals("F") && way.equals("BACK")) {
		    			readIn("day off departure times for 3F BACK.txt");
					 }
		    		else if(lineNum==4 && way.equals("FORTH")) {
		    			readIn("day off departure times for 4 FORTH.txt");
					 }
		    		else if(lineNum==4 && way.equals("BACK")) { 
		    			readIn("day off departure times for 4 BACK.txt");
					 }
			  // }
		    }	
		
	}
	
	public static void getARoute() {
		
		Scanner scInt=new Scanner(System.in);
		System.out.println("Which vehicle do you want to travel with? Please enter the number, letter, and direction of the vehicle.\nNumber: ");
		int num=scInt.nextInt();
		
		
		Scanner scStr1=new Scanner(System.in);
		System.out.println("Letter: ");
		String letter=scStr1.nextLine();
		
		
		Scanner scStr2=new Scanner(System.in);
		System.out.println("Way (BACK/FORTH) : ");
		String way=scStr2.nextLine();
	
		
		getsoff(DayType.NONWORKINGDAY, num, letter, "FORTH"); 
	}
	
		public static void main(String[] args) {
			//readIn("non_working day departure times for 2 FORTH.txt");

			//for (DayType dt : DayType.values()) {
			  //  System.out.println("ENUM: "+ dt);
		getARoute();
		
				  
			  
			  
			    
			
	}

}