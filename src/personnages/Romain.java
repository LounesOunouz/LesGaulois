package personnages;

public class Romain {
	private String nom;
	private int force;

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
}
