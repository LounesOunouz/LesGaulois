package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le Gaulois " + nom + ":";

	}

	/*
	 * @Override public String toString() { return "Gaulois [nom=" + nom +
	 * ", force=" + force + "]"; }
	 */
	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		//String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		//int forceCoup=force / 3 ;
		force=force*effetPotion;
		romain.recevoirCoup(force/3);
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

	public void boirePotion(int forcePotion) {
		// TODO Auto-generated method stub
		this.effetPotion=forcePotion;
		
	}

}
