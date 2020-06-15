import java.io.*;
import java.text.Collator;
import java.util.*;
public class Station {
	
	private String coordinateX;
	private String coordinateY;
	private String stationName;
	private boolean hasCable;
	
	private static ArrayList<Station> stations=new ArrayList<>();
	private static ArrayList<String> stationNames=new ArrayList<>();
	private static ArrayList<String> stationNames2=new ArrayList<>();
	private static ArrayList<String> stationNames3F=new ArrayList<>();
	private static ArrayList<String> stationNames4=new ArrayList<>();
	private static ArrayList<String> stationNames70=new ArrayList<>();
	private static ArrayList<String> stationNames71A=new ArrayList<>();
	private static ArrayList<String> stationNames90H=new ArrayList<>();
	private static ArrayList<String> stationNames8=new ArrayList<>();
	private static ArrayList<String> stationNames10=new ArrayList<>();
	private static ArrayList<String> stationNames19=new ArrayList<>();
	
	private static ArrayList<String> x=new ArrayList<>();
	private static ArrayList<String> y=new ArrayList<>();
	private static ArrayList<Boolean> cables=new ArrayList<>();
	
	
	public String getCoordinateX() {
		return coordinateX;
	}

	public String getCoordinateY() {
		return coordinateY;
	}

	public String getStationName() {
		return stationName;
	}

	public boolean isHasCable() {
		return hasCable;
	}

	public static ArrayList<Station> getStations() {
		return stations;
	}

	public static ArrayList<String> getStationNames() {
		return stationNames;
	}

	public static ArrayList<String> getStationNames2() {
		return stationNames2;
	}

	public static ArrayList<String> getStationNames3F() {
		return stationNames3F;
	}

	public static ArrayList<String> getStationNames4() {
		return stationNames4;
	}

	public static ArrayList<String> getStationNames70() {
		return stationNames70;
	}

	public static ArrayList<String> getStationNames71A() {
		return stationNames71A;
	}

	public static ArrayList<String> getStationNames90H() {
		return stationNames90H;
	}

	public static ArrayList<String> getStationNames8() {
		return stationNames8;
	}

	public static ArrayList<String> getStationNames10() {
		return stationNames10;
	}

	public static ArrayList<String> getStationNames19() {
		return stationNames19;
	}

	public static ArrayList<String> getX() {
		return x;
	}

	public static ArrayList<String> getY() {
		return y;
	}

	public static ArrayList<Boolean> getCables() {
		return cables;
	}

	public Station(String stationName,String coordinateX, String coordinateY,boolean hasCable) {
		
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.stationName = stationName;
		this.hasCable=hasCable;

	}

