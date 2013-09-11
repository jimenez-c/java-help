public class Abs {
	public static void main(String[] args) {
		System.out.println("Bonjour, veuillez saisir un nombre.");
		double nbre = Lecture.lireDouble();
		if(nbre < 0) {
			double result = nbre * -1;
			System.out.println("La  valeur absolue de " + nbre + " est " + result);
		} else {
			System.out.println("La  valeur absolue de " + nbre + " est " + nbre);
		}
	}
}
