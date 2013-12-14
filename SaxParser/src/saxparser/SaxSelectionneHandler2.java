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
public class SaxSelectionneHandler2 extends DefaultHandler {
    Chemin chemin;
    Chemin test;
    String content;
    int indent = 0;
    
    public void startDocument() {
        System.out.println("start doc");
        test = new Chemin();        
        test.add("cost");
        chemin = new Chemin();                
    }
    
    public void endDocument() {
        System.out.println("end doc");
    }
    
    public void startElement(String ns, String localName, String qName, Attributes atts) {                
//        printIndent();        
        chemin.add(qName);        
        content = "";
        String attrString = "";
        for(int i = 0; i < atts.getLength(); i++) {            
            attrString += atts.getQName(i) + "=\"" + atts.getValue(i) + "\" ";
        }
//        System.out.println("<" + qName  + " " + attrString + ">");
        indent++;
    }
    
    public void endElement(String ns, String localName, String qName) { 
        indent--;
        chemin.pop();
//        System.out.println(chemin);
//        printIndent();
//        System.out.println(content);
//        printIndent();
//        System.out.println("</" + qName + ">");
    }
    
    public void characters(char[] ch, int indiceDebut, int length) {       
//        printIndent();        
        String tmp = new String(ch, indiceDebut, length);
        content += tmp;
        if(chemin.endsWith(test)) {
            System.out.println(tmp);
        }
    }
    
    public void printIndent() {
        for(int i = 0; i < indent; i++) {
            System.out.print("\t");
        }
    }
}
