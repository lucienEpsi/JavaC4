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
public class DecorateurFacture extends Facture{

    private Facture factureDecore;
    
    public DecorateurFacture(Facture deco){
        factureDecore = deco;
                
    }
    @Override
    public void imprimeToi() {
        factureDecore.imprimeToi();
    }
    
}
