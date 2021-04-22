package ro.ase.cts.strategy;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Popescu");
		client.plateste(1500);
		client.setModalitatePlata(new Cash());
		client.plateste(2000);
	}

}
