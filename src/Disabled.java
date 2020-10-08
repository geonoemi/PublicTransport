import java.util.ArrayList;

public class Disabled extends Line {

    private static ArrayList<String> disabledTrams = new ArrayList<>();
    private static ArrayList<String> disabledBuses = new ArrayList<>();
    private static ArrayList<String> disabledTrolleys = new ArrayList<>();

    public static ArrayList<String> getDisabledTrams() {
        return disabledTrams;
    }

    public static ArrayList<String> getDisabledBuses() {
        return disabledBuses;
    }

    public static ArrayList<String> getDisabledTrolleys() {
        return disabledTrolleys;
    }

    public Disabled(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,	boolean bicycleTransportOpp, int numOfDisabledPlaces,
                    boolean needToRepair, String typeOfFuel,boolean hasWheel, String typeOfVehicle) {
        super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,	typeOfFuel, hasWheel, typeOfVehicle);
    }

    public static void fillDisabledTrams() {

        Tram.getTrams().clear();
        Tram.readIn();

        for(Tram trams: Tram.getTrams()) {

            if(trams.lowFloor && trams.numOfDisabledPlaces>=1) {

                Disabled disabledTram=new Disabled(trams.lineNum,  trams.articulate, trams.lowFloor, trams.operationCost, trams.numOfSeats, trams.bicycleTransportOpp,
                        trams.numOfDisabledPlaces, trams.needToRepair, trams.typeOfFuel, trams.hasWheel, trams.typeOfVehicle);

                disabledTrams.add(disabledTram.lineNum); //disabledTram into disabledVehicles ArrayList
            }
        }
    }

    public static void printDisabledTrams() {

        disabledTrams.clear();
        fillDisabledTrams();

        for(String disabledTrams: disabledTrams ) {
            System.out.println(disabledTrams);
        }
    }

    public static void fillDisabledBuses() {

        Bus.getBuses().clear();
        Bus.readIn();

        for(Bus buses: Bus.getBuses()) {

            if(buses.lowFloor && buses.numOfDisabledPlaces>=1) {

                Disabled disabledBus=new Disabled(buses.lineNum,  buses.articulate, buses.lowFloor, buses.operationCost, buses.numOfSeats, buses.bicycleTransportOpp,
                        buses.numOfDisabledPlaces, buses.needToRepair, buses.typeOfFuel, buses.hasWheel, buses.typeOfVehicle);

                disabledBuses.add(disabledBus.lineNum);
            }
        }
    }

    public static void printDisabledBuses() {

        disabledBuses.clear();
        fillDisabledBuses();

        for(String disabledBuses: disabledBuses ) {
            System.out.println(disabledBuses);
        }
    }

    public static void fillDisabledTrolleys() {

        Trolley.getTrolleys().clear();
        Trolley.readIn();

        for(Trolley trolleys: Trolley.getTrolleys()) {

            if(trolleys.lowFloor && trolleys.numOfDisabledPlaces>=1) {

                Disabled disabledTrolley=new Disabled(trolleys.lineNum,  trolleys.articulate, trolleys.lowFloor, trolleys.operationCost, trolleys.numOfSeats,
                        trolleys.bicycleTransportOpp, trolleys.numOfDisabledPlaces,	trolleys.needToRepair, trolleys.typeOfFuel,
                        trolleys.hasWheel, trolleys.typeOfVehicle);

                disabledTrolleys.add(disabledTrolley.lineNum);
            }
        }
    }

    public static void printDisabledTrolleys() {

        disabledTrolleys.clear();
        fillDisabledTrolleys();

        for(String disabledTrolleys: disabledTrolleys ) {
            System.out.println(disabledTrolleys);
        }
    }
}
