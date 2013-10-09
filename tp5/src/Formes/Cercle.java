/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

/**
 *
 * @author 21108766
 */
public class Cercle extends Forme {
    private Point centre;
    private double rayon;
    
    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    
    public Cercle() {
        this(new Point(), 2);
    }
    
    public void translate(double dx, double dy) {
        centre.translate(dx, dy);
    }
    
    public void homothetie(Point centre, double k) {
        this.centre.homothetie(centre, k);
        rayon *= k;
    }
    
    public String toString() {
        return "Cercle de centre " + centre + " et de rayon " + rayon;
    }
}
