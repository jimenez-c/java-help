/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.*;

/**
 *
 * @author 21108766
 */
public class AfficheurIterator {
    public static String toString(Iterator i) {
        String retour = "";
        while(i.hasNext()) {
            retour += i.next() + " ";
        }
        return retour;
    }
    
    public static void print(Iterator i) {
        while(i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }
}
