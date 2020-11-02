import java.io.File;
import java.util.ArrayList;

public class Run {

    public static ArrayList<File> fileList = new ArrayList<File>();

    public static void readInDepartureTimesDirectory() { //used in getStarted()

        File directory = new File("departure times");

        for(File file : directory.listFiles()) {
            fileList.add(file);
        }
    }

    public static void getStarted() {  //used in Run

        readInDepartureTimesDirectory();

        if(fileList.isEmpty()) {

            FileWriting.fileWriting() ;
        }
        Route.getARoute();
    }
    public static void main(String[] args) {

        getStarted();

    }
}