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
public class MyArrayListRandomOrderIterator implements Iterator {
    private ArrayList al;
    private int[] mixedIndexes;
    private int nextIndex;
    
    public MyArrayListRandomOrderIterator(ArrayList al) {
        this.al = al;
        nextIndex = 0;
        mixedIndexes = new int[al.size()];
        
        for(int i = 0; i < al.size(); i++) {
            mixedIndexes[i] = i;
        }
        
        for(int i = 0; i < al.size() / 2; i++) {
            int index1 = (int) (Math.random() * al.size());
            int index2 = (int) (Math.random() * al.size());
            
            if(index1 != index2) {
                int tmp = mixedIndexes[index2];
                mixedIndexes[index2] = mixedIndexes[index1];
                mixedIndexes[index1] = tmp;
            }            
        }                
              
    }
    
    public boolean hasNext() {        
        return nextIndex < al.size();
    }
    
    public Object next() { 
        return al.get(mixedIndexes[nextIndex++]);    
    }
    
    public void remove() {
//         throw new UnsupportedOperationException("opération non implémentée");
        al.remove(nextIndex);
         System.out.println("Vous essayez de tuer " + al.get(mixedIndexes[nextIndex]) + " ! Espèce de salaud !");
    }
}
