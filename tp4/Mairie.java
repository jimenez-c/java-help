import java.util.*;

public class Mairie {
	private String nomCommune;
	private String nomMaire;
	private int nbHabitants;
	private ArrayList batiments;

	public Mairie(String nomCommune, String nomMaire, int nbHabitants) {
		this.nomMaire = nomMaire;
		this.nomCommune = nomCommune;
		this.nbHabitants = nbHabitants;
		this.batiments = new ArrayList();
	}

	public void ajouterBatiment(Batiment batiment) {
		batiments.add(batiment);
	}

	public double calculerImpots() {
		double total = 0;
		for(int i = 0; i < batiments.size(); i++) {
			total += ((Batiment) batiments.get(i)).calculerImpots();
		}
		return total;
	}

	public Batiment trouverMax() {
		if(batiments.isEmpty()) {
			return null;
		}

		double max = ((Batiment) batiments.get(0)).calculerImpots();
		Batiment batMax = null;

		for(int i = 0; i < batiments.size(); i++) {
			Batiment batiment = ((Batiment) batiments.get(i));
			double impots = batiment.calculerImpots();
			if(impots > max) {
				max = impots;
				batMax = batiment;
			}
		}
		return batMax;
	}
}