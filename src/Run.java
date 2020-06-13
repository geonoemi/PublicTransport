
public class Run {

	public static void main(String[] args) {
		//in-memory kollekcióknak utánaolvasni
		//menetrend class:tehát egy komplett menedtrend minkdeképp legyen egy ArrayList ami minden menetrend bejegyzést tartalmaz ilyen adattagokkal hogy Vehicle, egy indulás, Állomás objektum, érkezés
		//mi megy a stackbe,mi a heapbe?
		//git ignore?

		//TODO: Disabled, fossil, electric class debug
		//TODO: Filewriting class shortening
		//TODO: private, protected, public checking
		//TODO: Route class way scanning debug
		//TODO: Route class scanning tram 3F debug
		//TODO: Line class for what?
		//TODO: Schedule class 
	/*	Tram.readIn("classes files\\trams.txt");
		for(Tram trams : Tram.trams) {
			System.out.println(trams);
		}*/
		Route.getARoute();
		System.out.println(Route.userChoice);
	}
}
