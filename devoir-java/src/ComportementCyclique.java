
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21108766
 */
public class ComportementCyclique implements Comportement {
    private ArrayList<Mouvement> motif = new ArrayList();
    private int indice = 0;

    /**
     * Crée un comportement cyclique avec le motif passé en paramètre (le motif est recopié pour ne pas altérer l'original).
     * @param motif
     */
    public ComportementCyclique(ArrayList<Mouvement> motif) {
        for(Mouvement m : motif) {
            motif.add(m);
        }
    }

    /**
     * Constructeur de recopie.
     * @param cpt le comportement à recopier.
     */
    public ComportementCyclique(ComportementCyclique cpt) {
        this(cpt.motif);
    }

    @Override
    public Mouvement donneProchainMouvement() {
        if(indice >= motif.size() - 1) {
            indice = 0;
        } else {
            indice++;
        }
        return motif.get(indice - 1);
    }

    public ComportementCyclique creeComportementInverse() {
        ArrayList<Mouvement> nouveauMotif = new ArrayList();
        for(int i = motif.size() - 1; i >= 0; i--) {
            nouveauMotif.add(motif.get(i).mouvementInverse());
        }
        return new ComportementCyclique(nouveauMotif);
    }
    
//    public abstract ArrayList<Mouvement> creerMotif(){
//        
//    }

}
