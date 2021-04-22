package ro.ase.cts.strategy;

public class Client {
	private String nume;
	private ModalitatePlata modalitatePlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modalitatePlata = new Card();
	}
	
	public void plateste(double sumaPlatita) {
		System.out.println("Clientul "+this.nume+" are de platit suma de "+sumaPlatita);
		this.modalitatePlata.plateste(sumaPlatita);
	}

	public void setModalitatePlata(ModalitatePlata modalitatePlata) {
		this.modalitatePlata = modalitatePlata;
	}
	
	
}
