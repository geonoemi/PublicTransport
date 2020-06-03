
public class DepartureTimes extends Route {

	public DepartureTimes(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
			double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
			boolean needToRepair, String typeOfFuel, boolean hasWheel) {
		super(lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
				numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
	}


	public static  void getsoff(String stationName, int typeOfVehicle, int lineNum, String lineLetter, int way, DayType dt ) {
		
		System.out.println("This route gets off at the following times from the chosen station: ");
		
		if(dt==DayType.WORKINGDAY){
	    	//utánajárni, hogy a fájlok között iteráljon és azt olvassa be, aminek a címében megtalálhatók a vonalszám, vonalbetû, irány értékek
	    		
				if(stationName.equals("Személyi pályaudvar")) {
					
	    			if(lineNum==2) {
	    				
	    				if(way==1) { 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Személyi pályaudvar\\working day departure times for 2 FORTH.txt");
	    				}	
	    				else{
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Személyi pályaudvar\\working day departure times for 2 BACK.txt");
	    				}
					}
	    		}
	    		
	    		else if(stationName.equals("Anna-kút")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way==1) { 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    				}
	    				else {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Anna-kút\\working day departure times for 2 BACK.txt");
	    				}	
	    			}
	    			
	    			else if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way==1) {
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    					}
	    					else {
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Anna-kút\\working day departure times for 2 BACK.txt");
	    					}
	    				}
	    				
