package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;

	public Village(String nom, int nbVillageoisMax, Gaulois chef) {
		super();
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois g) {
		// System.out.println("Ajout de " + g.getNom() + " a l'indice "+ nbVillageois);
		villageois[nbVillageois] = g;
		nbVillageois++;
		g.setVillage(this);

	}

	public Gaulois trouverVillageois(int numVillagois) {
		if (numVillagois <= nbVillageois && numVillagois > 0) {
			return villageois[numVillagois - 1];
		} else {
			System.out.println("Il n'y a pas autant d'habitant dans notre village !");
			return null;
		}
	}

	public void afficherVillageois() {
		System.out.println(
				"Dans le village " + this.getNom() + "du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);
		}
	}

	public static void main(String[] args) {
		Gaulois chef = new Gaulois("Abaracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, chef);
		// Village tlse = new Village("Toulouse", 30, chef);
		// Gaulois gaulois = village.trouverVillageois(30);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(Asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
	}

}
