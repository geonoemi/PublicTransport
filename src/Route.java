
public class Route extends Vehicle{
//j�rat

	private String departureTime;
		
		public Route(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
						double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
						boolean needToRepair, String typeOfFuel, boolean hasWheel) {
				super(lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
						numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
				this.departureTime=departureTime;
	}

		
		public static DayType dayTypes;
		//if vonalszam[i]==valami && vonalBetu.equals("valami") && dayTypes
	//ide kell egy f�jlbeolvas� az indul�si id�kr�l
		
		
		
		public static void main(String[] args) {
			
			for (DayType dt : DayType.values()) {
			  //  System.out.println("ENUM: "+ dt);
			    if(	dt==DayType.WORKINGDAY){
			    	System.out.println("It's a working day! ");
			    	//olvassa be a munkanapos indul�si id�ket tartalmaz� file-t
			    	for(Vehicle v:vehicles) {
			    		if(v.lineNum==2 && v.way.contentEquals("ODA")) { //mindenvonal mindk�t ir�ny�ra
			    			//olvassa be a 2-es oda j�rat indul�si id�ket tartalmaz� filet
			    			//this.departureTime=munkanap sorainak �rt�kei t�mbbe
						 }
			    	}
			    }else if(dt==DayType.NONWORKINGDAY) { System.out.println("It's a non-working day! ");
			    }else if(dt==DayType.DAYOFF) { System.out.println("It's a DAYOFF! ");
			    }else if(dt==DayType.WORKINGDAYSDURINGSCHOOLYEAR) {	System.out.println("It's a WORKING DAY DURING SCHOOL YEAR! ");
			    }else if(dt==DayType.SUMMERBREAKWORKINGDAYS) {System.out.println("It's a SUMMER BREAK WORKING DAY! ");
			    }else if(dt==DayType.ONPUBLICHOLIDAYS) { System.out.println("It's an ONPUBLICHOLIDAY! ");
			    }else if(dt==DayType.DURINGSCHOOLHOLIDAYS) { System.out.println("It's a DURINGSCHOOLHOLIDAYS! ");
			    }else if(dt==DayType.DAILYEXCEPTHOLIDAY) { System.out.println("It's a DAILYEXCEPTHOLIDAY! ");
			    }else if(dt==DayType.DAILYEXCEPTONPUBLICHOLIDAYS) {	System.out.println("It's a DAILYEXCEPTONPUBLICHOLIDAYS! ");
			    }               
			}
		
		}
	}

