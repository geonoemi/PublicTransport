import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryTry {
	
	 public static void main(String[] args) {

	        final File folder = new File("departure times");

	        String[] files = folder.list();
	        
	        for (String file : files){	        	
	        	System.out.println(file);
	        }
	        
	    }
	
}
