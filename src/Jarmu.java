import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public  class Jarmu  {
	
	protected int vonalSzam;
	protected String vonalBetu;
	protected String irany;
	protected boolean csuklos;
	protected boolean alacsonyPadlos;
	protected double uzemeltetesiKoltseg;
	protected int uloHelyekSzama;
	protected boolean bicikliSzallitasiLehetoseg;
	protected int rokkantHelyekSzama;
	protected boolean javitasSzukseges;
	protected String uzemanyagTipus;
	protected static ArrayList<Jarmu> jarmuvek=new ArrayList<>();
	protected static ArrayList<Akadalymentesitett> akadalymentesjarmuvek = new ArrayList<>();
	protected static ArrayList<Jarmu> toService = new ArrayList<>();
	protected static ArrayList<Jarmu> biciklisjarmuvek=new ArrayList<>();
	protected static ArrayList<Jarmu> fosszilisjarmuvek=new ArrayList<>();
	protected static ArrayList<Jarmu> elektromosjarmuvek=new ArrayList<>();
	protected static boolean akadalymentesitett=false;
	protected static boolean javitasKell=false;
	
	
	public Jarmu(int vonalSzam, String vonalBetu, String irany, boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
				boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges,String uzemanyagTipus) {
	}
	
	
	public static void beolvas(String fajlnev){ 
		try {
			
			FileReader reader=new FileReader(fajlnev);
			BufferedReader buffer=new BufferedReader(reader);
			String sor=null;
			int i=0;
			
			while((sor=buffer.readLine())!=null) {
				
					String parts[] = sor.split(",");
					int[]vonalSzam=new int[sor.length()];
					String[]vonalBetu=new String[sor.length()];
					String[]irany=new String[sor.length()];
					boolean[]csuklos=new boolean[sor.length()];
					boolean[]alacsonyPadlos=new boolean[sor.length()];
					double[]uzemeltetesiKoltseg=new double[sor.length()];
					int[]uloHelyekSzama=new int[sor.length()];
					boolean[]bicikliSzallitasiLehetoseg=new boolean[sor.length()];
					int[]rokkantHelyekSzama=new int[sor.length()];
					boolean[]javitasSzukseges=new boolean[sor.length()];
					String[]uzemanyagTipus=new String[sor.length()];
					
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
						System.out.println(vonalSzam[i]+vonalBetu[i] +" Ez a jármû nem biztonságos hosszútávon, kérjük vigye szervizbe!");
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
				System.out.println(j.toString());
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
