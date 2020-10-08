import java.io.*;
import java.util.*;

public class DepartureTimes{

    private static ArrayList<String>departureTimes=new ArrayList<>();

    public static void readIn(String fileName){ //used in readInDepartureTimes(String directoryName)

        try {

            FileReader reader=new FileReader(fileName);
            BufferedReader buffer=new BufferedReader(reader);
            String line=null;
            int i=0;

            while((line=buffer.readLine())!=null) {

                departureTimes.add(line);
                System.out.println(departureTimes.get(i));

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

    public static void readInDepartureTimes(String directoryName) { //used in Route.getsOff()

        File directory = new File(directoryName);
        ArrayList<String> departureTimesList = new ArrayList<String>(Arrays.asList(directory.list()));

        for(String departureTimes: departureTimesList) {

            if(departureTimes.equals(Route.getUserChoice()+".txt")) {
                readIn("departure times\\"+departureTimes);
            }
        }
    }
}