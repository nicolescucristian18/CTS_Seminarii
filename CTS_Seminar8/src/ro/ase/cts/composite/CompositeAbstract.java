package ro.ase.cts.composite;

public interface CompositeAbstract {
	public void afiseazaDescriere();
	public void addComponenta(CompositeAbstract compositeAbstract);
	public void stergeComponenta(CompositeAbstract compositeAbstract);
	public CompositeAbstract getComponenta(int index);
}
