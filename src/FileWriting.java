import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
public class FileWriting {
	
	public static void fileWriting() {
		
		int i;
		int j;
		int k;
		
		//Station.readIn("classes files\\stations.txt");
		DayTypes.readIn("classes files\\day types.txt");
		Station.readInTrams();
		Station.readInBuses();
		Station.readInTrolleys();

		for(i=0;i<DayTypes.dayTypes.size();i++) {
			for( j=0; j<Station.stationNames2.size();j++) {
				try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk
					FileWriter forth = new FileWriter("departure times\\"+"2 "+Station.stationNames2.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"2 "+Station.stationNames2.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
							  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			for( j=0; j<Station.stationNames3F.size();j++) {
				try(
					FileWriter forth = new FileWriter("departure times\\"+"3F "+Station.stationNames3F.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"3F "+Station.stationNames3F.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
							
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
										
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
					
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}
			}
			
			for( j=0; j<Station.stationNames4.size();j++) {
				try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk				
					FileWriter forth = new FileWriter("departure times\\"+"4 "+Station.stationNames4.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"4 "+Station.stationNames4.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}
			}	
			
			for( j=0; j<Station.stationNames70.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"70 "+Station.stationNames70.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"70 "+Station.stationNames70.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
							  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			for( j=0; j<Station.stationNames71A.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"71A "+Station.stationNames71A.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"71A "+Station.stationNames71A.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			for( j=0; j<Station.stationNames90H.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"90H "+Station.stationNames90H.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"90H "+Station.stationNames90H.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			for( j=0; j<Station.stationNames8.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"8 "+Station.stationNames8.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"8 "+Station.stationNames8.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			for( j=0; j<Station.stationNames10.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"10 "+Station.stationNames10.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"10 "+Station.stationNames10.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){	  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			for( j=0; j<Station.stationNames19.size();j++) {
				try( //"departure times\\+"19 "+Station.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt"
					FileWriter forth = new FileWriter("departure times\\"+"19 "+Station.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"19 "+Station.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
						forth.write("06:00\n");
						forth.write("07:00\n");
						forth.write("08:00\n");
									
						back.write("06:10\n");
						back.write("07:10\n");
						back.write("08:10\n");
				
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
	}
	
	public static void main(String[]args) {
		fileWriting();
	/*	Station.readIn2("stations\\stations for trams\\stations for 2.txt");
		Station.printStations2(Station.stationNames2);
		for(String stat2 : Station.stationNames2) {
			System.out.println(stat2);
		}*/
	}
}	
