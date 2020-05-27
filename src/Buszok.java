import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buszok extends Jarmu implements Fosszilis {


	private String rendszam;
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
			if (i>1) System.out.println(sor);
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
