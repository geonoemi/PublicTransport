import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryTry {
	
	public static ArrayList<String>fileNames=new ArrayList<>();
	
	public static List<File> readInDepartureTimes(String directoryName) {
		   
	        File directory = new File(directoryName);

	        List<File> resultList = new ArrayList<File>();

	        File[] fileList = directory.listFiles();
	        resultList.addAll(Arrays.asList(fileList));
	        
	        for (File file : fileList) {
	        	
	            if (file.isFile()) {
	       //     	fileNames.add(file);//regexp
	                System.out.println(file);
	            } 
	            else if (file.isDirectory()) {
	                resultList.addAll(readInDepartureTimes(file.getAbsolutePath()));
	            }
	        }
	        return resultList;
	    } 
	   
	 public static void main(String[] args) {
		 
		   readInDepartureTimes("departure times");
	        	        
	 }
}
