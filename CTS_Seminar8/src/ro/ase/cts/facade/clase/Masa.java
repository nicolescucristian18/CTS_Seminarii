package ro.ase.cts.facade.clase;

public class Masa {
	private int cod;
	private int nrMaximPersoane;
	
	public Masa(int cod, int nrMaximPersoane) {
		super();
		this.cod = cod;
		this.nrMaximPersoane = nrMaximPersoane;
	}
	
	public int getCod() {
		return cod;
	}
	
	public int getNrMaximPersoane() {
		return nrMaximPersoane;
	}

	@Override
	public String toString() {
		return "Masa [cod=" + cod + ", nrMaximPersoane=" + nrMaximPersoane + "]";
	}
	
	
}
