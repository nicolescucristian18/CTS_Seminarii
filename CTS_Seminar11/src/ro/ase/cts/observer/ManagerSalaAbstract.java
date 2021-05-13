package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
	public List<Observer> clientiAbonati;
	
	
	public ManagerSalaAbstract() {
		super();
		this.clientiAbonati = new ArrayList<>();
	}


	public void adaugaAbonat(Observer abonat) {
		this.clientiAbonati.add(abonat);
	}
	
	public void stergeAbonat(Observer abonat) {
		this.clientiAbonati.remove(abonat);
	}
	
	public void trimiteNotificare(String mesaj) {
		for(Observer client : clientiAbonati) {
			client.primesteMesaj(mesaj);
		}
	}
}
