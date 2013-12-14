/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author 21108766
 */
public class SaxParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();           
            parser.parse("/home/etudiants/21108766/master/java-help/SaxParser/src/saxparser/juicers.xml", new SaxSelectionneHandler3());            
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
