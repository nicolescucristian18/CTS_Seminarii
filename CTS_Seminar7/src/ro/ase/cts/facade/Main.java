package ro.ase.cts.facade;

public class Main {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("Ana", "2995485642209");
		Persoana persoana2 = new Persoana("Gigel", "1995485642214");
		
		//fara facade
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmaritDePolitie(persoana)) {
				if(BirouDeCredite.areCreante(persoana)) {
					System.out.println(persoana.getNume()+" primeste credit");
				}
				else {
					System.out.println(persoana.getNume()+" nu primeste credit");
				}
			}
			else {
				System.out.println(persoana.getNume()+" nu primeste credit");
			}
		}
		else {
			System.out.println(persoana.getNume()+" nu primeste credit");
		}

		
		//cu facade
		if(Facade.esteApt(persoana2)) {
			System.out.println(persoana2.getNume()+" primeste credit");
		}
		else {
			System.out.println(persoana2.getNume()+" nu primeste credit");
		}
	}

}
