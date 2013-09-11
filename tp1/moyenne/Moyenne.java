public class Moyenne {
	public static void main(String[] args) {
		System.out.println("Saisissez le nombre de valeurs :");
		int nbre = Lecture.lireInt();
		double somme = 0;
		
		for(int i = 0; i < nbre; i++) {
			System.out.println("Valeur n°" + i + " : ");
			somme += Lecture.lireDouble();
		}
		
		double result = somme / nbre;
		System.out.println("Moyenne : " + result);
	}
}
