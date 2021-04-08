package ro.ase.cts.adapter;

public class LeasingAdapterClass extends Leasing implements Creditable{

	public LeasingAdapterClass(String nume) {
		super(nume);
	}

	@Override
	public void oferaCredit() {
		super.oferaLeasing();
	}
	
	

}
