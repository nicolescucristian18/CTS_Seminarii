package ro.ase.cts.facade;

public class Facade {
	public static boolean esteApt(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmaritDePolitie(persoana)) {
				if(BirouDeCredite.areCreante(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
