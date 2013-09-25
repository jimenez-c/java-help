public class Identite {
	private String nom;
	private String prenom;
	private String anneeNaissance;

	public Identite() {
		nom = "Toto";
		prenom = "Test";
		anneeNaissance = "1991";
	}

	public Identite(String nom, String prenom, String anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAnneeNaissance() {
		return anneeNaissance;
	}

	public String toString() {
		return prenom + " " + nom;
	}
}