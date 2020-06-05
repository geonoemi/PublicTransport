import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
public class beolv {
	//trying class
	

	public static void fileWriting() {
		
		Station.readIn("classes files\\stations.txt");
		
		 for(int i=0;i<Station.stationNames.size();i++) {
			  
			  try(
					
					FileWriter writer1 = new FileWriter("departure times\\"+Station.stationNames.get(i) +" 3f back.txt");
					FileWriter writer2 = new FileWriter("departure times\\"+Station.stationNames.get(i) +" 3f forth.txt")){
				  
						writer1.write("06:00\n");
						writer1.write("07:00\n");
						writer1.write("08:00\n");
						
						writer2.write("06:10\n");
						writer2.write("07:10\n");
						writer2.write("08:10\n");
	
				i++;
		
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[]args) {
		fileWriting();
		
	}
}	

