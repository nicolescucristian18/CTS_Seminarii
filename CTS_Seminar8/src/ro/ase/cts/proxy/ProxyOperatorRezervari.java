package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements OperatorRezervare{
	private OperatorRezervari operatorRezervari;
	private int nrMinimPersoane;
	

	public ProxyOperatorRezervari(OperatorRezervari operatorRezervari, int nrMinimPersoane) {
		super();
		this.operatorRezervari = operatorRezervari;
		this.nrMinimPersoane = nrMinimPersoane;
	}



	@Override
	public void realizeazaRezervare(int nrPersoane) {
		if(nrPersoane >= this.nrMinimPersoane) {
			this.operatorRezervari.realizeazaRezervare(nrPersoane);
		}
		else {
			System.out.println("Va rugam veniti la restaurant fara rezervare");
		}
	}
}
