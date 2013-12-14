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
public class Frame extends JFrame implements WindowListener {
    public Frame() {        
        super("première fenêtre");
        this.addWindowListener(this);
        Container content = this.getContentPane();
        content.setLayout(new BorderLayout());
        content.add(new BoutonBonjour(), BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);        
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }    
   
    public void windowClosing(WindowEvent we) {
        String msg = "Fermer l'appli ?";
        int n = JOptionPane.showConfirmDialog(
        this,
        "Voulez vous fermer le programme ?",
        "Fermeture du programme",
        JOptionPane.YES_NO_OPTION);
//        JOptionPane optionPane = new JOptionPane(msg, JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);        
        if(n == 0) {
            System.exit(0);
        }
        
        
    }

    public void windowClosed(WindowEvent we) {
        System.out.println("closed");
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("windowDeactivated");
    }
}
