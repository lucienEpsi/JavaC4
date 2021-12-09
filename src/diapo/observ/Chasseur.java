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
public class Chasseur implements Observateur {

    @Override
    public void reagir(Observable o) {
        System.out.println("Je tire : PAN PAN !!!! ");
    }
    
}
