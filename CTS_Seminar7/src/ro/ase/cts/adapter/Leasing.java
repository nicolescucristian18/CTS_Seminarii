package ro.ase.cts.adapter;

public class Leasing {
	public String nume;
	
	public void oferaLeasing() {
		System.out.println("I s-a oferit un leasing lui "+nume);
	}

	public Leasing(String nume) {
		super();
		this.nume = nume;
	}
	
	

}
