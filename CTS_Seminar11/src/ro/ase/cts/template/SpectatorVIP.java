package ro.ase.cts.template;

public class SpectatorVIP extends SpectatorAbstract{
	public String nume;
	
	

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(this.nume+" se prezinta la poarta");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.nume+" prezinta biletul VIP");
		
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume+" va fi verificat corporal");
		
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(this.nume+" intra pe tribuna VIP");
		
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(this.nume+" ocupa loc in loja");
		
	}

}
