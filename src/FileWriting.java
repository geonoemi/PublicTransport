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
		beolv.readInTrams();
		beolv.readInBuses();
		beolv.readInTrolleys();
		String[]way={"forth","back"};
		
		try{	
			for(i=0;i<DayTypes.dayTypes.size();i++) {
				for(k=0;k<way.length;k++) {
					for (j = 0; j < beolv.stationNamesList.size(); j++) { 
				  		for (int a = 0; a < beolv.stationNamesList.get(j).size(); a++) { 
			              // System.out.print(beolv.stationNamesList.get(i).get(a) + " "); 
			    	
								FileWriter file2 = new FileWriter("departure times\\"+"2 "+beolv.stationNamesList.get(j).get(a)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
								for(int o=6; o<22;o++) {	
									file2.write(" "+o+":00\n");
								}		
								file2.close();				
							}
				}
					/*for( j=0; j<beolv.stationNamesList.size();j++) {
						
						FileWriter file3F = new FileWriter("departure times\\"+"3F "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");		
						for(int t=6; t<22;t++) {	
							file3F.write(" "+t+":00\n");
						}
						file3F.close();
					}
					
					for( j=0; j<beolv.stationNamesList.size();j++) {
						FileWriter file4 = new FileWriter("departure times\\"+"4 "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file4.write(" "+t+":00\n");
						}
						file4.close();
					}
					for( j=0; j<beolv.stationNamesList.size();j++) {
								
						FileWriter file70 = new FileWriter("departure times\\"+"70 "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file70.write(" "+t+":00\n");
						}	
						file70.close();
					}
					
					for( j=0; j<beolv.stationNamesList.size();j++) {	
						FileWriter file71A = new FileWriter("departure times\\"+"71A "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file71A.write(" "+t+":00\n");
						}					
						file71A.close();
					}
					
					for( j=0; j<beolv.stationNamesList.size();j++) {
						FileWriter file90H = new FileWriter("departure times\\"+"90H "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file90H.write(" "+t+":00\n");
						}	
						file90H.close();
					}
					
					for( j=0; j<beolv.stationNamesList.size();j++) {
						FileWriter file8 = new FileWriter("departure times\\"+"8 "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file8.write(" "+t+":00\n");
						}	
						file8.close();
					}
					
					for( j=0; j<beolv.stationNamesList.size();j++) {
						FileWriter file10 = new FileWriter("departure times\\"+"10 "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file10.write(" "+t+":00\n");
						}	
						file10.close();
					}
					
					for( j=0; j<beolv.stationNamesList.size();j++) {
						FileWriter file19 = new FileWriter("departure times\\"+"19 "+beolv.stationNamesList.get(j)+" "+DayTypes.dayTypes.get(i)+" "+way[k]+".txt");
						for(int t=6; t<22;t++) {
							file19.write(" "+t+":00\n");
						}		
						file19.close();*/
					
				}
			}
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
}
	
	public static void main(String[]args) {
		beolv.readInBuses();
		beolv.readInTrams();
		beolv.readInTrolleys();
		for (int i = 0; i < beolv.stationNamesList.size(); i++) { 
	  		for (int a = 0; a < beolv.stationNamesList.get(i).size(); a++) { 
               System.out.print(beolv.stationNamesList.get(i).get(a) + " "); 
            } 
	  		System.out.println();
     	}
	
		fileWriting();
	}
}	
