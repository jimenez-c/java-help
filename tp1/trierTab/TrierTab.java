public class TrierTab {

	public static void main(String[] args) {
		
		int[] tab = {15, 45, 0, 524, 82, 1, 256};
		int tmp = 0;
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = i; j < tab.length; j++) {
				if(tab[j] < tab[i]) {
					tmp = tab[i];
					tab[i] = tab[j];
					tab[j] = tmp;
				}
			}		
		}

		System.out.println("Notes de la plus petite à la plus grande: ");

		for (int k = 0; k < tab.length ; k++) {
			System.out.print(tab[k] + " ");

			if(k == tab.length){
				System.out.println("\n");
			}
		}

	}
}