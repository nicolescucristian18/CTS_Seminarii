package ro.ase.cts.template;

public class Main {

	public static void main(String[] args) {
		Spectator spectator = new Spectator("Gigel");
		spectator.intrareSpectatorStadion();
		
		SpectatorAbstract spectator2 = new Spectator("Ionel");
		spectator2.intrareSpectatorStadion();

		
		SpectatorVIP spectatorVIP = new SpectatorVIP("Mircel");
		spectatorVIP.intrareSpectatorStadion();
	}

}
