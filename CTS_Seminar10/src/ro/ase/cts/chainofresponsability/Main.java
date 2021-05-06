package ro.ase.cts.chainofresponsability;

public class Main {

	public static void main(String[] args) {
		Handler contCredit = new ContDeCredit(5000);
		Handler contCurent = new ContCurent(2000);
		Handler contEconomii = new ContDeEconomii(2100);
		Handler refuzaTranzactia = new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		contCurent.realizeazaPlata(10000);
	}
}
