package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements CompositeAbstract{
	private String denumire;
	private List<CompositeAbstract> optiuni;
	@Override
	
	public void afiseazaDescriere() {
		System.out.println("Sectiunea "+this.denumire);
		for(CompositeAbstract compositeAbstract: this.optiuni) {
			compositeAbstract.afiseazaDescriere();
		}
		
	}
	@Override
	public void addComponenta(CompositeAbstract compositeAbstract) {
		this.optiuni.add(compositeAbstract);
		
	}
	@Override
	public void stergeComponenta(CompositeAbstract compositeAbstract) {
		this.optiuni.remove(compositeAbstract);
		
	}
	@Override
	public CompositeAbstract getComponenta(int index) {
		if(index>0 && index<this.optiuni.size()) {
			return this.optiuni.get(index);
		}
		return null;
	}
	public Sectiune(String denumire) {
		super();
		this.denumire = denumire;
		this.optiuni = new ArrayList<>();
	}
	
	
}
