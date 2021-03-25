package ro.ase.cts.simpleFactory;

public abstract class PersonalSpital {
	private String nume;
	private float salariu;
	
	public PersonalSpital(String nume, float salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}
	
	public String getNume() {
		return nume;
	}
	
	public float getSalariu() {
		return salariu;
	}

	@Override
	public String toString() {
		return "PersonalSpital [nume=" + nume + ", salariu=" + salariu + "]";
	}
	
	
}
