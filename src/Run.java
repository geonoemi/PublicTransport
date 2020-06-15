
public class Run {

	public static void main(String[] args) {
		//in-memory kollekcióknak utánaolvasni
		//menetrend class:tehát egy komplett menedtrend minkdeképp legyen egy ArrayList ami minden menetrend bejegyzést tartalmaz ilyen adattagokkal hogy Vehicle, egy indulás, Állomás objektum, érkezés
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
