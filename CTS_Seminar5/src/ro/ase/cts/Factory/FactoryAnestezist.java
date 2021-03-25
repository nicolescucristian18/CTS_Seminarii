package ro.ase.cts.Factory;

public class FactoryAnestezist implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, float salariu) {
		return new Anestezist(nume, salariu);
	}

}