	    				else {
	    					if(way==1) {
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    					}
	    					else {
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Anna-kút\\working day departure times for 2 BACK.txt");
	    					}
	    				}
	    			}
	    			
	    			else if(lineNum==4) {
	    				
	    				if(way==1) {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Anna-kút\\working day departure times for 2 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Anna-kút\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
	    		
	    		else if(stationName.equals("Vértó")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way==1) { 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Vértó\\working day departure times for 2 FORTH.txt");
	    				}
	    				else {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Vértó\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Széchenyi-tér")) {
	    			
	    			if(lineNum==2) {
	    				
	    				if(way==1) { 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Széchenyi-tér\\working day departure times for 2 FORTH.txt");
	    				}
	    				else{ 
		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\2\\Széchenyi tér\\working day departure times for 2 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Dugonics-tér")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way==1) { 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Dugonics-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Dugonics-tér\\working day departure times for 3F BACK.txt");
	    	    			}	
	    				}
	    				
	    				else {
	    					if(way==1) { 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Dugonics-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Dugonics-tér\\working day departure times for 3F BACK.txt");
	    	    			}	
	    				}
	    			}
	    			
	    			else if(lineNum==4){
	    				
	    				if(way==1) {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Dugonics-tér\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Dugonics-tér\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}	
				
	    		else if(stationName.equals("Fonógyári út")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")){
	    					
	    					if(way==1) { 
	    			   			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Fonógyári út\\working day departure times for 3F FORTH.txt");
	    					}
	    					else { 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Fonógyári út\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    			}	
	    		}
				
	    		else if(stationName.equals("Kálvária-tér")) {
	    			
	    			if(lineNum==3) {
	    				
	    				if(lineLetter.equals("F")) {
	    					
	    					if(way==1) { 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Kálvária-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3F\\Kálvária-tér\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    				
	    				else {
	    					if(way==1) { 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Kálvária-tér\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Kálvária-tér\\working day departure times for 3F BACK.txt");
	    					}
	    				}
	    			}
	    		
	    		}
	    			
	    		else if(stationName.equals("Kecskés")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way==1) {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Kecskés\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Kecskés\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Tarján")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way==1) {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Tarján\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Tarján\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
				
	    		else if(stationName.equals("Vadaspark")) {
	    			
	    			if(lineNum==3) {
	    				
	    					if(way==1) { 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Vadaspark\\working day departure times for 3F FORTH.txt");
	    					}
	    					else{ 
	    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\3\\Vadaspark\\working day departure times for 3F BACK.txt");
	    					}
	    			}
	    		}
				
	    		else if(stationName.equals("Vitéz utca")) {
	    			
	    			if(lineNum==4) {
	    				
	    				if(way==1) {
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Vitéz utca\\working day departure times for 4 FORTH.txt");
	    				}
	    				else{ 
	    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\workingday\\4\\Vitéz utca\\working day departure times for 4 BACK.txt");
	    				}
	    			}
	    		}
		}
		
		else if(dt==DayType.NONWORKINGDAY){
	    	
			if(stationName.equals("Személyi pályaudvar")) {
				
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Személyi pályaudvar\\non_working day departure times for 2 FORTH.txt");
    				}	
    				else{
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Személyi pályaudvar\\non_working day departure times for 2 BACK.txt");
    				}
				}
    		}
    		
    		else if(stationName.equals("Anna-kút")) {
    			
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    				}	
    			}
    			
    			else if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way==1) {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    					}
    				}
    				
    				else {
    					if(way==1) {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    					}
    				}
    			}
    			
    			else if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Anna-kút\\non_working day departure times for 2 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Anna-kút\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
    		
    		else if(stationName.equals("Vértó")) {
    			
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Vértó\\non_working day departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Vértó\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Széchenyi-tér")) {
    			
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Széchenyi-tér\\non_working day departure times for 2 FORTH.txt");
    				}
    				else{ 
	    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\2\\Széchenyi tér\\non_working day departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Dugonics-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Dugonics-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Dugonics-tér\\non_working day departure times for 3F BACK.txt");
    	    			}	
    				}
    				
    				else {
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Dugonics-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Dugonics-tér\\non_working day departure times for 3F BACK.txt");
    	    			}	
    				}
    			}
    			
    			else if(lineNum==4){
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Dugonics-tér\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Dugonics-tér\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}	
			
    		else if(stationName.equals("Fonógyári út")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")){
    					
    					if(way==1) { 
    			   			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Fonógyári út\\non_working day departure times for 3F FORTH.txt");
    					}
    					else { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Fonógyári út\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    			}	
    		}
			
    		else if(stationName.equals("Kálvária-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Kálvária-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3F\\Kálvária-tér\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    				
    				else {
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Kálvária-tér\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Kálvária-tér\\non_working day departure times for 3F BACK.txt");
    					}
    				}
    			}
    		
    		}
    			
    		else if(stationName.equals("Kecskés")) {
    			
    			if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Kecskés\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Kecskés\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Tarján")) {
    			
    			if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Tarján\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Tarján\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Vadaspark")) {
    			
    			if(lineNum==3) {
    				
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Vadaspark\\non_working day departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\3\\Vadaspark\\non_working day departure times for 3F BACK.txt");
    					}
    			}
    		}
			
    		else if(stationName.equals("Vitéz utca")) {
    			
    			if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Vitéz utca\\non_working day departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\non_workingday\\4\\Vitéz utca\\non_working day departure times for 4 BACK.txt");
    				}
    			}
    		}
		}
		
	
		else if(dt==DayType.DAYOFF){
			
			if(stationName.equals("Személyi pályaudvar")) {
				
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Személyi pályaudvar\\dayoff departure times for 2 FORTH.txt");
    				}	
    				else{
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Személyi pályaudvar\\dayoff departure times for 2 BACK.txt");
    				}
				}
    		}
    		
    		else if(stationName.equals("Anna-kút")) {
    			
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    				}	
    			}
    			
    			else if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way==1) {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    					}
    				}
    				
    				else {
    					if(way==1) {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    					}
    					else {
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    					}
    				}
    			}
    			
    			else if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Anna-kút\\dayoff departure times for 2 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Anna-kút\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
    		
    		else if(stationName.equals("Vértó")) {
    			
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Vértó\\dayoff departure times for 2 FORTH.txt");
    				}
    				else {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Vértó\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Széchenyi-tér")) {
    			
    			if(lineNum==2) {
    				
    				if(way==1) { 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Széchenyi-tér\\dayoff departure times for 2 FORTH.txt");
    				}
    				else{ 
	    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\2\\Széchenyi tér\\dayoff departure times for 2 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Dugonics-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Dugonics-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Dugonics-tér\\dayoff departure times for 3F BACK.txt");
    	    			}	
    				}
    				
    				else {
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Dugonics-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    		    			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Dugonics-tér\\dayoff departure times for 3F BACK.txt");
    	    			}	
    				}
    			}
    			
    			else if(lineNum==4){
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Dugonics-tér\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Dugonics-tér\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}	
			
    		else if(stationName.equals("Fonógyári út")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")){
    					
    					if(way==1) { 
    			   			readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Fonógyári út\\dayoff departure times for 3F FORTH.txt");
    					}
    					else { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Fonógyári út\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    			}	
    		}
			
    		else if(stationName.equals("Kálvária-tér")) {
    			
    			if(lineNum==3) {
    				
    				if(lineLetter.equals("F")) {
    					
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Kálvária-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3F\\Kálvária-tér\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    				
    				else {
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Kálvária-tér\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Kálvária-tér\\dayoff departure times for 3F BACK.txt");
    					}
    				}
    			}
    		
    		}
    			
    		else if(stationName.equals("Kecskés")) {
    			
    			if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Kecskés\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Kecskés\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Tarján")) {
    			
    			if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Tarján\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Tarján\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}
			
    		else if(stationName.equals("Vadaspark")) {
    			
    			if(lineNum==3) {
    				
    					if(way==1) { 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Vadaspark\\dayoff departure times for 3F FORTH.txt");
    					}
    					else{ 
    						readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\3\\Vadaspark\\dayoff departure times for 3F BACK.txt");
    					}
    			}
    		}
			
    		else if(stationName.equals("Vitéz utca")) {
    			
    			if(lineNum==4) {
    				
    				if(way==1) {
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Vitéz utca\\dayoff departure times for 4 FORTH.txt");
    				}
    				else{ 
    					readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\departure times\\dayoff\\4\\Vitéz utca\\dayoff departure times for 4 BACK.txt");
    				}
    			}
    		}  
		}	
	}
}
