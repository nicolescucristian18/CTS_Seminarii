package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<Comanda> listaComenzi;
	
	public ManagerComenzi() {
		this.listaComenzi = new ArrayList<>();
	}
	
	public void invoca(Comanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(listaComenzi.size()>0) {
			listaComenzi.get(0).executa();
			listaComenzi.remove(0);
		}
	}
}
