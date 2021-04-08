package ro.ase.cts.decorator;

public class Main {

	public static void main(String[] args) {
		CardAbstract cardAbstract = new Card("Gigel");
		cardAbstract.realizeazaPlataCash();
		cardAbstract.realizeazaPlataOnline();
		
		DecoratorAbstract decoratorAbstract = new DecoratorContactless(cardAbstract);
		decoratorAbstract.realizeazaPlataContactless();
		decoratorAbstract.realizeazaPlataCash();
		decoratorAbstract.realizeazaPlataOnline();

	}

}
