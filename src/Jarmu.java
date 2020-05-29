import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public  class Jarmu  {
	
	protected int lineNum;
	protected String lineLetter;
	protected String way;
	protected boolean articulated;
	protected boolean lowFloor;
	protected double operatingCost;
	protected int numOfSeats;
	protected boolean bicycleTransportOpp;
	protected int numOfDisabledPlaces;
	protected boolean needToRepair;
	protected String typeOfFuel;
	protected static ArrayList<Jarmu> vehicles=new ArrayList<>();
	protected static ArrayList<WheelchairAccessible> wheelchairAccessibleVehicles = new ArrayList<>();
	protected static ArrayList<Jarmu> toService = new ArrayList<>();
	protected static ArrayList<Jarmu> biciklisjarmuvek=new ArrayList<>();
	protected static ArrayList<Jarmu> fosszilisjarmuvek=new ArrayList<>();
	protected static ArrayList<Jarmu> elektromosjarmuvek=new ArrayList<>();
	
	
	protected static boolean akadalymentesitett=false;
	protected static boolean javitasKell=false;
	
	
	public Jarmu(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
				boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,String typeOfFuel) {
	}
	
	
	public static void beolvas(String fajlnev){ 
		try {
			
			FileReader reader=new FileReader(fajlnev);
			BufferedReader buffer=new BufferedReader(reader);
			String queue=null;
			int i=0;
			
			while((queue=buffer.readLine())!=null) {
				
					String parts[] = queue.split(",");
					int[]lineNum=new int[queue.length()];
					String[]lineLetter=new String[queue.length()];
					String[]way=new String[queue.length()];
					boolean[]articulated=new boolean[queue.length()];
					boolean[]lowFloor=new boolean[queue.length()];
					double[]operationCost=new double[queue.length()];
					int[]numOfSeats=new int[queue.length()];
					boolean[]bicycleTransportOpp=new boolean[queue.length()];
					int[]numOfDisabledPlaces=new int[queue.length()];
					boolean[]needToRepair=new boolean[queue.length()];
					String[]typeOfFuel=new String[queue.length()];
					
					vonalSzam[i]=Integer.parseInt(parts[0]);
					vonalBetu[i]=parts[1];
					irany[i]=parts[2];
					csuklos[i]=Boolean.valueOf(parts[3]);
					alacsonyPadlos[i]=Boolean.parseBoolean(parts[4]);
					uzemeltetesiKoltseg[i]=Double.parseDouble(parts[5]);
					uloHelyekSzama[i]=Integer.parseInt(parts[6]);
					bicikliSzallitasiLehetoseg[i]=Boolean.parseBoolean(parts[7]);
					rokkantHelyekSzama[i]=Integer.parseInt(parts[8]);
					javitasSzukseges[i]=Boolean.parseBoolean(parts[9]);
					uzemanyagTipus[i]=parts[10];
					
					/*System.out.println(vonalSzam[i]+" "+vonalBetu[i]+" "+irany[i]+" "+csuklos[i]+" "+ alacsonyPadlos[i]+" "+  uzemeltetesiKoltseg[i]
										+" "+uloHelyekSzama[i]+" "+	bicikliSzallitasiLehetoseg[i]+" "+rokkantHelyekSzama[i]
										+" "+javitasSzukseges[i]+" "+uzemanyagTipus[i]);
					*/
					Jarmu jarmu=new Jarmu(vonalSzam[i], vonalBetu[i], irany[i], csuklos[i], alacsonyPadlos[i],  uzemeltetesiKoltseg[i],  uloHelyekSzama[i],
											bicikliSzallitasiLehetoseg[i],  rokkantHelyekSzama[i],  javitasSzukseges[i], uzemanyagTipus[i]);
					jarmuvek.add(jarmu);
					
					Jarmu akadalymentes=new Akadalymentesitett(vonalSzam[i], vonalBetu[i], irany[i], csuklos[i], alacsonyPadlos[i],  uzemeltetesiKoltseg[i],  uloHelyekSzama[i],
											bicikliSzallitasiLehetoseg[i],  rokkantHelyekSzama[i],  javitasSzukseges[i], uzemanyagTipus[i]);
					if(alacsonyPadlos[i] && rokkantHelyekSzama[i]>=1) {
						akadalymentesjarmuvek.add((Akadalymentesitett) akadalymentes);
					}
						
					if(javitasSzukseges[i]) {
						toService.add(jarmu);
					//	System.out.println(vonalSzam[i]+vonalBetu[i] +" Ez a jármû nem biztonságos hosszútávon, kérjük vigye szervizbe!");
					}	
					
					if(bicikliSzallitasiLehetoseg[i]) {
						biciklisjarmuvek.add(jarmu);
					}
					if(uzemanyagTipus[i].contentEquals("benzin") || uzemanyagTipus[i].contentEquals("gázolaj")) {
						fosszilisjarmuvek.add(jarmu);
					}else {
						elektromosjarmuvek.add(jarmu);
					}
				i++;
			}
			buffer.close();
			
			for(Jarmu j: jarmuvek) {
				System.out.println("jármûvek: "+j+" "+j.toString());
			}
			for(Jarmu j: akadalymentesjarmuvek) {
				System.out.println("akadálymentesjarmuvek: "+j+" "+j.toString());
			}
			for(Jarmu j: toService) {
				System.out.println("javítandó jármûvek: "+j+" "+j.toString());
			}
			for(Jarmu j: toService) {
				System.out.println("javítandó jármûvek: "+j+" "+j.toString());
			}for(Jarmu j: biciklisjarmuvek) {
				System.out.println("kerékpárt szállító jármûvek: "+j+" "+j.toString());
			}
			for(Jarmu j: fosszilisjarmuvek) {
				System.out.println("benzinnel/gázolajjal mûködõ jármûvek: "+j+" "+j.toString());
			}
			for(Jarmu j: elektromosjarmuvek) {
				System.out.println("elektromos árammal mûködõ jármûvek: "+j+" "+j.toString());
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("A fájl nem található.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}		
	}
	public String toString() {
		return vonalSzam+" "+vonalBetu+" "+irany+" "+csuklos+" "+ alacsonyPadlos+" "+  uzemeltetesiKoltseg
				+" "+uloHelyekSzama+" "+	bicikliSzallitasiLehetoseg+" "+rokkantHelyekSzama
				+" "+javitasSzukseges+" "+uzemanyagTipus;
	}

}
