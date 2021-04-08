package ro.ase.cts.adapter;

public class Main {
	
	public static void afiseazaInformatiiCredit(Creditable creditable) {
		creditable.oferaCredit();
	}

	public static void main(String[] args) {
		//Adapter obiect
		Leasing leasing = new Leasing("Gigel");
		LeasingAdapterObiect adapterObiect = new LeasingAdapterObiect(leasing);
		afiseazaInformatiiCredit(adapterObiect);
		
		//Adapter clasa
		LeasingAdapterClass adapterClass = new LeasingAdapterClass("Costel");
		afiseazaInformatiiCredit(adapterClass);

	}

}
