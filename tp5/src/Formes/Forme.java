/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

/**
 *
 * @author 21108766
 */
public abstract class Forme implements Affichable {
    public abstract void translate(double dx, double dy);
    public abstract void homothetie(Point c, double k);
    
    public void homothetie(double dx, double dy, double k) {
        this.homothetie(new Point(dx, dy), k);
    }
    
    public void afficher() {
        System.out.println(this);
    }
}
