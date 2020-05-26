
public class Trolik extends Jarmu implements Elektromos {

	public Trolik(int vonalSzam, String vonalBetu, String vonalTipus, double vonalHossz, String indulasiIdo,
			boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
			boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges,
			String uzemanyagTipus) {
		super(vonalSzam, vonalBetu, vonalTipus, vonalHossz, indulasiIdo, csuklos, alacsonyPadlos, uzemeltetesiKoltseg,
				uloHelyekSzama, bicikliSzallitasiLehetoseg, rokkantHelyekSzama, javitasSzukseges, uzemanyagTipus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean haladhatItt(boolean vanEAramSzedoItt) {
		
		return true;
	}

}
