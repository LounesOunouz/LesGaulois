package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public boolean resterPotion() {
		if (quantitePotion != 0) {
			return true;

		} else {
			return false;
		}

	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;

	}

	public int prndrelouche() {
		// TODO Auto-generated method stub
		if (resterPotion()) {
			quantitePotion--;

		} else {
			forcePotion = forcePotion - 1;
		}
		return forcePotion;
	}

}
