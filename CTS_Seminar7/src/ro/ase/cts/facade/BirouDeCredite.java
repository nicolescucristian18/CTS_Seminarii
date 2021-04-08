package ro.ase.cts.facade;

public class BirouDeCredite {
	public static boolean areCreante(Persoana persoana) {
		return Integer.parseInt(""+persoana.getCnp().charAt(9))%2==0;
	}
}
