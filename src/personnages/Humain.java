package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire;

	public Humain(String nom, String boisson, int argent) {
		assert argent >= 0;
		this.nom = nom;
		boissonFav = boisson;
		this.argent = argent;
		memoire = new Humain[30];
		nbConnaissance = 0;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}

	// La méthode n'est utilisé que par la classe Humain, sa visibilité doit être
	// privé (changer à protected à partir de 2.1.a )
	protected void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! je m'apelle " + getNom() + " et j'aime boire du " + getBoissonFav() + ".");
	}

	public void boire() {
		parler("Mmmm un bon verre de " + getBoissonFav() + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("J'ai " + getArgent() + " en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		} else {
			parler("J'ai " + getArgent() + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
	}

	protected void gagnerArgent(int gain) {// passer à protected à partir de 2.1.a
		argent += gain;// bizarre
	}

	protected void perdreArgent(int perte) {// passer à protected à partir de 2.1.a
		argent -= perte;// bizarre
	}

	private void memoriser(Humain humain) {
		memoire[nbConnaissance % 30] = humain;
		nbConnaissance += 1;
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.direBonjour();
		autreHumain.memoriser(this);
		memoriser(autreHumain);
	}

	public void listerConnaissance() {
		String texte = "";
		for (int i = 0; i < (nbConnaissance % 30); i++) {
			texte += memoire[nbConnaissance] + ", ";
		}
		if (nbConnaissance != 0) {
			texte = texte.substring(0, texte.length() - 2);// supprime le dernier ", "
		}
		parler("Je connais beaucoup de monde dont : " + texte);
	}

}
