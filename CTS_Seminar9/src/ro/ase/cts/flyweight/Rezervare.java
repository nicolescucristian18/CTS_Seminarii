package ro.ase.cts.flyweight;

public class Rezervare {
	private int numarMasa;
	private int nrPersoane;
	private String oraRezervata;
	public Rezervare(int numarMasa, int nrPersoane, String oraRezervata) {
		super();
		this.numarMasa = numarMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervata = oraRezervata;
	}
	@Override
	public String toString() {
		return "Rezervare [numarMasa=" + numarMasa + ", nrPersoane=" + nrPersoane + ", oraRezervata=" + oraRezervata
				+ "]";
	}
	
	
}
