package ro.ase.cts.chainofresponsability;

public class ContCurent extends Handler{

	public ContCurent(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata din contul curent cu suma de "+suma);
			super.setSold(super.getSold() - suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}
	
}
