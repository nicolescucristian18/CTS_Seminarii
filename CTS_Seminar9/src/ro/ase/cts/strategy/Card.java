package ro.ase.cts.strategy;

public class Card implements ModalitatePlata{

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("A fost realizata plata cu cardul cu suma de "+sumaPlatita);
		
	}
	
}
