package ro.ase.cts.Factory;

public class Main {
	
	public static void printeazaPersonalSpital(FactoryPersonal factoryPersonal, String nume, float salariu) {
		PersonalSpital personalSpital = factoryPersonal.createPersonal(nume, salariu);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryPersonal factoryPersonal= new FactoryAsistent();
		printeazaPersonalSpital(factoryPersonal, "Ion", 1200);
	}

}
