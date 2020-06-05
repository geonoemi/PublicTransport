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
	    	//ut�naj�rni, hogy a f�jlok k�z�tt iter�ljon �s azt olvassa be, aminek a c�m�ben megtal�lhat�k a vonalsz�m, vonalbet�, ir�ny �rt�kek
	    		
				if(stationName.equals("Szem�lyi p�lyaudvar")) {
					
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Szem�lyi p�lyaudvar\\working day departure times for 2 FORTH.txt");
	    				}	
	    				else{
	    					readIn("departure times\\workingday\\2\\Szem�lyi p�lyaudvar\\working day departure times for 2 BACK.txt");
	    				}
					}
	    		}
	    		
	    		else if(stationName.equals("Anna-k�t")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Anna-k�t\\working day departure times for 2 FORTH.txt");
	    				}
	    				else {
	    					readIn("departure times\\workingday\\2\\Anna-k�t\\working day departure times for 2 BACK.txt");
	    				}	
	    			}
	    			
	    			else if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way.equals("Forth")) {
	    						readIn("departure times\\workingday\\3F\\Anna-k�t\\working day departure times for 2 FORTH.txt");
	    					}
	    					else {
	    						readIn("departure times\\workingday\\3F\\Anna-k�t\\working day departure times for 2 BACK.txt");
	    					}
	    				}
	    				
	    				else {
	    					if(way.equals("Forth")) {
	    						readIn("departure times\\workingday\\3\\Anna-k�t\\working day departure times for 2 FORTH.txt");
	    					}
	    					else {
	    						readIn("departure times\\workingday\\3\\Anna-k�t\\working day departure times for 2 BACK.txt");
	    					}
	    				}
	    			}
	    			
	    			else if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Anna-k�t\\working day departure times for 2 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Anna-k�t\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
	    		
	    		else if(stationName.equals("V�rt�")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\V�rt�\\working day departure times for 2 FORTH.txt");
	    				}
	    				else {
	    					readIn("departure times\\workingday\\2\\V�rt�\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Sz�chenyi-t�r")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way.equals("Forth")) { 
	    					readIn("departure times\\workingday\\2\\Sz�chenyi-t�r\\working day departure times for 2 FORTH.txt");
	    				}
	    				else{ 
		    			readIn("departure times\\workingday\\2\\Sz�chenyi t�r\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Dugonics-t�r")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3F\\Dugonics-t�r\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    		    			readIn("departure times\\workingday\\3F\\Dugonics-t�r\\working day departure times for 3F BACK.txt");
	    	    			}	
	    				}
	    				
	    				else {
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3\\Dugonics-t�r\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    		    			readIn("departure times\\workingday\\3\\Dugonics-t�r\\working day departure times for 3F BACK.txt");
	    	    			}	
	    				}
	    			}
	    			
	    			else if(lineNum==4){
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Dugonics-t�r\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Dugonics-t�r\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}	
				
	    		else if(stationName.equals("Fon�gy�ri �t")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")){
	    					
	    					if(way.equals("Forth")) { 
	    			   			readIn("departure times\\workingday\\3F\\Fon�gy�ri �t\\working day departure times for 3F FORTH.txt");
	    					}
	    					else { 
	    						readIn("departure times\\workingday\\3F\\Fon�gy�ri �t\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    			}	
	    		}
				
	    		else if(stationName.equals("K�lv�ria-t�r")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3F\\K�lv�ria-t�r\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("departure times\\workingday\\3F\\K�lv�ria-t�r\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    				
	    				else {
	    					if(way.equals("Forth")) { 
	    						readIn("departure times\\workingday\\3\\K�lv�ria-t�r\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("departure times\\workingday\\3\\K�lv�ria-t�r\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    			}
	    		
	    		}
	    			
	    		else if(stationName.equals("Kecsk�s")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Kecsk�s\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Kecsk�s\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Tarj�n")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Tarj�n\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Tarj�n\\working day departure times for 4 BACK.txt");
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
				
	    		else if(stationName.equals("Vit�z utca")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way.equals("Forth")) {
	    					readIn("departure times\\workingday\\4\\Vit�z utca\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("departure times\\workingday\\4\\Vit�z utca\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
		}
		
		else if(dayTypes==DayType.NON_WORKING_DAY){
	    	
			if(stationName.equals("Szem�lyi p�lyaudvar")) {
				
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Szem�lyi p�lyaudvar\\non_working day departure times for 2 FORTH.txt");
    				}	
    				else{
    					readIn("departure times\\non_workingday\\2\\Szem�lyi p�lyaudvar\\non_working day departure times for 2 BACK.txt");
    				}
				}
    		}
    		
    		else if(stationName.equals("Anna-k�t")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Anna-k�t\\non_working day departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\non_workingday\\2\\Anna-k�t\\non_working day departure times for 2 BACK.txt");
    				}	
    			}
    			
    			else if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) {
    						readIn("departure times\\non_workingday\\3F\\Anna-k�t\\non_working day departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\non_workingday\\3F\\Anna-k�t\\non_working day departure times for 2 BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) {
    						readIn("departure times\\non_workingday\\3\\Anna-k�t\\non_working day departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\non_workingday\\3\\Anna-k�t\\non_working day departure times for 2 BACK.txt");
    					}
    				}
    			}
    			
    			else if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Anna-k�t\\non_working day departure times for 2 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Anna-k�t\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
    		
    		else if(stationName.equals("V�rt�")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\V�rt�\\non_working day departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\non_workingday\\2\\V�rt�\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Sz�chenyi-t�r")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\non_workingday\\2\\Sz�chenyi-t�r\\non_working day departure times for 2 FORTH.txt");
    				}
    				else{ 
	    			readIn("departure times\\non_workingday\\2\\Sz�chenyi t�r\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Dugonics-t�r")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3F\\Dugonics-t�r\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\non_workingday\\3F\\Dugonics-t�r\\non_working day departure times for 3F BACK.txt");
    	    			}	
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3\\Dugonics-t�r\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\non_workingday\\3\\Dugonics-t�r\\non_working day departure times for 3F BACK.txt");
    	    			}	
    				}
    			}
    			
    			else if(lineNum==4){
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Dugonics-t�r\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Dugonics-t�r\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}	
			
    		else if(stationName.equals("Fon�gy�ri �t")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")){
    					
    					if(way.equals("Forth")) { 
    			   			readIn("departure times\\non_workingday\\3F\\Fon�gy�ri �t\\non_working day departure times for 3F FORTH.txt");
    					}
    					else { 
    						readIn("departure times\\non_workingday\\3F\\Fon�gy�ri �t\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    			}	
    		}
			
    		else if(stationName.equals("K�lv�ria-t�r")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3F\\K�lv�ria-t�r\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\non_workingday\\3F\\K�lv�ria-t�r\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\non_workingday\\3\\K�lv�ria-t�r\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\non_workingday\\3\\K�lv�ria-t�r\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    			}
    		
    		}
    			
    		else if(stationName.equals("Kecsk�s")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Kecsk�s\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Kecsk�s\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Tarj�n")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Tarj�n\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Tarj�n\\non_working day departure times for 4 BACK.txt");
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
			
    		else if(stationName.equals("Vit�z utca")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\non_workingday\\4\\Vit�z utca\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\non_workingday\\4\\Vit�z utca\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
		}
		
	
		else if(dayTypes==DayType.DAY_OFF){
			
			if(stationName.equals("Szem�lyi p�lyaudvar")) {
				
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Szem�lyi p�lyaudvar\\dayoff departure times for 2 FORTH.txt");
    				}	
    				else{
    					readIn("departure times\\dayoff\\2\\Szem�lyi p�lyaudvar\\dayoff departure times for 2 BACK.txt");
    				}
				}
    		}
    		
    		else if(stationName.equals("Anna-k�t")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Anna-k�t\\dayoff departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\dayoff\\2\\Anna-k�t\\dayoff departure times for 2 BACK.txt");
    				}	
    			}
    			
    			else if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) {
    						readIn("departure times\\dayoff\\3F\\Anna-k�t\\dayoff departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\dayoff\\3F\\Anna-k�t\\dayoff departure times for 2 BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) {
    						readIn("departure times\\dayoff\\3\\Anna-k�t\\dayoff departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("departure times\\dayoff\\3\\Anna-k�t\\dayoff departure times for 2 BACK.txt");
    					}
    				}
    			}
    			
    			else if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Anna-k�t\\dayoff departure times for 2 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Anna-k�t\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
    		
    		else if(stationName.equals("V�rt�")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\V�rt�\\dayoff departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("departure times\\dayoff\\2\\V�rt�\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Sz�chenyi-t�r")) {
    			
    			if(lineNum==2) {
    				
    				if(way.equals("Forth")) { 
    					readIn("departure times\\dayoff\\2\\Sz�chenyi-t�r\\dayoff departure times for 2 FORTH.txt");
    				}
    				else{ 
	    			readIn("departure times\\dayoff\\2\\Sz�chenyi t�r\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Dugonics-t�r")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3F\\Dugonics-t�r\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\dayoff\\3F\\Dugonics-t�r\\dayoff departure times for 3F BACK.txt");
    	    			}	
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3\\Dugonics-t�r\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("departure times\\dayoff\\3\\Dugonics-t�r\\dayoff departure times for 3F BACK.txt");
    	    			}	
    				}
    			}
    			
    			else if(lineNum==4){
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Dugonics-t�r\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Dugonics-t�r\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}	
			
    		else if(stationName.equals("Fon�gy�ri �t")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")){
    					
    					if(way.equals("Forth")) { 
    			   			readIn("departure times\\dayoff\\3F\\Fon�gy�ri �t\\dayoff departure times for 3F FORTH.txt");
    					}
    					else { 
    						readIn("departure times\\dayoff\\3F\\Fon�gy�ri �t\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    			}	
    		}
			
    		else if(stationName.equals("K�lv�ria-t�r")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3F\\K�lv�ria-t�r\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\dayoff\\3F\\K�lv�ria-t�r\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    				
    				else {
    					if(way.equals("Forth")) { 
    						readIn("departure times\\dayoff\\3\\K�lv�ria-t�r\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("departure times\\dayoff\\3\\K�lv�ria-t�r\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    			}
    		
    		}
    			
    		else if(stationName.equals("Kecsk�s")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Kecsk�s\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Kecsk�s\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Tarj�n")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Tarj�n\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Tarj�n\\dayoff departure times for 4 BACK.txt");
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
			
    		else if(stationName.equals("Vit�z utca")) {
    			
    			if(lineNum==4) {
    				
    				if(way.equals("Forth")) {
    					readIn("departure times\\dayoff\\4\\Vit�z utca\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("departure times\\dayoff\\4\\Vit�z utca\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}  
		}	*/
	}
}
