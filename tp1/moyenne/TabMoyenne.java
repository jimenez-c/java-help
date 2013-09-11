public class TabMoyenne {
	public static void main(String[] args) {
		double[] tab = new double[50];
		int length = 0;
		int continuer = 1;
		
		while(continuer == 1) {
			System.out.println("Saisir un chiffre");
			tab[length] = Lecture.lireDouble();
			length++;
			
			System.out.println("Continuer ?");
			continuer = Lecture.lireInt();
		}
		
		double moyenne;
		double somme = 0;
		
		// parcours du tableau pour calculer la moyenne
		for(int i = 0; i < length; i++) {
			somme += tab[i];
		}
		
		moyenne = somme / length;
		System.out.println("La moyenne de tout ce que vous avez rentré est " + moyenne);
		
		double mini = 200;
		for(int i=0; i < length; i++) {
			if(tab[i] < mini) {
				mini = tab[i];
			}
		}
		System.out.println("mini : " + mini);
		
	}
}
