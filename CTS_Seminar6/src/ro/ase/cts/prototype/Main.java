package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		ContClient client = new ContClient("Gigel", 20);
		ContClient client2 = (ContClient) client.copiaza();
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		Bilet bilet = new Bilet(0, "Arsenal", "Barcelona", "1 Martie", "1");
		Bilet bilet2 = new Bilet(1, "EchipaC", "EchipaD", "2 Martie", "2");
		Bilet bilet3 = (Bilet) bilet.copiaza();
		bilet3.setCodBilet(2);
		bilet3.setLoc("1F");
		Bilet bilet4 = (Bilet) bilet.copiaza();
		bilet4.setCodBilet(3);
		bilet4.setLoc("2F");
		
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());
	}

}
