package personnages;

import objets.Equipement;

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

//	public void recevoirCoup(int forceCoup) {
//		// TODO Auto-generated method stub
//		this.force = this.force - forceCoup;
//		if (force < 1) {
//			this.force = 0;
//			parler("J'abanndonne !");
//
//		} else {
//
//			parler("Aïe");
//		}
//
//	}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force == 0) {
			parler("Aïe");
		}

		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");

		}
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}

			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		// TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {

				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
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
		default:
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
