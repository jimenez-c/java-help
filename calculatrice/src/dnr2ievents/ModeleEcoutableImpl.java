/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnr2ievents;

import java.util.ArrayList;

/**
 *
 * @author 21108766
 */
public abstract class ModeleEcoutableImpl implements ModeleEcoutable {
    
    private ArrayList<ModeleListener> listeners;
    
    public ModeleEcoutableImpl() {
        listeners = new ArrayList<>();
    }
        
    public void addModeleListener(ModeleListener l, boolean fire) {
        listeners.add(l);
        if(fire) {
            l.changementEtat(new ChangementEvent(this));
        }
    }
    
    public void addModeleListener(ModeleListener l) {
        addModeleListener(l, true);
    }
    
    public void removeModeleListener(ModeleListener l) {
        listeners.remove(l);
    }
    
    public void fireChangement() {
        ChangementEvent e = new ChangementEvent(this);
        for(ModeleListener l : listeners) {
            l.changementEtat(e);
        }
    }
}
