import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
public class beolv {
	//trying class
	

	public static void fileWriting() {
		int i;
		int j;
		int l;
		Station.readIn("classes files\\stations.txt");
		Vehicle.readIn("classes files\\vehicles.txt");
		for(j=0;j<Vehicle.lineNums.size();j++) {
			 for( i=0; i<Station.stationNames.size();i++) {
				//megoldani minden j�ratra  
				  try( //try with resource ->nem kell close-olgatni semmit, pontosvessz�vel felsoroljuk a f�jlokat, amiket �rni szeretn�nk
						
						FileWriter writer1 = new FileWriter("departure times\\working day "+Station.stationNames.get(i)+" " +Vehicle.lineNums.get(j)+" back.txt");
					
						FileWriter writer2 = new FileWriter("departure times\\working day "+Station.stationNames.get(i)+" "+Vehicle.lineNums.get(j)+" forth.txt")){
					  
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
			i++;
			
		}
		j++;
	}
	public static void main(String[]args) {
		fileWriting();
		
	}
}	

