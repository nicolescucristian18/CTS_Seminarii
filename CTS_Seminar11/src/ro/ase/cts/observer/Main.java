package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {
		ClientAbonat abonat = new ClientAbonat("Gigel");
		ClientAbonat abonat2 = new ClientAbonat("Marcel");
		ClientAbonat abonat3 = new ClientAbonat("Ionel");
		
		ManagerSala managerSala = new ManagerSala();
		managerSala.adaugaAbonat(abonat);
		managerSala.adaugaAbonat(abonat2);
		managerSala.adaugaAbonat(abonat3);
		managerSala.anuntaMeci("fotbal");
		
		managerSala.stergeAbonat(abonat2);
		managerSala.anuntaMeci("handbal");
	}

}
