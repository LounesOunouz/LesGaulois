package personnages;

import Objets.Chaudron;

public class Druide {
	private int force;
	private String nom;
	Chaudron chaudron = new Chaudron();

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public Druide(int force, String nom) {
		super();
		this.force = force;
		this.nom = nom;
	//	this.chaudron = chaudron;
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le Druide " + nom + ":";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("j'ai concocté" + quantite + "doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if (contientPotion) {
			if (nom.equals("Obélix")) {
				parler("Non, " + nomGaulois + " Non!...Et tu sais très bien! ");
			} else {
				int forcePotion = chaudron.prndrelouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + "un peu de potion magique ");
				
			}
		}else {
			parler("Desolé " + nomGaulois + "il n'y a plus une seule goutte de potion");
		}

	}
}
