import java.io.*;
import java.text.Collator;
import java.util.*;
public class beolv {
	
	private String coordinateX;
	private String coordinateY;
	private String stationName;
	private boolean hasCable;
	
/*	static ArrayList<Station> stations=new ArrayList<>();
	static ArrayList<String> stationNames=new ArrayList<>();*/
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

	public static void readInBuses(){	//used in printBusStations , FileWriting.fileWriting() , Route.getARoute()

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
	
	public static void readInTrams(){	//used in printTramStations , FileWriting.fileWriting() , Route.getARoute()

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
	
	
	public static void readInTrolleys(){	//used in printTramStations , FileWriting.fileWriting() , Route.getARoute()

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
	
	public static void sortStationNames(Collator collator, ArrayList <String> stationName) { //used in Station.print*Stations(ArrayList<String> stationNames)
		
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
		//readIn("stations\\stations for buses\\stations for 70.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,stationNames);
		
		for (String stations:stationNames) {
			System.out.println(stations);
		}
	}
	
/*	public static void printBusStations(ArrayList<String> busStationNames) { //used in Route.getARoute()

		busStationNames.clear(); //tüneti kezelés...
		readInBuses();
		//readIn("stations\\stations for buses\\stations for 70.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,busStationNames);
		
		for (String stations:busStationNames) {
			System.out.println(stations);
		}
	}
	
	public static void printTramStations(ArrayList<String> tramStationNames) { //used in Route.getARoute()

		tramStationNames.clear(); //tüneti kezelés...
		readInTrams();
		//readIn("stations\\stations for buses\\stations for 70.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,tramStationNames);
		
		for (String stations:tramStationNames) {
			System.out.println(stations);
		}
	}
	
	public static void printTrolleyStations(ArrayList<String> trolleyStationNames) { //used in Route.getARoute()

		trolleyStationNames.clear(); //tüneti kezelés...
		readInTrolleys();
		//readIn("stations\\stations for buses\\stations for 70.txt");
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,trolleyStationNames);
		
		for (String stations:trolleyStationNames) {
			System.out.println(stations);
		}
	}*/
	
	public static void main(String[] args) {
		printStations(stationNames19);
	}
	/*	public static void readIn(String stationsFile){
	
	try {
		
		FileReader reader=new FileReader("classes files\\stations.txt");
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
}*/
	
	/*	public static void printStations70(ArrayList<String> stationNames70) { //used in Route.getARoute()

			stationNames70.clear(); //tüneti kezelés...
			readInBuses();
			//readIn("stations\\stations for buses\\stations for 70.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames70);
			
			for (String stations:stationNames70) {
				System.out.println(stations);
			}
		}
	*/	

	/*	public static void printStations71A(ArrayList<String> stationNames71A) { //used in Route.getARoute()

			stationNames71A.clear(); //tüneti kezelés...
			readInBuses();
			//readIn("stations\\stations for buses\\stations for 71A.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames71A);
			
			for (String stations:stationNames71A) {
				System.out.println(stations);
			}
		}*/
		
/*		public static void sortStationNames71A(Collator collator, ArrayList <String> stationNames71A) { //used in Station.printStations(ArrayList<String> stationNames)
			
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
		}	*/
	
		//90H buszra
	/*	public static void printStations90H(ArrayList<String> stationNames90H) { //used in Route.getARoute()

			stationNames90H.clear(); //tüneti kezelés...
			readInBuses();
			//readIn("stations\\stations for buses\\stations for 90H.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames90H);
			
			for (String stations:stationNames90H) {
				System.out.println(stations);
			}
		}*/
		
	/*	public static void sortStationNames90H(Collator collator, ArrayList <String> stationNames90H) { //used in Station.printStations(ArrayList<String> stationNames)
			
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
		}*/
	
	//2-ES VILLI
/*		public static void printStations2(ArrayList<String> stationNames2) { //used in Route.getARoute()

			stationNames2.clear(); //tüneti kezelés...
			readInTrams();
			//readIn("stations\\stations for buses\\stations for 2.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames2);
			
			for (String stations:stationNames2) {
				System.out.println(stations);
			}
		}*/
		
/*		public static void sortStationNames2(Collator collator, ArrayList <String> stationNames2) { //used in Station.printStations(ArrayList<String> stationNames)
			
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
		}*/
		
	//3f villi
	/*	public static void printStations3F(ArrayList<String> stationNames3F) { //used in Route.getARoute()

			stationNames3F.clear(); //tüneti kezelés...
			readInTrams();
			//readIn("stations\\stations for buses\\stations for 3F.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames3F);
			
			for (String stations:stationNames3F) {
				System.out.println(stations);
			}
		}*/
		
	/*	public static void sortStationNames3F(Collator collator, ArrayList <String> stationNames3F) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames3F.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames3F.size(); j++) { 
		        	
		            if (collator.compare(stationNames3F.get(i), stationNames3F.get(j)) > 0) {
		            	
			              tmp = stationNames3F.get(i);
			              stationNames3F.set(i,stationNames3F.get(j));
			              stationNames3F.set(j,tmp);
		            }
		        }
		    }
		}*/
		
	//4-ES VILLI
	/*	public static void printStations4(ArrayList<String> stationNames4) { //used in Route.getARoute()

			stationNames4.clear(); //tüneti kezelés...
			readInTrams();
			//readIn("stations\\stations for buses\\stations for 4.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames4);
			
			for (String stations:stationNames4) {
				System.out.println(stations);
			}
		}*/
		
	/*	public static void sortStationNames4(Collator collator, ArrayList <String> stationNames4) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames4.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames4.size(); j++) { 
		        	
		            if (collator.compare(stationNames4.get(i), stationNames4.get(j)) > 0) {
		            	
			              tmp = stationNames4.get(i);
			              stationNames4.set(i,stationNames4.get(j));
			              stationNames4.set(j,tmp);
		            }
		        }
		    }
		}*/
		
		
		
	//8-AS TROLI
		public static void printStations8(ArrayList<String> stationNames8) { //used in Route.getARoute()

			stationNames8.clear(); //tüneti kezelés...
			readInTrolleys();
			//readIn("stations\\stations for buses\\stations for 8.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames8);
			
			for (String stations:stationNames8) {
				System.out.println(stations);
			}
		}
		
	/*	public static void sortStationNames8(Collator collator, ArrayList <String> stationNames8) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames8.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames8.size(); j++) { 
		        	
		            if (collator.compare(stationNames8.get(i), stationNames8.get(j)) > 0) {
		            	
			              tmp = stationNames8.get(i);
			              stationNames8.set(i,stationNames8.get(j));
			              stationNames8.set(j,tmp);
		            }
		        }
		    }
		}*/
		
	/*	public static void printStations10(ArrayList<String> stationNames10) { //used in Route.getARoute()

			stationNames10.clear(); //tüneti kezelés...
			readInTrolleys();
			//readIn("stations\\stations for buses\\stations for 10.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames10);
			
			for (String stations:stationNames10) {
				System.out.println(stations);
			}
		}
	*/	
	/*	public static void sortStationNames10(Collator collator, ArrayList <String> stationNames10) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames10.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames10.size(); j++) { 
		        	
		            if (collator.compare(stationNames10.get(i), stationNames10.get(j)) > 0) {
		            	
			              tmp = stationNames10.get(i);
			              stationNames10.set(i,stationNames10.get(j));
			              stationNames10.set(j,tmp);
		            }
		        }
		    }
		}*/
		
	/*	public static void printStations19(ArrayList<String> stationNames19) { //used in Route.getARoute()

			stationNames19.clear(); //tüneti kezelés...
			readInTrolleys();
			//readIn("stations\\stations for buses\\stations for 19.txt");
			Collator hu = Collator.getInstance(new Locale("hu","HU"));
			sortStationNames(hu,stationNames19);
			
			for (String stations:stationNames19) {
				System.out.println(stations);
			}
		}*/
		
	/*	public static void sortStationNames19(Collator collator, ArrayList <String> stationNames19) { //used in Station.printStations(ArrayList<String> stationNames)
			
		    String tmp;
		    
		    for (int i = 0; i < stationNames19.size(); i++) {
		    	
		        for (int j = i + 1; j < stationNames19.size(); j++) { 
		        	
		            if (collator.compare(stationNames19.get(i), stationNames19.get(j)) > 0) {
		            	
			              tmp = stationNames19.get(i);
			              stationNames19.set(i,stationNames19.get(j));
			              stationNames19.set(j,tmp);
		            }
		        }
		    }
		}*/
		

	
	
	
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