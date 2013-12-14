/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import dnr2ievents.ChangementEvent;
import dnr2ievents.ModeleListener;
import javax.swing.JTextField;

/**
 *
 * @author 21108766
 */
public class EcranCalculatrice extends JTextField implements ModeleListener {
    
    private Calculatrice c;
    
    public EcranCalculatrice(Calculatrice c) {
        super("0");
        this.c = c;
        c.addModeleListener(this);        
    }

    @Override
    public void changementEtat(ChangementEvent e) {        
        if(c.modeInsertion()) {                                        
            this.setText(c.getBuffer());            
        }
        else {
            this.setText(c.getPrecedent() + "");
        }
        
    }
}
