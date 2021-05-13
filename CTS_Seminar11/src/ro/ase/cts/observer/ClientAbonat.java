package ro.ase.cts.observer;

public class ClientAbonat implements Observer{
	private String nume;
	
	
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(this.nume+" a primit mesajul "+mesaj);
		
	}
	
}
