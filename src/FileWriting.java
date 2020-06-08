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
		Bus.readIn("classes files\\buses.txt");
		Tram.readIn("classes files\\trams.txt");
		Trolley.readIn("classes files\\trolleys.txt");

		DayTypes.readIn("classes files\\day types.txt");
		
		for(i=0;i<DayTypes.dayTypes.size();i++) {
				
			for( j=0; j<Station.stationNames.size();j++) {
					
				for(k=0;k<Vehicle.lineNums.size();k++) {
						
					try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk
								
						FileWriter forth = new FileWriter("departure times\\"+DayTypes.dayTypes.get(i)+" "+Station.stationNames.get(j)+" " +Vehicle.lineNums.get(k)+" forth.txt");
								
						FileWriter back = new FileWriter("departure times\\"+DayTypes.dayTypes.get(i)+" "+Station.stationNames.get(j)+" "+Vehicle.lineNums.get(k)+" back.txt")){
							  
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
	}
}	
