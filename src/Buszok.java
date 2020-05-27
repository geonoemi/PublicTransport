import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buszok extends Jarmu implements Fosszilis, Akadalymentesitett {


	private String rendszam;
	private static boolean akadalymentesitett=false;
	public Buszok(boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
			boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges,
			String uzemanyagTipus) {
		super(csuklos, alacsonyPadlos, uzemeltetesiKoltseg, uloHelyekSzama, bicikliSzallitasiLehetoseg, rokkantHelyekSzama,
				javitasSzukseges, uzemanyagTipus);
		this.rendszam = rendszam;	
		
	}
	public static void beolvas(String fajlnev){ //throws FileNotFoundException, IOException
	try {
		
		FileReader olvaso=new FileReader(fajlnev);
		BufferedReader buffer=new BufferedReader(olvaso);
		String sor=null;
		int i=0;
		
		while((sor=buffer.readLine())!=null) {
			
				String parts[] = sor.split(",");
			
				String[]vonalSzam=new String[sor.length()];
				String[]vonalBetu=new String[sor.length()];
				String[]irany=new String[sor.length()];
				String[]csuklos=new String[sor.length()];
				String[]alacsonyPadlos=new String[sor.length()];
				String[]uzemeltetesiKoltseg=new String[sor.length()];
				String[]uloHelyekSzama=new String[sor.length()];
				String[]bicikliSzallitasiLehetoseg=new String[sor.length()];
				String[]rokkantHelyekSzama=new String[sor.length()];
				String[]javitasSzukseges=new String[sor.length()];
				String[]uzemanyagTipus=new String[sor.length()];
				
				vonalSzam[i]=parts[0];
				vonalBetu[i]=parts[1];
				csuklos[i]=parts[2];
				irany[i]=parts[3];
				alacsonyPadlos[i]=parts[4];
				uzemeltetesiKoltseg[i]=parts[5];
				uloHelyekSzama[i]=parts[6];
				bicikliSzallitasiLehetoseg[i]=parts[7];
				rokkantHelyekSzama[i]=parts[8];
				javitasSzukseges[i]=parts[9];
				uzemanyagTipus[i]=parts[10];
				
			//System.out.println(uzemanyagTipus[i]);
			if(alacsonyPadlos[i].equals("1") && Integer.parseInt(rokkantHelyekSzama[i])>=1) {
				akadalymentesitett=true;
			}
			if(akadalymentesitett) System.out.println(vonalSzam[i]);
			i++;
		}
		buffer.close();
	
		
	}catch(FileNotFoundException e) {
		System.out.println("A fájl nem található.");
	}catch(IOException e) {
		System.out.println("e.getMessage()");
	}
	}
	public static void main(String[] args) {
	
		beolvas("buszok.txt");
		
	}	
}
