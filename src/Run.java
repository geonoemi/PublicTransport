
public class Run {

	public static void main(String[] args) {
		//in-memory kollekci�knak ut�naolvasni
		//menetrend class:teh�t egy komplett menedtrend minkdek�pp legyen egy ArrayList ami minden menetrend bejegyz�st tartalmaz ilyen adattagokkal hogy Vehicle, egy indul�s, �llom�s objektum, �rkez�s
		//git ignore?

		//TODO: Disabled, fossil, electric class debug
		//TODO: Filewriting class shortening
		//TODO: private, protected, public checking
		//TODO: Schedule class 
		//TODO: make UML diagrams
		Station.readInBuses();
		Station.readInTrams();
		Station.readInTrolleys();
		
		FileWriting.fileWriting();
		Route.getARoute();
		//System.out.println(Route.userChoice);
	}
}
