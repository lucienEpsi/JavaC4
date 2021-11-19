/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator;

import dp.strategy.Canard;
import dp.strategy.NoVol;
import dp.strategy.Vol;

/**
 *
 * @author 33676
 */
public class AdaptableDindon extends Canard{
    private Dindon d;
    public AdaptableDindon() {
        super(new NoVol());
        d = new Dodo();
    }

    
    @Override
    public void afficheToi() {
        System.out.println("Je suis un DODO !!!");
    }
    
    @Override
    public void faitCoinCoin(){
        d.faitGlouGlou();
    }
}
