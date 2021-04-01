package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder {
	private Rezervare rezervare;

	public RezervareBuilder() {
		rezervare=new Rezervare(0, false, false, false, false, "rock");
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}
	
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreManareInclusa(areMancareInclusa);
		return this;
	}
	
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	
	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacorituare) {
		rezervare.setAreBauturaRacoritoare(areBauturaRacorituare);
		return this;
	}
	
	public RezervareBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		rezervare.setAreMuzicaAmbientalaPersonalizate(areMuzicaAmbientalaPersonalizata);
		return this;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
