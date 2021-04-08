package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract{
	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	@Override
	public void realizeazaPlataOnline() {
		cardAbstract.realizeazaPlataOnline();
		
	}

	@Override
	public void realizeazaPlataCash() {
		cardAbstract.realizeazaPlataCash();
		
	}

	@Override
	public String getDetinator() {
		return cardAbstract.getDetinator();
	}

	public abstract void realizeazaPlataContactless();
}
