package ro.ase.cts.command;

public class ContBancar {
	private String detinator;
	private float sold;
	
	public ContBancar(String detinator, float sold) {
		super();
		this.detinator = detinator;
		this.sold = sold;
	}
	
	
	
	public void setDetinator(String detinator) {
		this.detinator = detinator;
	}



	public void setSold(float sold) {
		this.sold = sold;
	}



	public void constituire(float suma) {
		this.sold = suma;
		System.out.println("S-a constituit contul pe numele "+this.detinator+" cu suma de "+this.sold);;
	}
	
	public void retragere(float suma) {
		if(this.sold >= suma) {
			this.sold = this.sold -suma;
			System.out.println("Retragere suma de "+ suma);
		}
		else {
			System.out.println("Sold insuficient");
		}
	}
	
	public void depunere(float suma) {
		this.sold +=suma;
		System.out.println("S-a depus suma de "+suma);;
	}
}
