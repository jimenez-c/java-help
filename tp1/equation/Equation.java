public class Equation {
	
	public static void main(String[] args) {

		System.out.println("Bonjour, bienvenue dans ce cours de Maths. Ensemble nous allons tenter de résoudre une équation de type ax2 + bx + c. Are you ready ?");

		System.out.println("Saisissez a : ");
		double a = Lecture.lireDouble();
		System.out.println("Saisissez b : ");
		double b = Lecture.lireDouble();
		System.out.println("Saisissez c : ");
		double c = Lecture.lireDouble();
		
		double delta = (b*b) - (4*a*c);
		double solution1;
		double solution2;
		
		if(delta < 0 && delta != 0) {
			solution1 = -b - Math.sqrt(delta) / (2 * a);
			solution2 = -b + Math.sqrt(delta) / (2 * a);
			System.out.println("Il y a 2 solutions : " + solution1 + " et " + solution2);						
		} else {
			if(delta == 0) {
				solution1 = -b / 2 * a;
				System.out.println("Il y a 1 solution : " + solution1);
			} else {
				System.out.println("Il n'y a pas de solution.");
			}
		}
	}
}
