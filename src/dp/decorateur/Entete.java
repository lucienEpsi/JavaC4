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
public class Entete extends DecorateurFacture {
    private String entete;
    public Entete(Facture deco, String e) {
        super(deco);
        entete = e;
    }
    
    @Override
    public void imprimeToi(){
        imprimeEntete();
        super.imprimeToi();
        
    }

    private void imprimeEntete() {
        System.out.println(entete);
    }
    
    
}
