/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyril
 */
public class ToutDroit1 implements Comportement {
    private int direction;

    public ToutDroit1(int direction) {
        this.direction = direction;
    }

    @Override
    public Mouvement donneProchainMouvement() {
        try {
            return new Mouvement(direction);
        }
        catch(IndexOutOfBoundsException ex) {
            throw new MouvementImpossibleException();
        }

    }

}
