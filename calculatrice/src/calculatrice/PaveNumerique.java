/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author 21108766
 */
public class PaveNumerique extends JPanel implements ActionListener {
    private static final char[] TOUCHES = {'7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '0', '.', '=', '/'};
    
    private Calculatrice calculatrice;
    
    public PaveNumerique(Calculatrice c) {
        calculatrice = c;
        this.setLayout(new GridLayout(4, 4));
        
        for(char touche : TOUCHES) {
            JButton btn = new JButton("" + touche);
            this.add(btn);
            btn.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {        
        char c = (((JButton) ae.getSource()).getText()).charAt(0);
        if((c >= '0' && c <= '9') || c == '.') {
            calculatrice.actionNumerique(c);
        } 
        else {
            if(c == '=') {
                calculatrice.actionCalcul();
            } 
            else {
                calculatrice.actionOperation(c);
            }
        }
    }
}
