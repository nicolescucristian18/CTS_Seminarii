package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantata=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	public static int getSumaFinantata() {
		return sumaFinantata;
	}
	public static void setSumaFinantata(int sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}
	@Override
	public String toString() {
		return "Elev: "+super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore+"]";
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public void afiseazaSumaFinantata() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+getSumaFinantata()+" Euro/zi in proiect.");
	}
	
}
