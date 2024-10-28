package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		reputation = 0;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens Tiens, ne serait-ce pas un faible marchand qui passe par là ?\n" + victime.getNom()
				+ " si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation += 1;
		parler("J'ai piqué les " + gain + " sous de " + victime.getNom() + " ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}

}
