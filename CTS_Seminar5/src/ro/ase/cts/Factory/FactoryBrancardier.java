package ro.ase.cts.Factory;

public class FactoryBrancardier implements FactoryPersonal {

	@Override
	public PersonalSpital createPersonal(String nume, float salariu) {
		return new Brancardier(nume, salariu);
	}

}
