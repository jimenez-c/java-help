public class TestImpots {
	public static void main(String[] args) {
		System.out.println("Calcul des impôts...");
		Usine coca = new Usine("Coca-Cola Company", "Californie", 4000, "Coca-Cola");
		Usine nutella = new Usine("Nutella Company", "Arizona", 10000, "Nutella");
		Usine kinder = new Usine("Kinder Company", "Allemagne", 7000, "Kinder");

		Maison chezMoi = new Maison("Cyril Jimenez", "10 bd mar juin", 20, 2, true);
		Maison chezAlizee = new Maison("Alizée Tiercery", "rue damozanne", 30);

		Mairie youpiVille = new Mairie("Youpi Ville", "Cyril", 12000);

		youpiVille.ajouterBatiment(coca);
		youpiVille.ajouterBatiment(nutella);
		youpiVille.ajouterBatiment(kinder);
		youpiVille.ajouterBatiment(chezAlizee);
		youpiVille.ajouterBatiment(chezMoi);

		System.out.println("Total : " + youpiVille.calculerImpots());
		System.out.println("Max : " + youpiVille.trouverMax());

	}
}