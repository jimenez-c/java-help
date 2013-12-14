/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyril
 */
public class MouvementImpossibleException extends RuntimeException {
    public MouvementImpossibleException() {
        super("La direction donnée ne correspond à aucune direction autorisée.");
    }
}
