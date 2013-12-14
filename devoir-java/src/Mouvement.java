/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21108766
 */
public class Mouvement {
    private int depX;
    private int depY;

    public final static int GAUCHE = 0;
    public final static int DROITE = 1;
    public final static int HAUT = 2;
    public final static int BAS = 3;
    private final static int[][] directions;

    static {
        directions = new int[4][2];
        directions[GAUCHE][0] = 1;
        directions[GAUCHE][1] = 0;
        directions[DROITE][0] = -1;
        directions[DROITE][1] = 0;
        directions[HAUT][0] = 0;
        directions[HAUT][1] = -1;
        directions[BAS][0] = 0;
        directions[BAS][1] = 1;
    }

    public Mouvement() {
        throw new IllegalArgumentException("Impossible de créer un mouvement sans paramètres.");
    }

    public Mouvement(int direction) {       
        this(directions[direction][0], directions[direction][1]);             
    }

    public Mouvement(int x, int y) {
        depX = x;
        depY = y;
    }

    public Mouvement(Mouvement mvt) {
        this(mvt.depX, mvt.depY);
    }

    public int getDepX() {
        return depX;
    }
    public int getDepY() {
        return depY;
    }

    public Mouvement mouvementInverse() {
        return new Mouvement(inverseInt(depX), inverseInt(depY));
    }

    private int inverseInt(int nb) {
        if(nb == 0) {
            return 0;
        } else if(nb > 0) {
            return 0 - depX;
        } else {
            return Math.abs(nb);
        }
    }

}
