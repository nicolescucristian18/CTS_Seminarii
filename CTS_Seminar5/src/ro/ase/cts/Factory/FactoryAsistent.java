package ro.ase.cts.Factory;

public class FactoryAsistent implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, float salariu) {
		return new Asistent(nume, salariu);
	}

}
