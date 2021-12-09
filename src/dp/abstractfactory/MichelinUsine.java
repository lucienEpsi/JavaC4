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
public class MichelinUsine extends Garage{

    @Override
    PneuNeige createPneuNeige() {
        System.out.println("creation d'un pneu neige chez Mich");
        return new PneuNeigeF6();
    }

    @Override
    PneuSport createPneuSport() {
        System.out.println("creation d'un pneu sport chez Mich");
        return new PneuSportX4();
    }
    
}
