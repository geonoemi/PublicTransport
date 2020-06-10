import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Locale;
public class beolv {
	
	private String coordinateX;
	private String coordinateY;
	private String stationName;
	
	private boolean hasCable;
	static ArrayList<Station> stations2=new ArrayList<>();
	static ArrayList<String> stationNames=new ArrayList<>();
	static ArrayList<String> stationNames2=new ArrayList<>();
	static ArrayList<String> stationNames3F=new ArrayList<>();
	static ArrayList<String> stationNames4=new ArrayList<>();
	static ArrayList<String> stationNames70=new ArrayList<>();
	static ArrayList<String> stationNames71A=new ArrayList<>();
	static ArrayList<String> stationNames90H=new ArrayList<>();
	static ArrayList<String> stationNames8=new ArrayList<>();
	static ArrayList<String> stationNames10=new ArrayList<>();
	static ArrayList<String> stationNames19=new ArrayList<>();

	static ArrayList<String> x=new ArrayList<>();
	static ArrayList<String> y=new ArrayList<>();
	static ArrayList<Boolean> cables=new ArrayList<>();


	public beolv(String stationName,String coordinateX, String coordinateY,boolean hasCable) {
		
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.stationName = stationName;
		this.hasCable=hasCable;

	}

/*	public boolean hasCable() {
		return hasCable;
	}*/
	
//stations\\stations for trams\\stations for 2.txt
	public static void readInTrams(){

		try {

			FileReader reader2=new FileReader("stations\\stations for trams\\stations for 2.txt");
			BufferedReader buffer2=new BufferedReader(reader2);
			String line2=null;
						
			while((line2=buffer2.readLine())!=null) {
				
				String parts[] = line2.split(",");
				stationNames2.add(parts[0]);		
			}
	
			FileReader reader3F=new FileReader("stations\\stations for trams\\stations for 3F.txt");
			BufferedReader buffer3F=new BufferedReader(reader3F);
			String line3F=null;
			
			
			while((line3F=buffer3F.readLine())!=null) {
				
				String parts[] = line3F.split(",");
				stationNames3F.add(parts[0]);			
			}
			
			FileReader reader4=new FileReader("stations\\stations for trams\\stations for 4.txt");
			BufferedReader buffer4=new BufferedReader(reader4);
			String line4=null;
						
			while((line4=buffer4.readLine())!=null) {
					
				String parts[] = line4.split(",");				
				stationNames4.add(parts[0]);			
			}
	
		}catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}catch(IOException e) {
				System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
		}		
	}
	
	public static void readInBuses(){

		try {

			FileReader reader70=new FileReader("stations\\stations for buses\\stations for 70.txt");
			BufferedReader buffer70=new BufferedReader(reader70);
			String line70=null;
						
			while((line70=buffer70.readLine())!=null) {
				
				String parts[] = line70.split(",");
				stationNames70.add(parts[0]);		
			}
			
			FileReader reader71A=new FileReader("stations\\stations for buses\\stations for 71A.txt");
			BufferedReader buffer71A=new BufferedReader(reader71A);
			String line71A=null;
						
			while((line71A=buffer71A.readLine())!=null) {
				
				String parts[] = line71A.split(",");
				stationNames71A.add(parts[0]);		
			}
			

			FileReader reader90H=new FileReader("stations\\stations for buses\\stations for 90H.txt");
			BufferedReader buffer90H=new BufferedReader(reader90H);
			String line90H=null;
						
			while((line90H=buffer90H.readLine())!=null) {
				
				String parts[] = line90H.split(",");
				stationNames90H.add(parts[0]);		
			}
			
		}catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}catch(IOException e) {
				System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
		}		
	}
	public static void readInTrolleys(){

		try {

			FileReader reader8=new FileReader("stations\\stations for trolleys\\stations for 8.txt");
			BufferedReader buffer8=new BufferedReader(reader8);
			String line8=null;
						
			while((line8=buffer8.readLine())!=null) {
				
				String parts[] = line8.split(",");
				stationNames8.add(parts[0]);		
			}
			
			FileReader reader10=new FileReader("stations\\stations for trolleys\\stations for 10.txt");
			BufferedReader buffer10=new BufferedReader(reader10);
			String line10=null;
						
			while((line10=buffer10.readLine())!=null) {
				
				String parts[] = line10.split(",");
				stationNames10.add(parts[0]);		
			}
			

			FileReader reader19=new FileReader("stations\\stations for trolleys\\stations for 19.txt");
			BufferedReader buffer19=new BufferedReader(reader19);
			String line19=null;
						
			while((line19=buffer19.readLine())!=null) {
				
				String parts[] = line19.split(",");
				stationNames19.add(parts[0]);		
			}
			
		}catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}catch(IOException e) {
				System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
		}		
	}
		
	

	
	public String toString() {
		return stationName+" "+x+" "+y+" "+hasCable;
	}
	
	public static void main(String[]args) {
		//readIn("stations\\stations for trams\\stations for 2.txt");
		readInTrams();
		readInBuses();
		readInTrolleys();
	}
	/*public static void printStations4(ArrayList<String> stationNames4) { //used in Route.getARoute()
	
	stationNames4.clear(); //tüneti kezelés...
	readIn4("stations\\stations for trams\\stations for 4.txt");

	for (String stations:stationNames4) {
		System.out.println(stations);
	}
}*/

/*	public static void canRunAlongHere(boolean hasPantograph) {

	if (hasPantograph) {
			System.out.println("This vehicle can run along here.");
		//return true;
		}else {
			System.out.println("This vehicle cannot run along here");
		}			
}*/
	
}