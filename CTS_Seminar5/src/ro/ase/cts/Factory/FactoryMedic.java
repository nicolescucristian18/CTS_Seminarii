package ro.ase.cts.Factory;

public class FactoryMedic implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, float salariu) {
		return new Medic(nume, salariu);
	}

}
