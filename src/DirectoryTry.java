import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryTry{
	
	static boolean isDepartureTimesDirectoryEmpty;

	public static ArrayList<File> fileList = new ArrayList<File>();

	public static void readInDepartureTimesDirectory() {
 
       File directory = new File("departure times");

       for(File file : directory.listFiles()) {
    	   fileList.add(file);
       }
	}
    
     public static boolean isEmpty() {  
    	 readInDepartureTimesDirectory();
	      if(fileList.isEmpty()) {
	  		  isDepartureTimesDirectoryEmpty=true;
	  	  } else {
	  		 isDepartureTimesDirectoryEmpty=false;
	  	  }
	       return isDepartureTimesDirectoryEmpty;
	}
    
     public static void getStarted() {
    	 isEmpty();
    	 if(isDepartureTimesDirectoryEmpty) {
				FileWriting.fileWriting() ;
				Route.getARoute();
	     }else {
	    	 Route.getARoute();
	     }
     }
}