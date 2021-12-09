/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategy;

import dp.adaptator.AdaptableDindon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        List<Canard> canards = initListeCanards();
        
        for(Canard c : canards){
            c.afficheToi();
            c.envoleToi();
            c.faitCoinCoin();
        }
        
        System.out.println("C'est noel !!!!!");
        canards.get(2).setMaFaconDeVoler(new VolAvecAilles());
        for(Canard c : canards){
            c.afficheToi();
            c.envoleToi();
        }
        
        
    }

    private static List<Canard> initListeCanards() {
        List<Canard> cs = new ArrayList<>();
        cs.add(new Morillon(new VolAvecAilles()));
        cs.add(new Colvert(new VolAvecAilles()));
        cs.add(new CanardEnBois(new NoVol()));
        cs.add(new AdaptableDindon());
        
        return cs;
    }
            
}
