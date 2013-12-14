/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyril
 */
public class ComportementCombine implements Comportement {
    private Comportement cpt1, cpt2;

    public ComportementCombine(Comportement cpt1, Comportement cpt2) {
        this.cpt1 = cpt1;
        this.cpt2 = cpt2;
    }
    @Override
    public Mouvement donneProchainMouvement() {
        Mouvement mvt1 = cpt1.donneProchainMouvement();
        Mouvement mvt2 = cpt2.donneProchainMouvement();
        return new Mouvement(mvt1.getDepX() + mvt2.getDepX(), mvt1.getDepY() + mvt2.getDepY());
    }

}
