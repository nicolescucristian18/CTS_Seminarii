package ro.ase.cts.builder;

public class Rezervare {
	private int codRezervare;
	private boolean areManareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaPersonalizate;
	private String genMuzica;
	
	public Rezervare(int codRezervare, boolean areManareInclusa, boolean areScaunErgonomic,
			boolean areBauturaRacoritoare, boolean areMuzicaAmbientalaPersonalizate, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areManareInclusa = areManareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		this.areMuzicaAmbientalaPersonalizate = areMuzicaAmbientalaPersonalizate;
		this.genMuzica = genMuzica;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	public void setAreManareInclusa(boolean areManareInclusa) {
		this.areManareInclusa = areManareInclusa;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
	}

	public void setAreMuzicaAmbientalaPersonalizate(boolean areMuzicaAmbientalaPersonalizate) {
		this.areMuzicaAmbientalaPersonalizate = areMuzicaAmbientalaPersonalizate;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areManareInclusa=" + areManareInclusa
				+ ", areScaunErgonomic=" + areScaunErgonomic + ", areBauturaRacoritoare=" + areBauturaRacoritoare
				+ ", areMuzicaAmbientalaPersonalizate=" + areMuzicaAmbientalaPersonalizate + ", genMuzica=" + genMuzica
				+ "]";
	}
	
	
}
