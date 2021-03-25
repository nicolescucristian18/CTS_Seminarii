package ro.ase.cts.simpleFactory;

public class FactoryPersonal {
	public static PersonalSpital createPersonal(TipPersonal tip, String nume, float salariu) throws Exception {
		switch(tip) {
		case Medic: return new Medic(nume,salariu);
		case Asistent: return new Asistent(nume,salariu);
		case Brancardier: return new Brancardier(nume, salariu);
		default: throw new Exception();
		}
	}
}
