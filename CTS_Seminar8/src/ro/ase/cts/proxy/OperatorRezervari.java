package ro.ase.cts.proxy;

public class OperatorRezervari implements OperatorRezervare{

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		System.out.println("A fost realizata rezervarea pentru "+nrPersoane+" persoane");
		
	}
	
}
