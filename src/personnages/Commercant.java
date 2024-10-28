package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		// Solution 1.a modifier la visibilité de l'attribut argent à protected
		// Solution 2.a modifier la visiblité des méthodes gagner et perdre argent à
		// protected, cette méthode sera choisi.
		parler("j'ai tout perdu ! Le monde est vraiment trop injuste ! ");
		int sommePerdu = getArgent();
		perdreArgent(sommePerdu);
		return sommePerdu;
	}

	public void recevoir(int argent) {
		assert argent > 0;
		parler(argent + " sous ! Je te remercie généreux donateur !");
		gagnerArgent(argent);
	}

}
