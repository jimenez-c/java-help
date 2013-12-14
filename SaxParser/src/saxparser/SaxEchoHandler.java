/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author 21108766
 */
public class SaxEchoHandler extends DefaultHandler {
    int indent = 0;
    
    public void startDocument() {
        System.out.println("start doc");
    }
    
    public void endDocument() {
        System.out.println("end doc");
    }
    
    public void startElement(String ns, String localName, String qName, Attributes atts) {        
        printIndent();        
        System.out.println("<" + qName + ">");
        indent++;
    }
    
    public void endElement(String ns, String localName, String qName) {
        indent--;
        printIndent();
        System.out.println("</" + qName + ">");        
    }
    
    public void printIndent() {
        for(int i = 0; i < indent; i++) {
            System.out.print("\t");
        }
    }
}
