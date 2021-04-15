package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Main {

	public static void main(String[] args) {
		/*GestionarMese gestionarMese = new GestionarMese();
		Picolo picolo = new Picolo();
		Masa masa = new Masa(12, 4);
		
		if(gestionarMese.esteMasaLibera(masa.getCod())) {
			if(picolo.esteMasaDebarasata(masa.getCod())) {
				if(picolo.areServetele(masa.getCod())) {
					System.out.println("Poftiti la masa cu codul: "+masa.getCod());
				}
				else {
					System.out.println("Mai asteptati putin");
				}
			}
			else {
				System.out.println("Mai asteptati putin");
			}
		}
		else {
			System.out.println("Mai asteptati putin");
		}*/

		Masa masa = new Masa(12, 4);
		if(Facade.potAsezaLaMasa(masa)==true) {
			System.out.println("Poftiti la masa cu codul: "+masa.getCod());
		}
		else {
			System.out.println("Mai asteptati putin");
		}
	}

}
