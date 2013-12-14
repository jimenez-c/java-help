/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author 21108766
 */
public class Convertisseur extends JFrame implements ActionListener, CaretListener {
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JTextField field1 = new JTextField();
    private JTextField field2 = new JTextField();
    private double tauxChange;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Convertisseur("francs", "euros", 6.56);
    }
    
    public Convertisseur(String devise1, String devise2, double tauxChange) {
        super("Convertisseur " + devise1 + " => " + devise2);
        
        this.tauxChange = tauxChange;
        Font font = new Font("SansSerif", Font.ITALIC, 20);
        
        Container cp = this.getContentPane();        
        
        Box premiereLigne = Box.createHorizontalBox();           
        field1.setFont(font);
        premiereLigne.add(field1);
        premiereLigne.add(new JLabel(devise1));
        
        Box deuxiemeLigne = Box.createHorizontalBox(); 
        field2.setFont(font);
        deuxiemeLigne.add(field2);
        deuxiemeLigne.add(new JLabel(devise2));
        
        Box troisiemeLigne = Box.createHorizontalBox();
        btn1 = new JButton(devise1 + " vers " + devise2);
        btn2 = new JButton(devise2 + " vers " + devise1);
        btn3 = new JButton("Effacer");
        troisiemeLigne.add(btn1);
        troisiemeLigne.add(btn2);
        troisiemeLigne.add(btn3);
        
        Box container = Box.createVerticalBox();
        container.add(premiereLigne);
        container.add(deuxiemeLigne);
        container.add(troisiemeLigne);
        
        cp.add(container);        
//        cp.setPreferredSize(new Dimension(300, 150));
        
        field1.addCaretListener(this);
        field2.addCaretListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        
            if(ae.getSource() == btn1) {                                                
                
            } else if(ae.getSource() == btn2) {
                
            } else if(ae.getSource() == btn3) {
                field1.setText("0");
                field2.setText("0");
            } else {
                System.out.println("erreur !");
            }
        
    }
    
    public double devise1toDevise2(double valeur1) {
        return valeur1 / tauxChange;
    }
    
    public double devise2toDevise1(double valeur2) {
        return valeur2 * tauxChange;
    }
    
    public void caretUpdate(CaretEvent ce) {
        try {
            if(ce.getSource() == field1) {

                double valeur1 = Double.parseDouble(field1.getText());                
                double valeur2 = devise1toDevise2(valeur1);
                field2.removeCaretListener(this);
                field2.setText(String.valueOf(valeur2));
                field2.addCaretListener(this);

            } 

            else if (ce.getSource() == field2) {

                double valeur2 = Double.parseDouble(field2.getText());                
                double valeur1 = devise2toDevise1(valeur2);
                field1.removeCaretListener(this);
                field1.setText(String.valueOf(valeur1));
                field1.addCaretListener(this);

            }
            else {
                System.out.println("erreur");
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Ceci n'est pas un nombre.");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
