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
	public static void readIn(){

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
	
	public String toString() {
		return stationName+" "+x+" "+y+" "+hasCable;
	}
	
	public static void main(String[]args) {
		//readIn("stations\\stations for trams\\stations for 2.txt");
		readIn();
	}
	
}