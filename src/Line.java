import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Line{
	
	private int numberLetter;
	private String type;
	private double length;
	public static ArrayList<String>lineNumberLetter=new ArrayList<>();

	public Line(int numberLetter, String type, double length) {

		this.numberLetter = numberLetter;
		this.type = type;
		this.length = length;
	}

	public int getNumberLetter() {
		return numberLetter;
	}

	public String getType() {
		return type;
	}

	public double getLength() {
		return length;
	}
	public static void readIn(String fileName){ 
		
		try {
			
			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
					String parts[] = line.split(",");
					
					lineNumberLetter.add(parts[0]);
				
				i++;
			}
			
			buffer.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
			System.out.println("Not appropriate input type.");
		}		
	}
	public static void printLineNumberLetter() {
		for (String lineNumberLetter : lineNumberLetter) {
			System.out.println(lineNumberLetter);
		}
	}
	
	@Override
	public String toString() {
		return numberLetter + " " + type + " " + length;
	}
	
/*	public static void main (String[]args) {
		readIn("classes files\\vehicles.txt");
		printLineNumberLetter();
	}*/

}