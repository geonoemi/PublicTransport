import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class DayTypes {
	
	public static String working_day;
	public static String non_working_day;
	public static String day_off;
	public static String working_days_during_school_year;
	public static String summer_break_working_days;
	public static String on_public_holidays;
	public static String during_school_holidays;
	public static String daily_except_holiday;
	public static String daily_except_on_public_holidays;
	//fájlból?
	
	public static ArrayList<String>dayTypes=new ArrayList<>();
	
	public static void readIn(String fileName){ 
		
		try {
			
			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
					
				dayTypes.add(line.toString().replaceAll("(?<=[A-Z])\\_", " ").toLowerCase());
			
				i++;
			}
			
			buffer.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
			System.out.println("Not appropriate input type.");
		}		
	}
	
	public static void printdayTypes() { //used in Route.getARoute()
		
		dayTypes.clear();//tüneti kezelés
		readIn("classes files\\day types.txt");
		
		for (String daytypes: dayTypes) {
			System.out.printf( "\t%s\n",daytypes);
		}
	}
}
