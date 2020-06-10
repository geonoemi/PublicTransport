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
	public static void readIn2(String fileName){

		try {

			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
				String parts[] = line.split(",");
				
				stationNames2.add(parts[0]);
				x.add(parts[1]);
				y.add(parts[2]);
				
				cables.add(Boolean.parseBoolean(parts[3]));
				Station station=new Station(stationNames2.get(i), x.get(i), y.get(i), cables.get(i));
				stations2.add(station);
				
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
	
	
	public static void printStations2(ArrayList<String> stationNames2) { //used in Route.getARoute()
		
		stationNames2.clear(); //tüneti kezelés...
		readIn2("stations\\stations for trams\\stations for 2.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,stationNames2);
		
		for (String stations:stationNames2) {
			System.out.println(stations);
		}
	}
	
	public static void sortStationNames(Collator collator, ArrayList <String> stationNames2) { //used in Station.printStations(ArrayList<String> stationNames2)
		
	    String tmp;
	    
	    for (int i = 0; i < stationNames2.size(); i++) {
	    	
	        for (int j = i + 1; j < stationNames2.size(); j++) { 
	        	
	            if (collator.compare(stationNames2.get(i), stationNames2.get(j)) > 0) {
	            	
		              tmp = stationNames2.get(i);
		              stationNames2.set(i,stationNames2.get(j));
		              stationNames2.set(j,tmp);
	            }
	        }
	    }
	}			// TODO: Separation of concern: presentation and business logic should separate	
	
	public static void readIn3F(String fileName){

		try {

			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
				String parts[] = line.split(",");
				
				stationNames3F.add(parts[0]);
				x.add(parts[1]);
				y.add(parts[2]);
				
				cables.add(Boolean.parseBoolean(parts[3]));
			//	Station station=new Station(stationNames3F.get(i), x.get(i), y.get(i), cables.get(i));
				//stations3F.add(station);
				
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
	

	public static void printStations3F(ArrayList<String> stationNames3F) { //used in Route.getARoute()
		
		stationNames3F.clear(); //tüneti kezelés...
		readIn3F("stations\\stations for trams\\stations for 3F.txt");
	
		for (String stations:stationNames3F) {
			System.out.println(stations);
		}
	}
	
	public static void readIn4(String fileName){

		try {

			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
				String parts[] = line.split(",");
				
				stationNames4.add(parts[0]);
				x.add(parts[1]);
				y.add(parts[2]);
				
				cables.add(Boolean.parseBoolean(parts[3]));
			//	Station station=new Station(stationNames4.get(i), x.get(i), y.get(i), cables.get(i));
				//stations4.add(station);
				
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
	

	public static void printStations4(ArrayList<String> stationNames4) { //used in Route.getARoute()
		
		stationNames4.clear(); //tüneti kezelés...
		readIn4("stations\\stations for trams\\stations for 4.txt");
	
		for (String stations:stationNames4) {
			System.out.println(stations);
		}
	}
	
/*	public static void canRunAlongHere(boolean hasPantograph) {

		if (hasPantograph) {
				System.out.println("This vehicle can run along here.");
			//return true;
			}else {
				System.out.println("This vehicle cannot run along here");
			}			
	}*/
	
	public String toString() {
		return stationName+" "+x+" "+y+" "+hasCable;
	}
	
	public static void main(String[]args) {
		//readIn("stations\\stations for trams\\stations for 2.txt");
		printStations2(stationNames2);
	}
	
}