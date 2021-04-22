package ro.ase.cts.flyweight;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(1, 4, "10:00");
		Rezervare rezervare2 = new Rezervare(2, 3, "11:00");
		Rezervare rezervare3 = new Rezervare(3, 2, "11:20");
		
		FlyweightFactory factory = new FlyweightFactory();
		factory.getClient("0712345").printeazaRezervare(rezervare);
		factory.getClient("0754321").printeazaRezervare(rezervare2);
		factory.getClient("0712345").printeazaRezervare(rezervare3);
	}

}
