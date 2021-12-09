/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diapo.observ;

/**
 *
 * @author 33676
 */
public interface Observable {
    
    public void notifierObservateurs();
    public void enregistrerObservateur(Observateur o);
}
