public class Element {
	private double valeur;
	private Element suivant;

	public Element(double valeur) {
		this.valeur = valeur;
		suivant = null;
	}

	public double getValeur() {
		return valeur;
	}

	public Element getSuivant() {
		return suivant;
	}

	public void setSuivant(Element suivant) {
		this.suivant = suivant;
	}

	public String toString() {
		return "" + valeur;
	}
}