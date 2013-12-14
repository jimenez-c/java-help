/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 21108766
 */
public class BoutonBonjour extends JButton implements ActionListener {
    
    public BoutonBonjour() {
        super("Bonjour");
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        System.out.println("coucou");
    }
    
    
}
