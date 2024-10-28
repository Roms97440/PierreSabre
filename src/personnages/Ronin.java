package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		honneur = 1;
	}

	public int getHonneur() {
		return honneur;
	}

	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prends ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}

	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand");
		int forceRonin = honneur * 2;
		int forceAdversaire = adversaire.getReputation();
		if (forceRonin >= forceAdversaire) {
			parler("Je t'ai eu petit Yakuza !");
			gagnerArgent(adversaire.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int argentPerdu = getArgent();
			adversaire.gagner(argentPerdu);
			perdreArgent(argentPerdu);

		}
	}
}
