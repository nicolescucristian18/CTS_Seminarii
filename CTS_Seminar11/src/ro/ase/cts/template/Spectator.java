package ro.ase.cts.template;

public class Spectator extends SpectatorAbstract{
	public String nume;
	
	
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(this.nume+" s-a ajezat la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.nume+" prezinta biletul");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume+" va fi verificat corporal");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(this.nume+" intra pe stadion");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(this.nume+" ocupa locul");
		
	}
	
}
