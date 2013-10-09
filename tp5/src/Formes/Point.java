/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formes;

/**
 *
 * @author 21108766
 */
public class Point extends Forme {
    private double x;
    private double y;
    
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }
    
    public void homothetie(Point c, double k) {
        setX(c.x * (1 - k) + k * x);
        setY(c.y * (1 - k) + k * y);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }
    
    public Point(Point p) {
        this(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public String toString() {
        return "( " + x + " ; " + y + " )";
    }
    
    
}
