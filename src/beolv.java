import java.text.Collator;
import java.util.*;
public class beolv {
	public static void sortStrings(Collator collator, ArrayList <String> words) {
	    String tmp;
	    for (int i = 0; i < words.size(); i++) {
	        for (int j = i + 1; j < words.size(); j++) { 
	            if (collator.compare(words.get(i), words.get(j)) > 0) {
	              tmp = words.get(i);
	              words.set(i,words.get(j));
	              words.set(j,tmp);
	           }
	        }
	    }
	}
	public static void main(String[] args) {
		
		Collator hu = Collator.getInstance(new Locale("hu","HU"));
		ArrayList <String> words = new ArrayList <>();
		 	words.add("Vitéz utca");
		 	words.add("Vértó");
		 	words.add("Személyi pályaudvar");
		sortStrings(hu,words);
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}
		
		
		
	}

}
