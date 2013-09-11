public class Equation {
	public static void main(String[] args) {
		System.out.println("Saisissez a : ");
		double a = Lecture.lireDouble();
		System.out.println("Saisissez b : ");
		double b = Lecture.lireDouble();
		System.out.println("Saisissez c : ");
		double c = Lecture.lireDouble();
		
		// Math.pow(a, 2) || b * b
		double delta = b * b - 4 * a * c;
		double solution1;
		double solution2;
		
		if(delta < 0 && delta != 0) {
			solution1 = -b - Math.sqrt(delta) / (2 * a);
			solution2 = -b + Math.sqrt(delta) / (2 * a);
			System.out.println("2 solutions : " + solution1 + " et " + solution2);						
		} else {
			if(delta == 0) {
				solution1 = -b / 2 * a;
				System.out.println("1 solution : " + solution1);
			} else {
				System.out.println("Pas de solution.");
			}
		}
		
		System.out.println("fin");
	}
}
