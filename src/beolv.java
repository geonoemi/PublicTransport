import java.text.Collator;
import java.util.*;
public class beolv {
	public static void sortStationNames(Collator collator, ArrayList <String> stationNames) {
	    String tmp;
	    for (int i = 0; i < stationNames.size(); i++) {
	        for (int j = i + 1; j < stationNames.size(); j++) { 
	            if (collator.compare(stationNames.get(i), stationNames.get(j)) > 0) {
	              tmp = stationNames.get(i);
	              stationNames.set(i,stationNames.get(j));
	              stationNames.set(j,tmp);
	           }
	        }
	    }
	}
	public static void main(String[] args) {
		
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		sortStationNames(hu,Station.stationNames);
		for(int i=0;i<Station.stationNames.size();i++) {
			System.out.println(Station.stationNames.get(i));
		}	
	}
}
