import java.io.*;
public class FileWriting {
	
	public static void fileWriting() {
		
		int i;
		int j;
		int k;
		
		DayTypes.readIn();
		Station.readInTrams();
		Station.readInBuses();
		Station.readInTrolleys();
		String[]way={"forth","back"};

	try {
		
		for(i=0;i<DayTypes.getDayTypes().size();i++) {
			
			for(k=0;k<way.length;k++) {
				
				for( j=0; j<Station.getStationNames2().size();j++) {	
					
					FileWriter file2 = new FileWriter("departure times\\"+"2 "+Station.getStationNames2().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
						
					for(int o=6; o<22;o++) {	
						file2.write(" "+o+":00\n");
					}		
					file2.close();		
				}
				
				for( j=0; j<Station.getStationNames3F().size();j++) {
					
					FileWriter file3F = new FileWriter("departure times\\"+"3F "+Station.getStationNames3F().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");		
					
					for(int t=6; t<22;t++) {	
						file3F.write(" "+t+":00\n");
					}
					file3F.close();
				}
				
				for( j=0; j<Station.getStationNames4().size();j++) {
					
					FileWriter file4 = new FileWriter("departure times\\"+"4 "+Station.getStationNames4().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
					
					for(int t=6; t<22;t++) {
						file4.write(" "+t+":00\n");
					}
					file4.close();
				}
				
				for( j=0; j<Station.getStationNames70().size();j++) {
							
					FileWriter file70 = new FileWriter("departure times\\"+"70 "+Station.getStationNames70().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
										
					for(int t=6; t<22;t++) {
						file70.write(" "+t+":00\n");
					}	
					file70.close();
				}
				
				for( j=0; j<Station.getStationNames71A().size();j++) {	
					
					FileWriter file71A = new FileWriter("departure times\\"+"71A "+Station.getStationNames71A().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
					
					for(int t=6; t<22;t++) {
						file71A.write(" "+t+":00\n");
					}					
					file71A.close();
				}
				
				for( j=0; j<Station.getStationNames90H().size();j++) {
				
					FileWriter file90H = new FileWriter("departure times\\"+"90H "+Station.getStationNames90H().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
					
					for(int t=6; t<22;t++) {
						file90H.write(" "+t+":00\n");
					}	
					file90H.close();
				}
				
				for( j=0; j<Station.getStationNames8().size();j++) {
					
					FileWriter file8 = new FileWriter("departure times\\"+"8 "+Station.getStationNames8().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
					
					for(int t=6; t<22;t++) {
						file8.write(" "+t+":00\n");
					}	
					file8.close();
				}
				
				for( j=0; j<Station.getStationNames10().size();j++) {
					
					FileWriter file10 = new FileWriter("departure times\\"+"10 "+Station.getStationNames10().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
					
					for(int t=6; t<22;t++) {
						file10.write(" "+t+":00\n");
					}	
					file10.close();
				}
				
				for( j=0; j<Station.getStationNames19().size();j++) {
				
					FileWriter file19 = new FileWriter("departure times\\"+"19 "+Station.getStationNames19().get(j)+" "+DayTypes.getDayTypes().get(i)+" "+way[k]+".txt");
					
					for(int t=6; t<22;t++) {
						file19.write(" "+t+":00\n");
					}		
					file19.close();
				}
			}
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
}	
	
/*	public static void main(String[]args) {
		Station.readInBuses();
		Station.readInTrams();
		Station.readInTrolleys();
		
		fileWriting();
	}*/
}	
				
