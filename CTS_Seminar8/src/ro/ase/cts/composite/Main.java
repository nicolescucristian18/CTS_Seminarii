package ro.ase.cts.composite;

public class Main {

	public static void main(String[] args) {
		Sectiune sectiuneBauturi = new Sectiune("Bauturi");
		Sectiune sectiuneDeseert = new Sectiune("Desert");
		Item itemFrappe = new Item("Frappe");
		Item itemCafea = new Item("Cafea");
		Item itemEcler = new Item("Ecler");
		sectiuneBauturi.addComponenta(itemCafea);
		sectiuneBauturi.addComponenta(itemFrappe);
		sectiuneDeseert.addComponenta(itemEcler);
		Sectiune meniu = new Sectiune("Meniu");
		meniu.addComponenta(sectiuneDeseert);
		meniu.addComponenta(sectiuneBauturi);
		meniu.afiseazaDescriere();
		sectiuneBauturi.stergeComponenta(itemFrappe);
		sectiuneDeseert.addComponenta(itemFrappe);
		meniu.afiseazaDescriere();
	}

}
