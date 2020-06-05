import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
public class beolv {
	//trying class
	

	public static void fileWriting() {
		try {
			FileWriter writer1=new FileWriter("departure times\\working day Tarján 3f back.txt");
			writer1.write("06:00\n");
			writer1.write("07:00\n");
			writer1.write("08:00\n");
			writer1.close();
			
			FileWriter writer2=new FileWriter("departure times\\working day Tarján 3f forth.txt");
			writer2.write("06:10\n");
			writer2.write("06:20\n");
			writer2.write("06:30\n");
			writer2.close();
			
		
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public static void main(String[]args) {
		fileWriting();
	}
}	

