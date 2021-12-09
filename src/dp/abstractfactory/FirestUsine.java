/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.abstractfactory;

/**
 *
 * @author 33676
 */
public class FirestUsine extends Garage {

    public FirestUsine() {
    }

    @Override
    PneuNeige createPneuNeige() {
        System.out.println("creation d'un pneu neige chez Firest");
        return new PneuNeigeF1();
    }

    @Override
    PneuSport createPneuSport() {
        System.out.println("creation d'un pneu sport chez Firest");
        return new PneuSportY80();
    }
    
}
