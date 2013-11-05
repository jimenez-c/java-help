/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 21108766
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        ArrayList<String> tableau = new MyArrayList3();
        tableau.add("toto");
        tableau.add("titi");
        tableau.add("tata");
        tableau.add("foo");
        tableau.add("bart");
        tableau.add("simpson");
        Iterator it = tableau.iterator();        
        
        it.next();
        it.remove();
        
//        for(int i = 0; i < tableau.size(); i++) {
//            System.out.println(tableau.get(i));
//        }
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
