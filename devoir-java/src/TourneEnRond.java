
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21108766
 */
public class TourneEnRond extends ComportementCyclique {

    public TourneEnRond() {
        super(creerMotifTourneEnRond());
    }

    private static ArrayList<Mouvement> creerMotifTourneEnRond() {
        ArrayList motif = new ArrayList();
        motif.add(new Mouvement(Mouvement.DROITE));
        motif.add(new Mouvement(Mouvement.BAS));
        motif.add(new Mouvement(Mouvement.GAUCHE));
        motif.add(new Mouvement(Mouvement.HAUT));
        return motif;
    }
 }
