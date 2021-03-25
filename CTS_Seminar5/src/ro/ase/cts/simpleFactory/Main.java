package ro.ase.cts.simpleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			PersonalSpital personalSpital1;
			PersonalSpital personalSpital2;
			personalSpital1=FactoryPersonal.createPersonal(TipPersonal.Medic, "Ion", 1500);
			personalSpital2=FactoryPersonal.createPersonal(TipPersonal.Asistent, "Gigel", 1000);
			System.out.println(personalSpital1.toString());
			System.out.println(personalSpital2.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
