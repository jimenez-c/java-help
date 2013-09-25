public class Etudiant {
	private Identite identite;
	private Diplome diplomePrepare;
	private double[] notes;
	private int nbNotes;

	public Etudiant(Identite identite, Diplome diplomePrepare) {
		this.identite = identite;
		this.diplomePrepare = diplomePrepare;
		this.notes = new double[25];
	}

	public Etudiant(String nom, String prenom, String anneeNaissance, Diplome diplomePrepare) {
		this(new Identite(nom, prenom, anneeNaissance), diplomePrepare);
	}

	public boolean ajoutNote(double nouvelleNote) {
		if(nbNotes == notes.length) {
			return false;
		}
		notes[nbNotes++] = nouvelleNote;
		return true;
	}

	public boolean ajoutNote(double[] tableauNotes) {
		for(int i = 0; i < tableauNotes.length; i++) {
			this.ajoutNote(tableauNotes[i]);
		}
		return true;
	}

	public String toString() {
		return identite + "\nListe de notes : \n" + notesToString();
	}

	public String notesToString() {
		String retour = "";
		if(nbNotes == 0) {
			return "Pas encore de notes.";
		}
		else {
			for(int i = 0; i < nbNotes; i++) {
				retour += "\t" + notes[i] + "\n";
			}
		}

		return retour;
	}

	public Identite getIdentite() {
		return this.identite;
	}

}