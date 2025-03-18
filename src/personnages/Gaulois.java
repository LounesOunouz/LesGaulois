package personnages;

import objets.Equipement;

public class Gaulois {
	private String nom;
	// private int force;
	private int effetPotion = 1;
	private Village village;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

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

	@Override
	public String toString() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void boirePotion(int forcePotion) {
		// TODO Auto-generated method stub
		this.effetPotion = forcePotion;

	}

//	public void frapper(Romain romain) {
//
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//
//		int forceCoup = this.force;
//		forceCoup = forceCoup * effetPotion;
//		forceCoup = forceCoup / 3;
//
//		romain.recevoirCoup(forceCoup);
//		effetPotion--;
//		if (effetPotion < 1) {
//			effetPotion = 1;
//
//		}
//
//	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophes = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophes != null && i < trophes.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophes[i];
		}
		// return;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

}
