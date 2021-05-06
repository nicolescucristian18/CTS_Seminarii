package ro.ase.cts.chainofresponsability;

public class RefuzaTranzactia extends Handler{

	public RefuzaTranzactia() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Tranzactia cu suma de "+suma+" a fost refuzata");
		
	}

}
