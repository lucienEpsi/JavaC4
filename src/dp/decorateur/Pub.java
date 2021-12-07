/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorateur;

/**
 *
 * @author 33676
 */
public class Pub extends DecorateurFacture {
    private String pub;
    public Pub(Facture deco, String p) {
        super(deco);
        pub = p;
    }
    
    @Override
    public void imprimeToi(){
        
        super.imprimeToi();
        imprimePub();
    }

    private void imprimePub() {
        System.out.println(pub);
    }
    
    
}
