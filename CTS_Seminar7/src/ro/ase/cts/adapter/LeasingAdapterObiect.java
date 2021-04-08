package ro.ase.cts.adapter;

public class LeasingAdapterObiect implements Creditable {
	private Leasing leasing;

	@Override
	public void oferaCredit() {
		this.leasing.oferaLeasing();
		
	}

	public LeasingAdapterObiect(Leasing leasing) {
		super();
		this.leasing = leasing;
	}
	
	
}
