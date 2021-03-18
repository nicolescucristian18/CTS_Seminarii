package ro.ase.acs.clase;



public class Banca {
	private String nume;
	private int nrClienti;
	private float fondCriza;
	
	private static Banca banca=null;
	
	private Banca(String nume, int nrClienti, float fondCriza) {
		this.nume = nume;
		this.nrClienti = nrClienti;
		this.fondCriza = fondCriza;
	}

	public static synchronized Banca getInstance(String nume, int nrClienti, float fondCriza) {
		if(banca==null) {
			banca=new Banca(nume,nrClienti,fondCriza);
		}
		return banca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNrClienti(int nrClienti) {
		this.nrClienti = nrClienti;
	}

	public void setFondCriza(float fondCriza) {
		this.fondCriza = fondCriza;
	}

	@Override
	public String toString() {
		return "Banca [nume=" + nume + ", nrClienti=" + nrClienti + ", fondCriza=" + fondCriza + "]";
	}
	
	
}
