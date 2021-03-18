package ro.ase.acs.clase;

public class DepartamentFinanciarEager {
	private int nrAngajati;
	private String director;
	private double salariuBaza;
	
	private static DepartamentFinanciarEager departamentFinanciarEager=new DepartamentFinanciarEager(10,"Popescu",3000); 
	
	private DepartamentFinanciarEager(int nrAngajati, String director, double salariuBaza) {
		this.nrAngajati = nrAngajati;
		this.director = director;
		this.salariuBaza = salariuBaza;
	}

	public static DepartamentFinanciarEager getInstance() {
		return departamentFinanciarEager;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuBaza="
				+ salariuBaza + "]";
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuBaza(double salariuBaza) {
		this.salariuBaza = salariuBaza;
	}

	
}
