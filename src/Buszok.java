
public class Buszok extends Jarmu implements Fosszilis {

	private String rendszam;

	public Buszok(int vonalSzam, String vonalBetu, String vonalTipus, double vonalHossz, String indulasiIdo,
			boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
			boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges, String uzemanyagTipus,
			String rendszam) {
		super(vonalSzam, vonalBetu, vonalTipus, vonalHossz, indulasiIdo, csuklos, alacsonyPadlos, uzemeltetesiKoltseg,
				uloHelyekSzama, bicikliSzallitasiLehetoseg, rokkantHelyekSzama, javitasSzukseges, uzemanyagTipus);
		this.rendszam = rendszam;
	}


	
}
