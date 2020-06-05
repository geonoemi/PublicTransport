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
		Station.readIn("classes files\\stations.txt");
		
		 for( i=0, j=0; i<Station.stationNames.size();i++, j++) {
			  
			  try( //try with resource ->nem kell close-olgatni semmit, pontosvesszõvel felsoroljuk a fájlokat, amiket írni szeretnénk
					
					FileWriter writer1 = new FileWriter("departure times\\working day "+Station.stationNames.get(i) +" 3f back.txt");
				
					  FileWriter writer2 = new FileWriter("departure times\\working day "+Station.stationNames.get(j) +" 3f forth.txt")){
				  
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
		j++;
	}
	public static void main(String[]args) {
		fileWriting();
		
	}
}	

