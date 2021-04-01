package ro.ase.cts.prototype;

public class Bilet implements AbstractPrototype{
	private int codBilet;
	private String echipaA;
	private String echipaB;
	private String dataMeciului;
	private String loc;
	
	public Bilet(int codBilet, String echipaA, String echipaB, String dataMeciului, String loc) {
		super();
		this.codBilet = codBilet;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.dataMeciului = dataMeciului;
		this.loc = loc;
	}

	private Bilet() {
		super();
	}

	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Bilet [codBilet=" + codBilet + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", dataMeciului="
				+ dataMeciului + ", loc=" + loc + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		Bilet bilet =new Bilet();
		bilet.codBilet = this.codBilet;
		bilet.dataMeciului = this.dataMeciului;
		bilet.echipaA = this.echipaA;
		bilet.echipaB = this.echipaB;
		bilet.loc = this.loc;
		return bilet;
	}
	
	
}
