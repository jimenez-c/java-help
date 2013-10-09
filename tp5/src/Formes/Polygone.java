/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

import java.util.ArrayList;

/**
 *
 * @author 21108766
 */
public class Polygone extends Forme {
    private ArrayList points;
    
    public Polygone() {
        points = new ArrayList();
    }
    
    public Polygone(Polygone p) {
        for(int i = 0; i < p.points.size(); i++) {
            this.ajouterPoint((Point) p.points.get(i));
        }
    }
    
    public void ajouterPoint(Point p) {
        points.add(p);
    }
    
    public void translate(double dx, double dy) {
        for(int i = 0; i < points.size(); i++) {
            ((Point) points.get(i)).translate(dx, dy);
        }
    }
    
    public void homothetie(Point c, double k) {
        for(int i = 0; i < points.size(); i++) {
            ((Point) points.get(i)).homothetie(c, k);
        }
    }
    
    public String toString() {
        return this.isValid() ? "Polygone constitué de " + points.size() + " points" : "Polygone invalide.";
    }
    
    public boolean isValid() {
        return points.size() >= 3;
    } 
    
    public Point getPoint(int index) {
        return (Point) points.get(index);
    }
}
