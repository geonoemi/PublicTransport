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
		
		DayTypes.readIn("classes files\\day types.txt");
		Station.readInTrams();
		Station.readInBuses();
		Station.readInTrolleys();
		String[]way={"forth","back"};
		
		try{	
			for(i=0;i<DayTypes.dayTypes.size();i++) {
				for(k=0;k<way.length;k++) {
					for( j=0; j<Station.stationNames2.size();j++) {
						//( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk
							
						FileWriter file2 = new FileWriter("departure times\\"+"2 "+Station.stationNames2.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								file2.write("06:00\n");
								file2.write("07:00\n");
								file2.write("08:00\n");
								file2.close();				
					}
					for( j=0; j<Station.stationNames3F.size();j++) {
						
						FileWriter file3F = new FileWriter("departure times\\"+"3F "+Station.stationNames3F.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");		
							file3F.write("06:00\n");
							file3F.write("07:00\n");
							file3F.write("08:00\n");
							file3F.close();
					}
					
					for( j=0; j<Station.stationNames4.size();j++) {
						FileWriter file4 = new FileWriter("departure times\\"+"4 "+Station.stationNames4.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								
								file4.write("06:00\n");
								file4.write("07:00\n");
								file4.write("08:00\n");
								file4.close();
					}
					for( j=0; j<Station.stationNames70.size();j++) {
								
							FileWriter file70 = new FileWriter("departure times\\"+"70 "+Station.stationNames70.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						
							file70.write("06:00\n");
							file70.write("07:00\n");
							file70.write("08:00\n");
							file70.close();
					}
					
					for( j=0; j<Station.stationNames71A.size();j++) {	
							FileWriter file71A = new FileWriter("departure times\\"+"71A "+Station.stationNames71A.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								file71A.write("06:00\n");
								file71A.write("07:00\n");
								file71A.write("08:00\n");			
								file71A.close();
					}
					
					for( j=0; j<Station.stationNames90H.size();j++) {
							FileWriter file90H = new FileWriter("departure times\\"+"90H "+Station.stationNames90H.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								file90H.write("06:00\n");
								file90H.write("07:00\n");
								file90H.write("08:00\n");
								file90H.close();
					}
					
					for( j=0; j<Station.stationNames8.size();j++) {
						FileWriter file8 = new FileWriter("departure times\\"+"8 "+Station.stationNames8.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								file8.write("06:00\n");
								file8.write("07:00\n");
								file8.write("08:00\n");
								file8.close();
					}
					
					for( j=0; j<Station.stationNames10.size();j++) {
						FileWriter file10 = new FileWriter("departure times\\"+"10 "+Station.stationNames10.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								file10.write("06:00\n");
								file10.write("07:00\n");
								file10.write("08:00\n");
								file10.close();
					}
					
					for( j=0; j<Station.stationNames19.size();j++) {
						FileWriter file19 = new FileWriter("departure times\\"+"19 "+Station.stationNames19.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								file19.write("06:00\n");
								file19.write("07:00\n");
								file19.write("08:00\n");
								file19.close();
					}
					
				}
			}
			}catch(IOException e) {
				System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[]args) {
		fileWriting();
	}
}	
