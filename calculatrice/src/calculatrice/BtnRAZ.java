/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author 21108766
 */
public class BtnRAZ extends JButton implements ActionListener {
    private RAZ raz;
    public BtnRAZ(RAZ raz) {
        
        super("RAZ");
        this.raz = raz;
        this.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("raz");
        raz.raz();
    }
    
}
