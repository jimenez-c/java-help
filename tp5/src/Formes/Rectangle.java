/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

/**
 *
 * @author 21108766
 */
public class Rectangle extends Polygone {
    
    public Rectangle(double largeur, double hauteur, Point ptSupGauche) {
        super();
        ajouterPoint(new Point(ptSupGauche));
        ajouterPoint(new Point(ptSupGauche.getX() + largeur, ptSupGauche.getY()));
        ajouterPoint(new Point(ptSupGauche.getX(), ptSupGauche.getY() + hauteur));
        ajouterPoint(new Point(ptSupGauche.getX() + largeur, ptSupGauche.getY() + hauteur));
    }
    
    public Rectangle(Point ptSupGauche, Point ptInfDroit) {
        this(ptInfDroit.getX() - ptSupGauche.getX(), ptInfDroit.getY() - ptSupGauche.getY(), ptSupGauche);
    }
    
    public Rectangle(Rectangle r) {
        super(r);
    }
    
    public String toString() {
        return "Rectangle d'origine " + super.getPoint(0) + ", largeur " + getLargeur() + ", hauteur " + getHauteur();
    }
    
    public double getLargeur() {
        return super.getPoint(1).getX() - super.getPoint(0).getX();
    }
    
    public double getHauteur() {
        return super.getPoint(2).getY() - super.getPoint(0).getY();
    }
    
}
