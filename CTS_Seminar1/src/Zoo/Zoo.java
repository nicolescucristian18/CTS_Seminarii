package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> lista;
	private Zookeeper keeper;
	
	public Zoo() {
		super();
		lista= new ArrayList<Animal>();
		keeper= new Zookeeper();
	}
	
	public Zoo(List<Animal> lista, Zookeeper keeper) {
		super();
		this.lista = lista;
		this.keeper = keeper;
	}
	
	public void add(Animal animal) {
		lista.add(animal);
	}
	
	public void feedAll() {
		for(Animal animal : lista) {
			keeper.feed(animal);
		}
	}

	/**
	 * @return the keeper
	 */
	public Zookeeper getKeeper() {
		return keeper;
	}

	/**
	 * @param keeper the keeper to set
	 */
	public void setKeeper(Zookeeper keeper) {
		this.keeper = keeper;
	}

	
}
