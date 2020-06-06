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
		
		Station.readIn("classes files\\stations.txt");
		Vehicle.readIn("classes files\\vehicles.txt");
		DepartureTimes.fillDayTypeList();
		
		for(i=0;i<DepartureTimes.dayTypeList.size();i++) {
				
			for( j=0; j<Station.stationNames.size();j++) {
					
				for(k=0;k<Vehicle.lineNums.size();k++) {
						
					try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk
								
						FileWriter writer1 = new FileWriter("departure times\\"+DepartureTimes.dayTypeList.get(i)+" "+Station.stationNames.get(j)+" " +Vehicle.lineNums.get(k)+" back.txt");
								
						FileWriter writer2 = new FileWriter("departure times\\"+DepartureTimes.dayTypeList.get(i)+" "+Station.stationNames.get(j)+" "+Vehicle.lineNums.get(k)+" forth.txt")){
							  
									writer1.write("06:00\n");
									writer1.write("07:00\n");
									writer1.write("08:00\n");
									
									writer2.write("06:10\n");
									writer2.write("07:10\n");
									writer2.write("08:10\n");
				
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}
}	
