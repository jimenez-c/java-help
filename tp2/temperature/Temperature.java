public class Temperature {
	private double[] tab;
	private int nb = 0;

	public Temperature() {
		do {
			System.out.println("Combien de températures voulez-vous saisir ?");
			nb = Lecture.lireInt();
			if(nb >= 0) {
				tab = new double[nb];
			}
			else {
				System.out.println("Veuillez saisir un nombre supérieur à 0");
			}
		} while(nb <= 0);

		for(int i = 0; i < nb; i++) {
			System.out.println("Saisissez un nombre : ");
			tab[i] = Lecture.lireDouble();
		}
	}

	public Temperature(double[] tab) {
		double[] copie = new double[tab.length];

		for(int i =0; i < tab.length; i++) {
			copie[i] = tab[i];
		}
		this.tab = copie;
		nb = tab.length;
	}

	public String toString() {
		String retour = "Températures : \n";

		for(int i =0; i < tab.length; i++) {
			retour += "i\t=>\t" + tab[i] + "\n";
		}

		return retour;
	}

	public double moyenne() {
		double somme = 0;
		for(int i = 0; i < nb; i++) {
			somme += tab[i];
		}
		return somme / nb;
	}

	public int getMinIndex() {
		double min = tab[0];
		int indiceMin = 0;
		for(int i = 0; i < nb; i++) {
			if(tab[i] < min) {
				min = tab[i];
				indiceMin = i;
			}
		}
		return indiceMin;
	}

	public double getMin() {
		return tab[getMinIndex()];
	}

	public int getMaxIndex() {
		double max = tab[0];
		int indiceMax = 0;

		for(int i = 0; i < nb; i++) {
			if(tab[i] > max) {
				max = tab[i];
				indiceMax = i;
			}
		}
		return indiceMax;
	}

	public double getMax() {
		return tab[getMaxIndex()];
	}

	public int nbTempInf(double temp) {
		int somme = 0;
		for(int i =0; i < nb; i++) {
			if(tab[i] < temp) {
				somme++;
			}
		}
		return somme;
	}

	public double getTemperature(int i) {
		return tab[i];
	}

	public void setTemperature(int i, double temp) {
		tab[i] = temp;
	}

	public double[] getTab() {
		return tab;
	}
}