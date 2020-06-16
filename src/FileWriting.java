import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {
	
	public static void fileWriting() { //used in IsEmptyCheck.getStarted()
		
		int i;
		int j;
		int k;
		int h;
		int m;
		
		DayTypes.readIn();
		Station.readInTrams();
		Station.readInBuses();
		Station.readInTrolleys();
		String [] way = {"forth","back"};

	try {
			for(i=0;i<DayTypes.getDayTypes().size();i++) {
				
				for(k=0;k<way.length;k++) {
					
					for( j=0; j<Station.getStationNames2().size();j++) {	
						
						FileWriter file2 = new FileWriter("departure times\\"+"2 "+Station.getStationNames2().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
							
						for( h=6; h<22; h++) {	
							for(m=0;m<60;m+=10) {
								file2.write(" "+h+":"+m+"\n");
							}	
						}		
						file2.close();		
					}
					
					for( j=0; j<Station.getStationNames3F().size();j++) {
						
						FileWriter file3F = new FileWriter("departure times\\"+"3F "+Station.getStationNames3F().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");		
						
						for(h=6; h<22; h++) {	
							for(m=10;m<60;m+=15) {
								file3F.write(" "+h+":"+m+"\n");
							}
						}
						file3F.close();
					}
					
					for( j=0; j<Station.getStationNames4().size();j++) {
						
						FileWriter file4 = new FileWriter("departure times\\"+"4 "+Station.getStationNames4().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=12) {
								file4.write(" "+h+":"+m+"\n");
							}
						}
						file4.close();
					}
					
					for( j=0; j<Station.getStationNames70().size();j++) {
								
						FileWriter file70 = new FileWriter("departure times\\"+"70 "+Station.getStationNames70().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
											
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=14) {
								file70.write(" "+h+":"+m+"\n");
							}
						}	
						file70.close();
					}
					
					for( j=0; j<Station.getStationNames71A().size();j++) {	
						
						FileWriter file71A = new FileWriter("departure times\\"+"71A "+Station.getStationNames71A().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=20) {
								file71A.write(" "+h+":"+m+"\n");
							}
						}					
						file71A.close();
					}
					
					for( j=0; j<Station.getStationNames90H().size();j++) {
					
						FileWriter file90H = new FileWriter("departure times\\"+"90H "+Station.getStationNames90H().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=10) {
								file90H.write(" "+h+":"+m+"\n");
							}
						}	
						file90H.close();
					}
					
					for( j=0; j<Station.getStationNames8().size();j++) {
						
						FileWriter file8 = new FileWriter("departure times\\"+"8 "+Station.getStationNames8().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=5) {
								file8.write(" "+h+":"+m+"\n");
							}
						}	
						file8.close();
					}
					
					for( j=0; j<Station.getStationNames10().size();j++) {
						
						FileWriter file10 = new FileWriter("departure times\\"+"10 "+Station.getStationNames10().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=8) {
								file10.write(" "+h+":"+m+"\n");
							}
						}	
						file10.close();
					}
					
					for( j=0; j<Station.getStationNames19().size();j++) {
					
						FileWriter file19 = new FileWriter("departure times\\"+"19 "+Station.getStationNames19().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
						for(h=6; h<22; h++) {
							for(m=10;m<60;m+=12) {
								file19.write(" "+h+":"+m+"\n");
							}
						}		
						file19.close();
					}
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}	