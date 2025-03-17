package personnages;

import Objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	public String prendreParole() {
		return "Le romain " + nom + ": ";
	}

	public void recevoirCoup(int forceCoup) {
		// TODO Auto-generated method stub
		this.force = this.force - forceCoup;
		if (force < 1) {
			this.force = 0;
			parler("J'abanndonne !");

		} else {

			parler("Aïe");
		}

	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement);
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + getNom() + " posséde deja un " + equipement);
			} else {
				equipements[nbEquipement] = equipement;
				nbEquipement++;
				System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement);
			}
			break;
		case 2:
			System.out.println("Le soldat " + getNom() + " est déja bien protégé!");
			break;
		}
	}

	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 0);
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.CASQUE);
	}
}
