package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare = new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).build();
		Rezervare rezervare2= new RezervareBuilder().setAreMancareInclusa(true).setCodRezervare(2).build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		RezervareBuilder builder= new RezervareBuilder().setAreBauturaRacoritoare(true);
		Rezervare rezervare3 = builder.build();
		Rezervare rezervare4 = builder.setCodRezervare(100).build();
		rezervare3.setCodRezervare(200);
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
	}

}
