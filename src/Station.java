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
	private String x;
	private String y;
	private String stationName;
	boolean hasCable;
	boolean hasPantograph;
	private static ArrayList<Station> stations=new ArrayList<>();
	static ArrayList<String> stationNames=new ArrayList<>();
	
	public Station(String stationName,String x, String y,boolean hasCable) {
		
		this.x = x;
		this.y = y;
		this.stationName = stationName;
		this.hasCable=hasCable;
		//this.hasPantograph= hasPantograph;
	}
	public static void readIn(String fileName){ 
		try {
			
			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
				String parts[] = line.split(",");
				
				String[] stationName=new String[line.length()];
				stationName[i]=parts[0];
				stationNames.add(stationName[i]);
				
				String x[]=new String[line.length()];
				String y[]=new String[line.length()];
				boolean hasCable[]=new boolean[line.length()];
				
				x[i]=parts[1];
				y[i]=parts[2];
				hasCable[i]=Boolean.parseBoolean(parts[3]);
				
				Station station=new Station(stationName[i],x[i],y[i],hasCable[i]);
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
	public static void sortStationNames(Collator collator, ArrayList <String> stationNames) {
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
	    for(int i=0;i<stationNames.size();i++) {
			System.out.println(stationNames.get(i));
		}	
	}

	public String toString() {
		return stationName+" "+x+" "+y+" "+hasCable;
	}
	
	public static boolean canRunAlongHere(boolean hasPantograph) {
		if (hasPantograph) {
			System.out.println("This vehicle can run along here.");
			return true;
		}else {
			System.out.println("This vehicle cannot run along here");
			return false;
		}
	}
	
	public static void main(String[] args) {

		readIn("C:\\Users\\geono\\eclipse-workspace\\Tomegkozlekedes\\classes files\\stations.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,stationNames);
		
	//	canRunAlongHere(false);
	}
}



