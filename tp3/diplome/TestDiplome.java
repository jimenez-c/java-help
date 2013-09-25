import java.util.*;

public class TestDiplome {
	public static void main(String[] args) {
		Diplome dnr = new Diplome("DNR2I", 20, 40);

		Etudiant cyril = new Etudiant("Jimenez", "Cyril", "1991", dnr);
		Etudiant alizee = new Etudiant("Tiercery", "Alizée", "1991", dnr);

		double[] mesNotes = {15, 10, 9.5, 4, 12};
		cyril.ajoutNote(mesNotes);

		dnr.ajoutEtudiant(cyril);
		dnr.ajoutEtudiant(alizee);
		System.out.println(dnr);
		//System.out.println(cyril);
	}
}