import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
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
	static ArrayList<String> stationNames70=new ArrayList<>();
	static ArrayList<String> stationNames71A=new ArrayList<>();
	static ArrayList<String> stationNames90H=new ArrayList<>();
	static ArrayList<String> stationNames8=new ArrayList<>();
	static ArrayList<String> stationNames10=new ArrayList<>();
	static ArrayList<String> stationNames19=new ArrayList<>();

	ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
    ArrayList<String> inner = new ArrayList<String>();       
	
	static ArrayList<String> x=new ArrayList<>();
	static ArrayList<String> y=new ArrayList<>();
	static ArrayList<Boolean> cables=new ArrayList<>();


	public Station(String stationName,String coordinateX, String coordinateY,boolean hasCable) {
		
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.stationName = stationName;
		this.hasCable=hasCable;

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

			

	public static void readInTrams(){

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
	
	public static void readInBuses(){

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
	//70 buszra
		public static void printStations70(ArrayList<String> stationNames70) { //used in Route.getARoute()

			stationNames70.clear(); //tüneti kezelés...
			readInBuses();
			//readIn("stations\\stations for buses\\stations for 70.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames70(hu,stationNames70);
			
			for (String stations:stationNames70) {
				System.out.println(stations);
			}
		}
		
		public static void sortStationNames70(Collator collator, ArrayList <String> stationNames70) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames70.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames70.size(); j++) { 
		        	
		            if (collator.compare(stationNames70.get(i), stationNames70.get(j)) > 0) {
		            	
			              tmp = stationNames70.get(i);
			              stationNames70.set(i,stationNames70.get(j));
			              stationNames70.set(j,tmp);
		            }
		        }
		    }
		}	
		
	//71A buszra
		public static void printStations71A(ArrayList<String> stationNames71A) { //used in Route.getARoute()

			stationNames71A.clear(); //tüneti kezelés...
			readInBuses();
			//readIn("stations\\stations for buses\\stations for 71A.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames71A(hu,stationNames71A);
			
			for (String stations:stationNames71A) {
				System.out.println(stations);
			}
		}
		
		public static void sortStationNames71A(Collator collator, ArrayList <String> stationNames71A) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames71A.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames71A.size(); j++) { 
		        	
		            if (collator.compare(stationNames71A.get(i), stationNames71A.get(j)) > 0) {
		            	
			              tmp = stationNames71A.get(i);
			              stationNames71A.set(i,stationNames71A.get(j));
			              stationNames71A.set(j,tmp);
		            }
		        }
		    }
		}	
	
		//90H buszra
		public static void printStations90H(ArrayList<String> stationNames90H) { //used in Route.getARoute()

			stationNames90H.clear(); //tüneti kezelés...
			readInBuses();
			//readIn("stations\\stations for buses\\stations for 90H.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames90H(hu,stationNames90H);
			
			for (String stations:stationNames90H) {
				System.out.println(stations);
			}
		}
		
		public static void sortStationNames90H(Collator collator, ArrayList <String> stationNames90H) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames90H.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames90H.size(); j++) { 
		        	
		            if (collator.compare(stationNames90H.get(i), stationNames90H.get(j)) > 0) {
		            	
			              tmp = stationNames90H.get(i);
			              stationNames90H.set(i,stationNames90H.get(j));
			              stationNames90H.set(j,tmp);
		            }
		        }
		    }
		}
	
	//2-ES VILLI
		public static void printStations2(ArrayList<String> stationNames2) { //used in Route.getARoute()

			stationNames2.clear(); //tüneti kezelés...
			readInTrams();
			//readIn("stations\\stations for buses\\stations for 2.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames2(hu,stationNames2);
			
			for (String stations:stationNames2) {
				System.out.println(stations);
			}
		}
		
		public static void sortStationNames2(Collator collator, ArrayList <String> stationNames2) { //used in Station.printStations(ArrayList<String> stationNames)
			
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
		}
		
		
	public static void main(String[] args) {
		//readIn("stations\\stations for buses\\stations for 70.txt");
		printStations71A(stationNames71A);
		for (String stations:stationNames71A) {
		//	System.out.println(stations);
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
			buffer8.close();
			buffer10.close();
			buffer19.close();
			
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
}
/*  ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> inner = new ArrayList<Integer>();        

inner.add(100);     
inner.add(200);
outer.add(inner); // add first list
inner = new ArrayList<Integer>(inner); // create a new inner list that has the same content as  
                                       // the original inner list
outer.add(inner); // add second list

outer.get(0).add(300); // changes only the first inner list

System.out.println(outer);
 * 
 * 
 * 
 * List<List<Integer>> outer = new ArrayList<List<Integer>>();
List<Integer> inner1 = new ArrayList<Integer>();
List<Integer> inner2 = new ArrayList<Integer>();

inner1.add(100);
inner1.add(200);

inner2.add(100);
inner2.add(200);

outer.add(inner1);
outer.add(inner2);

outer.get(0).add(300);

System.out.println(outer);
 *        
 *        
 *        
 *        ArrayList<ArrayList<Integer> > aList =  
              new ArrayList<ArrayList<Integer> >(n); 

    // Create n lists one by one and append to the  
    // master list (ArrayList of ArrayList) 
    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
    a1.add(1); 
    a1.add(2); 
    aList.add(a1); 

    ArrayList<Integer> a2 = new ArrayList<Integer>(); 
    a2.add(5); 
    aList.add(a2); 

    ArrayList<Integer> a3 = new ArrayList<Integer>(); 
    a3.add(10); 
    a3.add(20); 
    a3.add(30); 
    aList.add(a3); 

    for (int i = 0; i < aList.size(); i++) { 
        for (int j = 0; j < aList.get(i).size(); j++) { 
            System.out.print(aList.get(i).get(j) + " "); 
        } 
        System.out.println(); 
    } 
} 
} */