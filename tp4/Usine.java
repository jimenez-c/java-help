public class Usine extends Batiment {
	private String nomEntreprise;
	private int nbEmployes;
	private int livraisonsParJour;

	private final static double POURCENTAGE_EMPLOYES_VENANT_EN_VOITURE = 0.75;

	public Usine(String proprietaire, String adresse, double surface, String nomEntreprise) {
		super(proprietaire, adresse, surface);
		this.nomEntreprise = nomEntreprise;
	}

	public Usine() {

	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public double getFlot() {
		return POURCENTAGE_EMPLOYES_VENANT_EN_VOITURE * nbEmployes + livraisonsParJour;
	}

	public String toString() {
		return super.toString() + ", c'est une usine occupée par l'entreprise " + nomEntreprise;
	}
}