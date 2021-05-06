package ro.ase.cts.command;

public class ComandaDepunere extends Comanda{

	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.contBancar.depunere(super.suma);
		
	}

}
