import java.util.*;

public class Diplome {
	private String intitule;
	private ArrayList listeEtudiant;
	private int nbActuelEtudiants;
	private int nbMaxEtudiants;
	private int nbMaxNotes;

	public Diplome(String intitule, int nbMaxEtudiants, int nbMaxNotes) {
		this.intitule = intitule;
		this.nbMaxEtudiants = nbMaxEtudiants;
		this.nbMaxNotes = nbMaxNotes;

		this.nbActuelEtudiants = 0;
		this.listeEtudiant = new ArrayList();
	}

	public boolean ajoutEtudiant(Etudiant e) {
		listeEtudiant.add(e);
		nbActuelEtudiants++;
		return true;
	}

	public String toString() {
		String retour = "";
		retour += "Le diplôme intitulé " + intitule + " est composé par les étudiants suivants : \n";
		return retour + listeEtudiant();
	}

	public String listeEtudiant() {
		String etudiants = "";
		for(int i=0; i < listeEtudiant.size(); i++) {
			etudiants += listeEtudiant.get(i);
		}
		return etudiants;
	}

	public String getIntitule() {
		return intitule;
	}

	public int getNbMaxNotes() {
		return nbMaxNotes;
	}
}