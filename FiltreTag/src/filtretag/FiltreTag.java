/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filtretag;

import java.io.*;

/**
 *
 * @author 21108766
 */
public class FiltreTag {
    
    private String tag;
    private StreamTokenizer tokenizer;
    private int etat;
    
    // constantes d'état
    private final static int EXTERIEUR = 0;
    private final static int DEBUT_BALISE_OUVRANTE = 1;
    private final static int TAG_BALISE_OUVRANTE = 2;
    private final static int INTERIEUR = 3;
    private final static int DEBUT_BALISE_FERMANTE = 4;
    private final static int SLASH_BALISE_FERMANTE = 5;
    private final static int TAG_BALISE_FERMANTE = 6;
    
    public FiltreTag(Reader reader, String tag) {
        this.tokenizer = new StreamTokenizer(reader);
        this.tag = tag;        
                
        tokenizer.ordinaryChar('/');
        tokenizer.ordinaryChar('<');
        tokenizer.ordinaryChar('>');
//        tokenizer.ordinaryChar(' ');
    }
    
    private void echo(int token) {
        switch(token) {
            case StreamTokenizer.TT_WORD :
                System.out.print(tokenizer.sval);
            break;
                
            case StreamTokenizer.TT_NUMBER :
                System.out.print(tokenizer.nval);
            break;
                
            default :
                System.out.print((char) token);
        }
    }
    
    public void filtrer() {
        this.etat = this.EXTERIEUR;
        
        try {
            for(int token = tokenizer.nextToken(); token != StreamTokenizer.TT_EOF; token = tokenizer.nextToken()) {                
                
                switch(etat) {
                    case FiltreTag.EXTERIEUR :                        
                        if(token == '<') {
                            etat = FiltreTag.DEBUT_BALISE_OUVRANTE;                            
                        }
                    break;
                        
                    case FiltreTag.DEBUT_BALISE_OUVRANTE :
                        if(token == StreamTokenizer.TT_WORD && tokenizer.sval.equals(tag)) {
                            etat = FiltreTag.TAG_BALISE_OUVRANTE;
                        } else {
                            etat = FiltreTag.EXTERIEUR;
                        }
                    break;
                        
                    case FiltreTag.TAG_BALISE_OUVRANTE :
                        if(token == '>') {
                            etat = FiltreTag.INTERIEUR;
                        }
                    break;
                        
                    case FiltreTag.INTERIEUR :
                        if(token == '<') {
                            etat = FiltreTag.DEBUT_BALISE_FERMANTE;
                        } else {
                            System.out.print(tokenizer.sval);
                        }
                    break;
                        
                    case FiltreTag.DEBUT_BALISE_FERMANTE :
                        if(token == '/') {
                            etat = FiltreTag.SLASH_BALISE_FERMANTE;
                        } else {                            
//                            if(token == StreamTokenizer.TT_WORD) {
                                //System.out.print("<" + tokenizer.sval);
                                System.out.println('<');
                                echo(token);
//                            }
                                etat = FiltreTag.INTERIEUR;
                        }
                    break;
                        
                    case FiltreTag.SLASH_BALISE_FERMANTE :
                        if(token == StreamTokenizer.TT_WORD && tokenizer.sval.equals(tag)) {
                            etat = FiltreTag.TAG_BALISE_FERMANTE;
                        } else {
                            
//                            if(token == StreamTokenizer.TT_WORD) {
                                System.out.print("</" + tokenizer.sval);
//                            }
                                etat = FiltreTag.INTERIEUR;
                        }
                    break;
                        
                    case FiltreTag.TAG_BALISE_FERMANTE :
                        if(token == '>') {
                            etat = FiltreTag.EXTERIEUR;
                        } else {                            
//                            if(token == StreamTokenizer.TT_WORD) {
                                System.out.print("</" + tag + tokenizer.sval);
//                            }
                                etat = FiltreTag.INTERIEUR;
                        }
                    break;
                        
                    default : System.out.println("erreur");
                }
                
//                echo(token);
//                System.out.println(" etat => " + etat);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("/home/etudiants/21108766/master/java-help/FiltreTag/src/filtretag/texte");
        Reader reader = new BufferedReader(new InputStreamReader(fis));
        String tag = "p";
        
        FiltreTag filtre = new FiltreTag(reader, tag);
        filtre.filtrer();
    }
    
}
