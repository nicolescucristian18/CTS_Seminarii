package dubluri;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent{
	private String valoareNume;
	private float medie;
	private boolean areRestanta;
	
	

	public void setValoareNume(String valoareNume) {
		this.valoareNume = valoareNume;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setAreRestanta(boolean areRestanta) {
		this.areRestanta = areRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestanta;
	}

}
