/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author 21108766
 */
public class TestCalculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Calculatrice");      
        
        Container cp = frame.getContentPane();
        cp.setLayout(new BorderLayout());        
        Calculatrice calculatrice = new Calculatrice();
        cp.add(new EcranCalculatrice(calculatrice), BorderLayout.NORTH);
        cp.add(new PaveNumerique(calculatrice), BorderLayout.CENTER);
        cp.add(new BtnRAZ(calculatrice), BorderLayout.SOUTH);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
