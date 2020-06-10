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
public class Station {
	private String coordinateX;
	private String coordinateY;
	private String stationName;
	private boolean hasCable;
	static ArrayList<Station> stations=new ArrayList<>();
	static ArrayList<String> stationNames=new ArrayList<>();
	static ArrayList<String> stationNames2=new ArrayList<>();
	static ArrayList<String> stationNames3F=new ArrayList<>();
	static ArrayList<String> stationNames4=new ArrayList<>();

	static ArrayList<String> x=new ArrayList<>();
	static ArrayList<String> y=new ArrayList<>();
	static ArrayList<Boolean> cables=new ArrayList<>();


	public Station(String stationName,String coordinateX, String coordinateY,boolean hasCable) {
		
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.stationName = stationName;
		this.hasCable=hasCable;

	}

	public boolean hasCable() {
		return hasCable;
	}

	public static void readIn(String fileName){

		try {

			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
				String parts[] = line.split(",");
				
				stationNames.add(parts[0]);
				x.add(parts[1]);
				y.add(parts[2]);
				
				cables.add(Boolean.parseBoolean(parts[3]));
				Station station=new Station(stationNames.get(i), x.get(i), y.get(i), cables.get(i));
				stations.add(station);
				
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
	
	public static void printStations(ArrayList<String> stationNames) { //used in Route.getARoute()
		
		stationNames.clear(); //tüneti kezelés...
		readIn("classes files\\stations.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,stationNames);
		
		for (String stations:stationNames) {
			System.out.println(stations);
		}
	}
	
	public static void sortStationNames(Collator collator, ArrayList <String> stationNames) { //used in Station.printStations(ArrayList<String> stationNames)
		
	    String tmp;
	    
	    for (int i = 0; i < stationNames.size(); i++) {
	    	
	        for (int j = i + 1; j < stationNames.size(); j++) { 
	        	
	            if (collator.compare(stationNames.get(i), stationNames.get(j)) > 0) {
	            	
		              tmp = stationNames.get(i);
		              stationNames.set(i,stationNames.get(j));
		              stationNames.set(j,tmp);
	            }
	        }
	    }
	}			// TODO: Separation of concern: presentation and business logic should separate	
	
	public static void canRunAlongHere(boolean hasPantograph) {

		if (hasPantograph) {
				System.out.println("This vehicle can run along here.");
			//return true;
			}else {
				System.out.println("This vehicle cannot run along here");
			}			
	}
	
	public String toString() {
		return stationName+" "+x+" "+y+" "+hasCable;
	}
}