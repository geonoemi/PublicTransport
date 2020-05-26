
public abstract class Jarmu extends Jarat {
	
	
	private boolean csuklos;
	private boolean alacsonyPadlos;
	private double uzemeltetesiKoltseg;
	private int uloHelyekSzama;
	private boolean bicikliSzallitasiLehetoseg;
	private int rokkantHelyekSzama;
	private boolean javitasSzukseges;
	private String uzemanyagTipus;
	public Jarmu(int vonalSzam, String vonalBetu, String vonalTipus, double vonalHossz, String indulasiIdo,
			boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
			boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges,
			String uzemanyagTipus) {
		super(vonalSzam, vonalBetu, vonalTipus, vonalHossz, indulasiIdo);
		this.csuklos = csuklos;
		this.alacsonyPadlos = alacsonyPadlos;
		this.uzemeltetesiKoltseg = uzemeltetesiKoltseg;
		this.uloHelyekSzama = uloHelyekSzama;
		this.bicikliSzallitasiLehetoseg = bicikliSzallitasiLehetoseg;
		this.rokkantHelyekSzama = rokkantHelyekSzama;
		this.javitasSzukseges = javitasSzukseges;
		this.uzemanyagTipus = uzemanyagTipus;
	}
	
	
	
	
	
}
