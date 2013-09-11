public class Tableau {
 
    public static void main(String[] args) {
        int[] tab = {10, -5, 12, 7};

        trierInt(tab, 4);
        afficherInt(tab);
    }
 
    public static int[] trierInt(int[] tab, int length) {
         
        int tmp = 0;
         
        for(int i = 0; i < length; i++) {
            for(int j = i; j < length; j++) {
                if(tab[j] < tab[i]) {
                    tmp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = tmp;
                }
            }      
        }
 
        return tab;
    }
 
    public static void afficherInt(int[] tab) {
        for (int k = 0; k < tab.length ; k++) {
            System.out.println(tab[k]);
        }
         
    }
}