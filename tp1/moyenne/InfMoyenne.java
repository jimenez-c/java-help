public class InfMoyenne {
	public static void main(String[] args) {
		int i = 0;
		double somme = 0;
		int nombre;
		
		while((nombre=Lecture.lireInt()) >= 0) {
			somme += nombre;
			i++;
		}
		
		double result = somme / i;
		System.out.println("Moyenne : " + result);
	}
}