	public static void readIn(){
		
		try {
			
			FileReader reader=new FileReader("txt files of classes\\stations.txt");
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {

				String parts[] = line.split(",");
				stationNames.add(parts[0]);
				
				x.add(parts[1]);
				y.add(parts[2]);
				cables.add(Boolean.parseBoolean(parts[3]));
				
				Station station=new Station(stationNames.get(i),x.get(i),y.get(i),cables.get(i));
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
	
	public static void readInBuses(){	//used in Station.printStations , FileWriting.fileWriting() , Route.getARoute()

		try {

			FileReader reader70=new FileReader("stations\\stations for buses\\stations for 70.txt");
			BufferedReader buffer70=new BufferedReader(reader70);
			String line70=null;
						
			while((line70=buffer70.readLine())!=null) {
				
				String parts[] = line70.split(",");
				stationNames70.add(parts[0]);		
			}
			buffer70.close();

			FileReader reader71A=new FileReader("stations\\stations for buses\\stations for 71A.txt");
			BufferedReader buffer71A=new BufferedReader(reader71A);
			String line71A=null;
						
			while((line71A=buffer71A.readLine())!=null) {
				
				String parts[] = line71A.split(",");
				stationNames71A.add(parts[0]);		
			}
			buffer71A.close();

			FileReader reader90H=new FileReader("stations\\stations for buses\\stations for 90H.txt");
			BufferedReader buffer90H=new BufferedReader(reader90H);
			String line90H=null;
						
			while((line90H=buffer90H.readLine())!=null) {
				
				String parts[] = line90H.split(",");
				stationNames90H.add(parts[0]);		
			}
			buffer90H.close();
			
		}catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}catch(IOException e) {
				System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
		}	
		
	}	
	
	public static void readInTrams(){	//used in Station.printStations , FileWriting.fileWriting() , Route.getARoute()

		try {

			FileReader reader2=new FileReader("stations\\stations for trams\\stations for 2.txt");
			BufferedReader buffer2=new BufferedReader(reader2);
			String line2=null;
						
			while((line2=buffer2.readLine())!=null) {
				
				String parts[] = line2.split(",");
				stationNames2.add(parts[0]);		
			}
			buffer2.close();

			FileReader reader3F=new FileReader("stations\\stations for trams\\stations for 3F.txt");
			BufferedReader buffer3F=new BufferedReader(reader3F);
			String line3F=null;
			
			
			while((line3F=buffer3F.readLine())!=null) {
				
				String parts[] = line3F.split(",");
				stationNames3F.add(parts[0]);			
			}
			buffer3F.close();

			FileReader reader4=new FileReader("stations\\stations for trams\\stations for 4.txt");
			BufferedReader buffer4=new BufferedReader(reader4);
			String line4=null;
						
			while((line4=buffer4.readLine())!=null) {
					
				String parts[] = line4.split(",");				
				stationNames4.add(parts[0]);			
			}
			buffer4.close();
			
		}catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}catch(IOException e) {
				System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
		}		
	}
	
	
	public static void readInTrolleys(){	//used in Station.printStations , FileWriting.fileWriting() , Route.getARoute()

		try {

			FileReader reader8=new FileReader("stations\\stations for trolleys\\stations for 8.txt");
			BufferedReader buffer8=new BufferedReader(reader8);
			String line8=null;
						
			while((line8=buffer8.readLine())!=null) {
				
				String parts[] = line8.split(",");
				stationNames8.add(parts[0]);		
			}
			buffer8.close();
			
			FileReader reader10=new FileReader("stations\\stations for trolleys\\stations for 10.txt");
			BufferedReader buffer10=new BufferedReader(reader10);
			String line10=null;
						
			while((line10=buffer10.readLine())!=null) {
				
				String parts[] = line10.split(",");
				stationNames10.add(parts[0]);		
			}
			buffer10.close();

			FileReader reader19=new FileReader("stations\\stations for trolleys\\stations for 19.txt");
			BufferedReader buffer19=new BufferedReader(reader19);
			String line19=null;
						
			while((line19=buffer19.readLine())!=null) {
				
				String parts[] = line19.split(",");
				stationNames19.add(parts[0]);		
			}
			buffer19.close();
			
		}catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}catch(IOException e) {
				System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
				System.out.println("Not appropriate input type.");
		}		
	}
	
	public static void sortStationNames(Collator collator, ArrayList <String> stationName) { //used in Station.printStations(ArrayList<String> stationNames)
		
	    String tmp;
	    
	    for (int i = 0; i < stationName.size(); i++) {
	    	
	        for (int j = i + 1; j < stationName.size(); j++) { 
	        	
	            if (collator.compare(stationName.get(i), stationName.get(j)) > 0) {
	            	
		              tmp = stationName.get(i);
		              stationName.set(i,stationName.get(j));
		              stationName.set(j,tmp);
	            }
	        }
	    }
	}
	
	
	public static void printStations(ArrayList<String> stationNames) { //used in Route.getARoute()

		stationNames.clear(); //tüneti kezelés...
		readInBuses();
		readInTrams();
		readInTrolleys();	
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,stationNames);
		
		for (String stations:stationNames) {
			System.out.println(stations);
		}
	}
}