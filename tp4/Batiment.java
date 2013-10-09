public class Batiment {
	private String proprietaire;
	private String adresse;
	private double surface;

	/* const */
	private final static double PRIX_METRE_CARRE = 5;

	public Batiment() {

	}

	public Batiment(String proprietaire, String adresse, double surface) {
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;
	}

	public double calculerImpots() {
		return surface * PRIX_METRE_CARRE;
	}

	public double getSurface() {
		return surface;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public String toString() {
		return proprietaire + " possède le bâtiment à l'adresse " + adresse + ", surface de " + surface;
	}


}