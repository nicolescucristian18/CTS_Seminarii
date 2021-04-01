package ro.ase.cts.builderv2;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder builder = new RezervareBuilder().setCodRezervare(1).setAreBauturaRacoritoare(true);
		Rezervare rezervare = builder.build();
		builder.setCodRezervare(2).setAreManareInclusa(true);
		Rezervare rezervare2= builder.build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		RezervareBuilder builder2 = new RezervareBuilder().setAreScaunErgonomic(true).setCodRezervare(3);
		Rezervare rezervare3 = builder2.build();
		System.out.println(rezervare3.toString());
	}

}
