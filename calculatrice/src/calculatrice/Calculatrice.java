/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import dnr2ievents.ModeleEcoutableImpl;

/**
 *
 * @author 21108766
 */
public class Calculatrice extends ModeleEcoutableImpl implements ControleParPaveNumerique, RAZ {
    private double valeurPrecedente;
    private double valeurCourante;
    private String bufferCourant = "";
    private char operateur = '0';
    private boolean insertion = true;
    
    public String getBuffer() {
        return bufferCourant;
    }
    public char getOperateur() {
        return operateur;
    }
    public boolean modeInsertion() {
        return insertion;
    }
    public double getPrecedent() {
        return valeurPrecedente;
    }
    
    public void actionNumerique(char c) {
        insertion = true;
        int nb = 0;
        if(c == '.') {
            if(bufferCourant.indexOf('.') >= 0) {
                return;
            }
            bufferCourant += ".";
        } 
        else {
            bufferCourant += c - '0';
        }        
        System.out.println("buffer " + bufferCourant);
        fireChangement();
    }
    
    public void actionOperation(char op) {
        insertion = false;
        if( ! bufferCourant.equals("")) {
            valeurPrecedente = Double.parseDouble(bufferCourant);
        }        
        bufferCourant = "";
        operateur = op;
        System.out.println("valeur précédente = " + valeurCourante);
        fireChangement();        
    }
    
    public void actionCalcul() { 
        insertion = false;
        valeurCourante = Double.parseDouble(bufferCourant);
        
        double resultat = 0;
        switch(operateur){
            case '+': resultat = valeurPrecedente + valeurCourante; break;
            case '-': resultat = valeurPrecedente - valeurCourante; break;
            case '*': resultat = valeurPrecedente * valeurCourante; break;
            case '/': resultat = valeurPrecedente / valeurCourante; break;
        }
        valeurPrecedente = resultat;
        bufferCourant = "";
        System.out.println(resultat);
        fireChangement();
    }
    
    public void raz() {
        
    }
}
