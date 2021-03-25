package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		Reteta reteta1 = new Reteta("Apa oxigenata", 50);
		Reteta reteta2= (Reteta)reteta1.copiaza();
		System.out.println(reteta1.toString());
		System.out.println(reteta2.toString());
	}

}
