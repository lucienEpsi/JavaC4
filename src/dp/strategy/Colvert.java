/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategy;

/**
 *
 * @author 33676
 */
public class Colvert extends Canard{

    public Colvert(Vol v) {
        super(v);
    }

    
    @Override
    public void afficheToi() {
        System.out.println("Colvert !!!");
    }
    
}
