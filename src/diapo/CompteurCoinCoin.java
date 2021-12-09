/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diapo;

/**
 *
 * @author 33676
 */
public class CompteurCoinCoin implements EmissionSonore{
    private EmissionSonore decore;
    public static int cpt;
    public CompteurCoinCoin(EmissionSonore e){
        decore = e;
    }
    @Override
    public void emetUnSon() {
        decore.emetUnSon();
        System.out.println("Je suis decoré");
        cpt++;
    }

    public static int getCpt() {
        return cpt;
    }

    public static void setCpt(int cpt) {
        CompteurCoinCoin.cpt = cpt;
    }
    
    
}
