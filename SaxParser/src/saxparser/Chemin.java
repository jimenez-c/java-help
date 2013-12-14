/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import java.util.Stack;

/**
 *
 * @author 21108766
 */
public class Chemin extends Stack {
    
    public String toString() {
        String retour = "";
        for(int i = 0; i < this.size(); i++){
            retour += "/" + get(i);
        }
        if(retour.equals("")) return "/";
        return retour;
    }
    
    public boolean endsWith(Chemin c) {
        if(c.size() > this.size()) {
            return false;
        }
        for(int i = c.size() - 1; i >= 0; i--) {
            int indiceThis = this.size() - 1 - i;
            int indiceC = c.size() - 1 - i;
//            System.out.println(c.get(indiceC) + " == " + this.get(indiceThis) + " ?");
            if( ! c.get(indiceC).equals(this.get(indiceThis))) {
                return false;
            }
        }
        return true;
    }
    
}
