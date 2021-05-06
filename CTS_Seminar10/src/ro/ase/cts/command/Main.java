package ro.ase.cts.command;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Cristi", 0);
		managerComenzi.invoca(new ComandaConstituire(contBancar, 1000));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 200));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaRetragere(contBancar, 500));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

	}

}
