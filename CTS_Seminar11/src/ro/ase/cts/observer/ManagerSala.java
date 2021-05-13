package ro.ase.cts.observer;

public class ManagerSala extends ManagerSalaAbstract{
	
	
	public void anuntaMeci(String tipMeci) {
		super.trimiteNotificare("Incepe meciul de "+tipMeci);
	}
}
