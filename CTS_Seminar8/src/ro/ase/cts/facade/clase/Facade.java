package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean potAsezaLaMasa(Masa masa) {
		GestionarMese gestionarMese = new GestionarMese();
		Picolo picolo = new Picolo();
		if(gestionarMese.esteMasaLibera(masa.getCod())) {
			if(picolo.esteMasaDebarasata(masa.getCod())) {
				if(picolo.areServetele(masa.getCod())) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
