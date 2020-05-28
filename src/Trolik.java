
public class Trolik extends Jarmu implements Elektromos {

	
	public Trolik(boolean csuklos, boolean alacsonyPadlos, double uzemeltetesiKoltseg, int uloHelyekSzama,
			boolean bicikliSzallitasiLehetoseg, int rokkantHelyekSzama, boolean javitasSzukseges,
			String uzemanyagTipus) {
		super(csuklos, alacsonyPadlos, uzemeltetesiKoltseg, uloHelyekSzama, bicikliSzallitasiLehetoseg, rokkantHelyekSzama,
				javitasSzukseges, uzemanyagTipus);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean haladhatItt(boolean vanEAramSzedoItt) {
		
		return true;
	}
	public static void main(String[] args) {
		
		beolvas("trolik.txt");
		
	}	
}
