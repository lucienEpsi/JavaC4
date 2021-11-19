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
public abstract class Canard {
    private Vol maFaconDeVoler;
    
    public Canard(Vol v){
        maFaconDeVoler = v;
    }
    
    public void envoleToi(){
        maFaconDeVoler.vole();
    }
    public abstract void afficheToi();
    
    public void faitCoinCoin(){
        System.out.println("Coin Coin !!!");
    }
    
    public void nage(){
        System.out.println("Je nage");
    }

    /**
     * @return the maFaconDeVoler
     */
    public Vol getMaFaconDeVoler() {
        return maFaconDeVoler;
    }

    /**
     * @param maFaconDeVoler the maFaconDeVoler to set
     */
    public void setMaFaconDeVoler(Vol maFaconDeVoler) {
        this.maFaconDeVoler = maFaconDeVoler;
    }
}
