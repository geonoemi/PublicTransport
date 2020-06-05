import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepartureTimes extends Route {
	
	
	public DepartureTimes(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
			double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
			boolean needayTypesoRepair, String typeOfFuel, boolean hasWheel) {
		super(lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
				numOfDisabledPlaces, needayTypesoRepair, typeOfFuel, hasWheel);
	}
	
	public static void readInDepartureTimes(String directoryName) {
		   
        File directory = new File(directoryName);
        ArrayList<String> departureTimesList = new ArrayList<String>(Arrays.asList(directory.list()));

        for(String list: departureTimesList) {
        	if(list.equals(choice+".txt")) {
        	Route.readIn("departure times\\"+list);
        	}
        }
    } 
	
	public static  void getsoff(String stationName, int typeOfVehicle, int lineNum, String lineLetter, String way, String dayType ) {
		
		System.out.println("This route gets off at the following times from the chosen station: ");
		readInDepartureTimes("departure times");
		
	/*	if(dayTypes==DayType.WORKING_DAY){
	    	//utánajárni, hogy a fájlok között iteráljon és azt olvassa be, aminek a címében megtalálhatók a vonalszám, vonalbetû, irány értékek
	    		
				if(stationName.equals("Személyi pályaudvar")) {
					
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Személyi pályaudvar\\working day departure times for 2 FORTH.txt");
	    				}	
	    				else{
	    					readIn("departure times\\workingday\\2\\Személyi pályaudvar\\working day departure times for 2 BACK.txt");
	    				}
					}
	    		}
	    		
	    		else if(stationName.equals("Anna-kút")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    				}
	    				else {
	    					readIn("departure times\\workingday\\2\\Anna-kút\\working day departure times for 2 BACK.txt");
	    				}	
	    			}
	    			
	    			else if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way.equals("Forth")) {
	    						readIn("departure times\\workingday\\3F\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    					}
	    					else {
	    						readIn("departure times\\workingday\\3F\\Anna-kút\\working day departure times for 2 BACK.txt");
	    					}
	    				}
	    				
	    				else {
	    					if(way.equals("Forth")) {
	    						readIn("departure times\\workingday\\3\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    					}
	    					else {
	    						readIn("departure times\\workingday\\3\\Anna-kút\\working day departure times for 2 BACK.txt");
	    					}
	    				}
	    			}
	    			
	    			else if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Anna-kút\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
	    		
	    		else if(stationName.equals("Vértó")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Vértó\\working day departure times for 2 FORTH.txt");
	    				}
	    				else {
	    					readIn("departure times\\workingday\\2\\Vértó\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Széchenyi-tér")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Széchenyi-tér\\working day departure times for 2 FORTH.txt");
	    				}
	    				else{ 
		    			readIn("departure times\\workingday\\2\\Széchenyi tér\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Dugonics-tér")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3F\\Dugonics-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    		    			readIn("departure times\\workingday\\3F\\Dugonics-tér\\working day departure times for 3F BACK.txt");
	    	    			}	
	    				}
	    				
	    				else {
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3\\Dugonics-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    		    			readIn("departure times\\workingday\\3\\Dugonics-tér\\working day departure times for 3F BACK.txt");
	    	    			}	
	    				}
	    			}
	    			
	    			else if(lineNum==4){
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Dugonics-tér\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Dugonics-tér\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}	
				
	    		else if(stationName.equals("Fonógyári út")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")){
	    					
	    					if(way.equals("Forth")) { 
	    			   			readIn("departure times\\workingday\\3F\\Fonógyári út\\working day departure times for 3F FORTH.txt");
	    					}
	    					else { 
	    						readIn("departure times\\workingday\\3F\\Fonógyári út\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    			}	
	    		}
				
	    		else if(stationName.equals("Kálvária-tér")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3F\\Kálvária-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("departure times\\workingday\\3F\\Kálvária-tér\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    				
	    				else {
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3\\Kálvária-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("departure times\\workingday\\3\\Kálvária-tér\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    			}
	    		
	    		}
	    			
	    		else if(stationName.equals("Kecskés")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Kecskés\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Kecskés\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Tarján")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Tarján\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Tarján\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Vadaspark")) {
	    			
	    			if(lineNum==3) {
	    				
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3\\Vadaspark\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("departure times\\workingday\\3\\Vadaspark\\working day departure times for 3F BACK.txt");
	    					}
	    			}
	    		}
				
	    		else if(stationName.equals("Vitéz utca")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Vitéz utca\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Vitéz utca\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
		}
		
		else if(dayTypes==DayType.NON_WORKING_DAY){
	    	
			if(stationName.equals("Személyi pályaudvar")) {
				
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Személyi pályaudvar\\non_working day departure times for 2 FORTH.txt");
    				}	
    				else{
    					readIn("departure times\\non_workingday\\2\\Személyi pályaudvar\\non_working day departure times for 2 BACK.txt");
    				}
				}
    		}
    		
    		else if(stationName.equals("Anna-kút")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\non_workingday\\2\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    				}	
    			}
    			
    			else if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) {
    						readIn("departure times\\non_workingday\\3F\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\non_workingday\\3F\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) {
    						readIn("departure times\\non_workingday\\3\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\non_workingday\\3\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    					}
    				}
    			}
    			
    			else if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
    		
    		else if(stationName.equals("Vértó")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Vértó\\non_working day departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\non_workingday\\2\\Vértó\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Széchenyi-tér")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Széchenyi-tér\\non_working day departure times for 2 FORTH.txt");
    				}
    				else{ 
	    			readIn("departure times\\non_workingday\\2\\Széchenyi tér\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Dugonics-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3F\\Dugonics-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\non_workingday\\3F\\Dugonics-tér\\non_working day departure times for 3F BACK.txt");
    	    			}	
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3\\Dugonics-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\non_workingday\\3\\Dugonics-tér\\non_working day departure times for 3F BACK.txt");
    	    			}	
    				}
    			}
    			
    			else if(lineNum==4){
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Dugonics-tér\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Dugonics-tér\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}	
			
    		else if(stationName.equals("Fonógyári út")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")){
    					
    					if(way.equals("Forth")) { 
    			   			readIn("departure times\\non_workingday\\3F\\Fonógyári út\\non_working day departure times for 3F FORTH.txt");
    					}
    					else { 
    						readIn("departure times\\non_workingday\\3F\\Fonógyári út\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    			}	
    		}
			
    		else if(stationName.equals("Kálvária-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3F\\Kálvária-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\non_workingday\\3F\\Kálvária-tér\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3\\Kálvária-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\non_workingday\\3\\Kálvária-tér\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    			}
    		
    		}
    			
    		else if(stationName.equals("Kecskés")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Kecskés\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Kecskés\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Tarján")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Tarján\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Tarján\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Vadaspark")) {
    			
    			if(lineNum==3) {
    				
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3\\Vadaspark\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\non_workingday\\3\\Vadaspark\\non_working day departure times for 3F BACK.txt");
    					}
    			}
    		}
			
    		else if(stationName.equals("Vitéz utca")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Vitéz utca\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Vitéz utca\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
		}
		
	
		else if(dayTypes==DayType.DAY_OFF){
			
			if(stationName.equals("Személyi pályaudvar")) {
				
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Személyi pályaudvar\\dayoff departure times for 2 FORTH.txt");
    				}	
    				else{
    					readIn("departure times\\dayoff\\2\\Személyi pályaudvar\\dayoff departure times for 2 BACK.txt");
    				}
				}
    		}
    		
    		else if(stationName.equals("Anna-kút")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\dayoff\\2\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    				}	
    			}
    			
    			else if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) {
    						readIn("departure times\\dayoff\\3F\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\dayoff\\3F\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) {
    						readIn("departure times\\dayoff\\3\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\dayoff\\3\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    					}
    				}
    			}
    			
    			else if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
    		
    		else if(stationName.equals("Vértó")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Vértó\\dayoff departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\dayoff\\2\\Vértó\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Széchenyi-tér")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Széchenyi-tér\\dayoff departure times for 2 FORTH.txt");
    				}
    				else{ 
	    			readIn("departure times\\dayoff\\2\\Széchenyi tér\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Dugonics-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3F\\Dugonics-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\dayoff\\3F\\Dugonics-tér\\dayoff departure times for 3F BACK.txt");
    	    			}	
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3\\Dugonics-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\dayoff\\3\\Dugonics-tér\\dayoff departure times for 3F BACK.txt");
    	    			}	
    				}
    			}
    			
    			else if(lineNum==4){
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Dugonics-tér\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Dugonics-tér\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}	
			
    		else if(stationName.equals("Fonógyári út")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")){
    					
    					if(way.equals("Forth")) { 
    			   			readIn("departure times\\dayoff\\3F\\Fonógyári út\\dayoff departure times for 3F FORTH.txt");
    					}
    					else { 
    						readIn("departure times\\dayoff\\3F\\Fonógyári út\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    			}	
    		}
			
    		else if(stationName.equals("Kálvária-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3F\\Kálvária-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\dayoff\\3F\\Kálvária-tér\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3\\Kálvária-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\dayoff\\3\\Kálvária-tér\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    			}
    		
    		}
    			
    		else if(stationName.equals("Kecskés")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Kecskés\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Kecskés\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Tarján")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Tarján\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Tarján\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Vadaspark")) {
    			
    			if(lineNum==3) {
    				
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3\\Vadaspark\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\dayoff\\3\\Vadaspark\\dayoff departure times for 3F BACK.txt");
    					}
    			}
    		}
			
    		else if(stationName.equals("Vitéz utca")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Vitéz utca\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Vitéz utca\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}  
		}	*/
	}
}
