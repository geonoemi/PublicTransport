import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		//if vonalszam[i]==valami && vonalBetu.equals("valami") && dayTypes
	//ide kell egy fájlbeolvasó az indulási idõkrõl
		
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
	static DayType dt=DayType.WORKINGDAY;
	
		public static void main(String[] args) {
			readIn("working day departure times for 2 ODA.txt");

			//for (DayType dt : DayType.values()) {
			  //  System.out.println("ENUM: "+ dt);
			    if(dt==DayType.WORKINGDAY){
			    	//olvassa be a munkanapos indulási idõket tartalmazó file-t
			    	for(Vehicle v:vehicles) {
			    		if(v.lineNum==2 && v.way.contentEquals("ODA")) { //minden vonal mindkét irányára
			    			readIn("working day departure times for 2 ODA.txt");
						 }
			    		else if(v.lineNum==2 && v.way.contentEquals("VISSZA")) { 
			    			readIn("working day departure times for 2 VISSZA.txt");
						 }
			    		else if(v.lineNum==3 && v.lineLetter.contentEquals("F") && v.way.contentEquals("ODA")) { 
			    			readIn("working day departure times for 3F ODA.txt");
						 }
			    		else if(v.lineNum==3 && v.lineLetter.contentEquals("F") && v.way.contentEquals("VISSZA")) {
			    			readIn("working day departure times for 3F VISSZA.txt");
						 }
			    		else if(v.lineNum==4 && v.way.contentEquals("ODA")) {
			    			readIn("working day departure times for 4 ODA.txt");
						 }
			    		else if(v.lineNum==4 && v.way.contentEquals("VISSZA")) { 
			    			readIn("working day departure times for 4 VISSZA.txt");
						 }
			    	}
			    }
			/*    }else if(dt==DayType.NONWORKINGDAY) { System.out.println("It's a non-working day! ");
			    }else if(dt==DayType.DAYOFF) { System.out.println("It's a DAYOFF! ");
			    }else if(dt==DayType.WORKINGDAYSDURINGSCHOOLYEAR) {	System.out.println("It's a WORKING DAY DURING SCHOOL YEAR! ");
			    }else if(dt==DayType.SUMMERBREAKWORKINGDAYS) {System.out.println("It's a SUMMER BREAK WORKING DAY! ");
			    }else if(dt==DayType.ONPUBLICHOLIDAYS) { System.out.println("It's an ONPUBLICHOLIDAY! ");
			    }else if(dt==DayType.DURINGSCHOOLHOLIDAYS) { System.out.println("It's a DURINGSCHOOLHOLIDAYS! ");
			    }else if(dt==DayType.DAILYEXCEPTHOLIDAY) { System.out.println("It's a DAILYEXCEPTHOLIDAY! ");
			    }else if(dt==DayType.DAILYEXCEPTONPUBLICHOLIDAYS) {	System.out.println("It's a DAILYEXCEPTONPUBLICHOLIDAYS! ");
			    }   */            
			   
			   else if(dt==DayType.NONWORKINGDAY){
			    	for(Vehicle v:vehicles) {
			    		if(v.lineNum==2 && v.way.contentEquals("ODA")) { 
			    			readIn("non_working day departure times for 2 ODA.txt");
						 }
			    		else if(v.lineNum==2 && v.way.contentEquals("VISSZA")) { 
			    			readIn("non_working day departure times for 2 VISSZA.txt");
						 }
			    		else if(v.lineNum==3 && v.lineLetter.contentEquals("F") && v.way.contentEquals("ODA")) { 
			    			readIn("non_working day departure times for 3F ODA.txt");
						 }
			    		else if(v.lineNum==3 && v.lineLetter.contentEquals("F") && v.way.contentEquals("VISSZA")) { 
			    			readIn("non_working day departure times for 3F VISSZA.txt");
						 }
			    		else if(v.lineNum==4 && v.way.contentEquals("ODA")) { 
			    			readIn("non_working day departure times for 4 ODA.txt");
						 }
			    		else if(v.lineNum==4 && v.way.contentEquals("VISSZA")) {
			    			readIn("non_working day departure times for 4 VISSZA.txt");
						 }
			    	}
			 }
			    
			    if(dt==DayType.DAYOFF){
			    	for(Vehicle v:vehicles) {
			    		if(v.lineNum==2 && v.way.contentEquals("ODA")) { //minden vonal mindkét irányára
			    			readIn("day off departure times for 2 ODA.txt");
						 }
			    		else if(v.lineNum==2 && v.way.contentEquals("VISSZA")) { 
			    			readIn("day off departure times for 2 VISSZA.txt");
						 }
			    		else if(v.lineNum==3 && v.lineLetter.contentEquals("F") && v.way.contentEquals("ODA")) { 
			    			readIn("day off departure times for 3F ODA.txt");
						 }
			    		else if(v.lineNum==3 && v.lineLetter.contentEquals("F") && v.way.contentEquals("VISSZA")) {
			    			readIn("day off departure times for 3F VISSZA.txt");
						 }
			    		else if(v.lineNum==4 && v.way.contentEquals("ODA")) {
			    			readIn("day off departure times for 4 ODA.txt");
						 }
			    		else if(v.lineNum==4 && v.way.contentEquals("VISSZA")) { 
			    			readIn("day off departure times for 4 VISSZA.txt");
						 }
			    	}
			    }
	}

}