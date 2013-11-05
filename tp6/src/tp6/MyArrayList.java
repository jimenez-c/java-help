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
public class MyArrayList extends ArrayList {
    public Iterator iterator() {
        return new MyArrayListIterator(this);
    }
}
