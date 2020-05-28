import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public  class Jarmu  {
	
	
	private boolean csuklos;
	private boolean alacsonyPadlos;
	private double uzemeltetesiKoltseg;
	private int uloHelyekSzama;
	private boolean bicikliSzallitasiLehetoseg;
	private int rokkantHelyekSzama;
	private boolean javitasSzukseges;
	private String uzemanyagTipus;
	//private static ArrayList<Akadalymentesitett> akadalymentes = new ArrayList<>();
	
	private static boolean akadalymentesitett=false;
	private static boolean javitasKell=false;
	
	
	public Jarmu(boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
				boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges,String uzemanyagTipus) {
		
		this.csuklos = csuklos;
		this.alacsonyPadlos = alacsonyPadlos;
		this.uzemeltetesiKoltseg = uzemeltetesiKoltseg;
		this.uloHelyekSzama = uloHelyekSzama;
		this.bicikliSzallitasiLehetoseg = bicikliSzallitasiLehetoseg;
		this.rokkantHelyekSzama = rokkantHelyekSzama;
		this.javitasSzukseges = javitasSzukseges;
		this.uzemanyagTipus = uzemanyagTipus;
	}
	
	
	public static void beolvas(String fajlnev){ //throws FileNotFoundException, IOException
		try {
			
			FileReader olvaso=new FileReader(fajlnev);
			BufferedReader buffer=new BufferedReader(olvaso);
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
					csuklos[i]=Boolean.parseBoolean(parts[2]);
					irany[i]=parts[3];
					alacsonyPadlos[i]=Boolean.parseBoolean(parts[4]);
					uzemeltetesiKoltseg[i]=Integer.parseInt(parts[5]);
					uloHelyekSzama[i]=Integer.parseInt(parts[6]);
					bicikliSzallitasiLehetoseg[i]=Boolean.parseBoolean(parts[7]);
					rokkantHelyekSzama[i]=Integer.parseInt(parts[8]);
					javitasSzukseges[i]=Boolean.parseBoolean(parts[9]);
					uzemanyagTipus[i]=parts[10];
					
		//	Jarmu jarmuvek=new Jarmu(csuklos[i], alacsonyPadlos[i],  uzemeltetesiKoltseg[i],  uloHelyekSzama[i],
		//		 bicikliSzallitasiLehetoseg[i],  rokkantHelyekSzama[i],  javitasSzukseges[i], uzemanyagTipus[i]);
				if(alacsonyPadlos[i]==true && rokkantHelyekSzama[i]>=1) {
					akadalymentesitett=true;
					System.out.println(vonalSzam[i] +vonalBetu[i]+ " jármû akadálymentesített");
			//		akadalymentes.add();
				}
			
				
				if(javitasSzukseges[i]==true) {
					javitasKell=true;
					System.out.println(vonalSzam[i]+vonalBetu[i] +" Ez a jármû nem biztonságos hosszútávon, kérjük vigye szervizbe!");
				}
			
				
				i++;
			}
			buffer.close();
		
			
		}catch(FileNotFoundException e) {
			System.out.println("A fájl nem található.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}
	
	
	
}
