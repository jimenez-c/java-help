public class TabMoyenne {
	public static void main(String[] args) {
		double[] tab = new double[50];
		int length = 0;
		double tmp = 1;
		
		while(tmp > 0) {
			if(tmp > 0) {
				System.out.println("Saisir un chiffre");			
				tmp = Lecture.lireDouble();
				tab[length] = tmp;
				length++;
			} 			
		}
		
		double moyenne;
		double somme = 0;
		
		// parcours du tableau pour calculer la moyenne
		for(int i = 0; i < length; i++) {
			somme += tab[i];
		}
		
		moyenne = somme / length;
		System.out.println("La moyenne de tout ce que vous avez rentré est " + moyenne);
		
		double mini = 0;
		for(int i=0; i < length; i++) {
			if(tab[i] < mini || i == 0) {
				mini = tab[i];
			}
		}
		System.out.println("mini : " + mini);
		
	}
}
