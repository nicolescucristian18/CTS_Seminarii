package ro.ase.cts.proxy;

public class Main {

	public static void main(String[] args) {
		OperatorRezervari operatorRezervari = new OperatorRezervari();
		operatorRezervari.realizeazaRezervare(2);
		ProxyOperatorRezervari proxyOperatorRezervari = new ProxyOperatorRezervari(operatorRezervari, 4);
		proxyOperatorRezervari.realizeazaRezervare(2);
		proxyOperatorRezervari.realizeazaRezervare(4);
	}

}
