import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Station {
	private String x;
	private String y;
	private String stationName;
	private boolean hasPantograph;
	private static ArrayList<Station> stations=new ArrayList<>();
	
	public Station(String stationName,String x, String y,boolean hasPantograph) {
		
		this.x = x;
		this.y = y;
		this.stationName = stationName;
		this.hasPantograph= hasPantograph;
	}
	public static void readIn(String fileName){ 
		try {
			
			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String queue=null;
			int i=0;
			
			while((queue=buffer.readLine())!=null) {
				
				String parts[] = queue.split(",");
				String stationName[]=new String[queue.length()];
				String x[]=new String[queue.length()];
				String y[]=new String[queue.length()];
				boolean hasPantograph[]=new boolean[queue.length()];
				
				stationName[i]=parts[0];
				x[i]=parts[1];
				y[i]=parts[2];
				hasPantograph[i]=Boolean.parseBoolean(parts[3]);
				
				Station station=new Station(stationName[i],x[i],y[i],hasPantograph[i]);
				stations.add(station);
				
				i++;
			}
			buffer.close();
			for(Station s: stations) {
				System.out.println("stations: "+" "+s.toString());
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}		
	}
	public String toString() {
		return stationName+" "+x+" "+y+" "+hasPantograph;
	}
	public static void main(String[] args) {
		
		readIn("allomasok.txt");
		
		
	}
}



