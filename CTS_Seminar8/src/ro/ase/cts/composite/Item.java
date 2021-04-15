package ro.ase.cts.composite;

public class Item implements CompositeAbstract{
	private String nume;

	public Item(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Item: "+this.nume);
	}

	@Override
	public void addComponenta(CompositeAbstract compositeAbstract) {
		throw new IllegalArgumentException();
	}

	@Override
	public void stergeComponenta(CompositeAbstract compositeAbstract) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public CompositeAbstract getComponenta(int index) {
		throw new IllegalArgumentException();
	}
	
	
}
