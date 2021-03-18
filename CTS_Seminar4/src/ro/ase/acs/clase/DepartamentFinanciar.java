package ro.ase.acs.clase;

public class DepartamentFinanciar {
	private int nrAngajati;
	private String director;
	private double salariuBaza;
	
	private static DepartamentFinanciar departamentFinanciar=null; 
	
	private DepartamentFinanciar(int nrAngajati, String director, double salariuBaza) {
		this.nrAngajati = nrAngajati;
		this.director = director;
		this.salariuBaza = salariuBaza;
	}

	public static DepartamentFinanciar getInstance(int nrAngajati, String director, double salariuBaza) {
		if(departamentFinanciar==null) {
			departamentFinanciar=new DepartamentFinanciar(nrAngajati,director,salariuBaza);
		}
		return departamentFinanciar;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuBaza="
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
