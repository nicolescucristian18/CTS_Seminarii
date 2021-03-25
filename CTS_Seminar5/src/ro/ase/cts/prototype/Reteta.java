package ro.ase.cts.prototype;

public class Reteta implements RetetaMedicament{
	private String solutie;
	private float cantitate;
	
	private Reteta() {
		super();
	}

	public String getSolutie() {
		return solutie;
	}
	
	public float getCantitate() {
		return cantitate;
	}

	public Reteta(String solutie, float cantitate) {
		super();
		this.solutie = solutie;
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return "Reteta [solutie=" + solutie + ", cantitate=" + cantitate + "]";
	}

	public RetetaMedicament copiaza() {
		Reteta reteta = new Reteta();
		reteta.solutie=this.solutie;
		reteta.cantitate=this.cantitate;
		return reteta;
	}
	
	
}
