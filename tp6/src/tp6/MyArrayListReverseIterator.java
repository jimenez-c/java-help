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
public class MyArrayListReverseIterator implements Iterator {
    private ArrayList al;
    private int nextIndex;
    
    public MyArrayListReverseIterator(ArrayList al) {
        this.al = al;
        nextIndex = al.size();
        
    }
    
    public boolean hasNext() {
        return nextIndex > 0;
    }
    
    public Object next() {             
        return al.get(--nextIndex);       
    }
    
    public void remove() {
        // throw new UnsupportedOperationException("opération non implémentée");
        al.remove(nextIndex);
    }
}
