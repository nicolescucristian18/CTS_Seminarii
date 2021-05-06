package ro.ase.cts.chainofresponsability;

public abstract class Handler {
	private Handler succesor;
	private float sold;
	
	public Handler(float sold) {
		super();
		this.sold = sold;
		this.succesor = null;
	}

	public Handler getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}

	public float getSold() {
		return sold;
	}
	
	
	public void setSold(float sold) {
		this.sold = sold;
	}

	public abstract void realizeazaPlata(float suma);
}
