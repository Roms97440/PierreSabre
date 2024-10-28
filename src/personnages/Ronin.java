package personnages;

public class Ronin extends Humain {
	int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prends ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
}
