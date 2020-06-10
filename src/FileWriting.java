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
		
		beolv.readInTrams();
		beolv.readInBuses();
		beolv.readInTrolleys();

		/*Bus.readIn("classes files\\buses.txt");
		Tram.readIn("classes files\\trams.txt");
		Trolley.readIn("classes files\\trolleys.txt");
*/
		DayTypes.readIn("classes files\\day types.txt");
	//trams	
		for(i=0;i<DayTypes.dayTypes.size();i++) {
			for( j=0; j<beolv.stationNames2.size();j++) {
				try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk
					FileWriter forth = new FileWriter("departure times\\"+"2F "+beolv.stationNames2.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"2 "+beolv.stationNames2.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
							  
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
			for( j=0; j<beolv.stationNames3F.size();j++) {
				try(
					FileWriter forth = new FileWriter("departure times\\"+"3F "+beolv.stationNames3F.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"3F "+beolv.stationNames3F.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
							
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
			
			for( j=0; j<beolv.stationNames4.size();j++) {
				try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk				
					FileWriter forth = new FileWriter("departure times\\"+"4 "+beolv.stationNames4.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"4 "+beolv.stationNames4.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						
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
			
			for( j=0; j<beolv.stationNames70.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"70 "+beolv.stationNames70.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"70 "+beolv.stationNames70.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
							  
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
			for( j=0; j<beolv.stationNames71A.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"71A "+beolv.stationNames71A.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"71A "+beolv.stationNames71A.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
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
			for( j=0; j<beolv.stationNames90H.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"90H "+beolv.stationNames90H.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"90H "+beolv.stationNames90H.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
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
			for( j=0; j<beolv.stationNames8.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"8 "+beolv.stationNames8.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"8 "+beolv.stationNames8.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
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
			for( j=0; j<beolv.stationNames10.size();j++) {
				try( 
					FileWriter forth = new FileWriter("departure times\\"+"10 "+beolv.stationNames10.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"10 "+beolv.stationNames10.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){	  
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
			for( j=0; j<beolv.stationNames19.size();j++) {
				try( //"departure times\\+"19 "+beolv.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt"
					FileWriter forth = new FileWriter("departure times\\"+"19 "+beolv.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" forth.txt");
					FileWriter back = new FileWriter("departure times\\"+"19 "+beolv.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" back.txt")){
						  
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
	/*	beolv.readIn2("stations\\stations for trams\\stations for 2.txt");
		beolv.printStations2(beolv.stationNames2);
		for(String stat2 : beolv.stationNames2) {
			System.out.println(stat2);
		}*/
	}
}	
