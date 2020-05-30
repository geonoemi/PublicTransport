
public class Route {
//járat

	private String departureTime;
		
		public Route(String departureTime) {
			
			this.departureTime=departureTime;
		}
		public static DayType dayTypes;
		//if vonalszam[i]==valami && vonalBetu.equals("valami") && dayTypes

		public static void main(String[] args) {
			
			for (DayType dt : DayType.values()) {
			    System.out.println("ENUM: "+ dt);
			    if(	dt==DayType.WORKINGDAY) {
			    	System.out.println("It's a working day! ");
			    }else if(dt==DayType.NONWORKINGDAY) {
			    	System.out.println("It's a non-working day! ");
			    }else if(dt==DayType.DAYOFF) {
			    	System.out.println("It's a DAYOFF! ");
			    }else if(dt==DayType.WORKINGDAYSDURINGSCHOOLYEAR) {
			    	System.out.println("It's a WORKING DAY DURING SCHOOL YEAR! ");
			    }else if(dt==DayType.SUMMERBREAKWORKINGDAYS) {
			    	System.out.println("It's a SUMMER BREAK WORKING DAY! ");
			    }else if(dt==DayType.ONPUBLICHOLIDAYS) {
			    	System.out.println("It's an ONPUBLICHOLIDAY! ");
			    }else if(dt==DayType.DURINGSCHOOLHOLIDAYS) {
			    	System.out.println("It's an DURINGSCHOOLHOLIDAYS! ");
			    }else if(dt==DayType.DAILYEXCEPTHOLIDAY) {
			    	System.out.println("It's an DAILYEXCEPTHOLIDAY! ");
			    }else if(dt==DayType.DAILYEXCEPTONPUBLICHOLIDAYS) {
			    	System.out.println("It's an DAILYEXCEPTONPUBLICHOLIDAYS! ");
			    }               
			}
		}
	}

