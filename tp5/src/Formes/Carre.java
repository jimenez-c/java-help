/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

/**
 *
 * @author 21108766
 */
public class Carre extends Rectangle {
    public Carre(Point ptSupGauche, double cote) {
        super(cote, cote, ptSupGauche);
    }
    
    public String toString() {
        return "Carré de côté " + getCote();
    }
    
    public double getCote() {
        return super.getPoint(1).getX() - super.getPoint(0).getX();
    }
}
