package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		boissonFav = boisson;
		this.argent = argent;
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

	public void direBonjour() {
		System.out.println("Bonjour ! je m'apelle " + getNom() + " et j'aime boire du " + getBoissonFav() + ".");
	}

	public void boire() {
		System.out.println("Mmmm un bon verre de " + getBoissonFav() + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			System.out.println("J'ai " + getArgent() + " en poche. Je ne peux même pas m'offrir un " + bien + " à "
					+ prix + " sous");
		} else {
			System.out.println(
					"J'ai " + getArgent() + " en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
	}

	private void gagnerArgent(int gain) {
		argent += gain;// bizarre
	}

	private void perdreArgent(int perte) {
		argent -= perte;// bizarre
	}

}
