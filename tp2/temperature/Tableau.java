public class Tableau {
 
    public static void main(String[] args) {
        int[] tab = {10, -5, 12, 7};

        trierInt(tab);
        afficherInt(tab);
    }
 
    public static int[] trierInt(int[] tab) {
         
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
 
        return tab;
    }

    public static double[] trierDouble(double[] tab) {
        double tmp = 0;
         
        for(int i = 0; i < tab.length; i++) {
            for(int j = i; j < tab.length; j++) {
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