/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 21108766
 */
public class MyArrayListIterator implements Iterator {
    private ArrayList al;
    private int nextIndex;
    
    public MyArrayListIterator(ArrayList al) {
        this.al = al;
        nextIndex = 0;
        
    }
    
    public boolean hasNext() {
        return nextIndex < al.size();
    }
    
    public Object next() {             
        return al.get(nextIndex++);       
    }
    
    public void remove() {
        // throw new UnsupportedOperationException("opération non implémentée");
        al.remove(--nextIndex);
    }
}
