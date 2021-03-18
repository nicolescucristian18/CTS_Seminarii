package ro.ase.acs.main;

import ro.ase.acs.clase.DepartamentFinanciar;
import ro.ase.acs.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		
		DepartamentFinanciarEager departamentFinanciarEager1= DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager departamentFinanciarEager2= DepartamentFinanciarEager.getInstance();
		System.out.println(departamentFinanciarEager1.toString());
		System.out.println(departamentFinanciarEager2.toString());
		
		departamentFinanciarEager1.setDirector("Gigel");
		departamentFinanciarEager2.setNrAngajati(20);
		System.out.println(departamentFinanciarEager1.toString());
		System.out.println(departamentFinanciarEager2.toString());
		
		DepartamentFinanciar departamentFinanciar1=DepartamentFinanciar.getInstance(20, "Popescu", 2500);
		DepartamentFinanciar departamentFinanciar2=DepartamentFinanciar.getInstance(30, "Antonescu", 2700);
		
		System.out.println(departamentFinanciar1.toString());
		System.out.println(departamentFinanciar2.toString());
	}

}
