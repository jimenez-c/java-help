
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyril
 */
public class ToutDroit2 extends ComportementCyclique {
    public ToutDroit2(int direction) {
        super(creerMotifToutDroit(direction));
    }

    private static ArrayList<Mouvement> creerMotifToutDroit(int direction) {
        ArrayList motif = new ArrayList();
        try {
            motif.add(new Mouvement(direction));
        } catch(IndexOutOfBoundsException ex) {
            throw new MouvementImpossibleException();
        }

        return motif;
    }
}
