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
public class Main {
    public static void main(String[] args) {
        PneuNeige pn;
        PneuSport ps;
        
        Garage g = donneGarageMich();
        pn = g.createPneuNeige();
        ps = g.createPneuSport();
        
        g = donneGarageFir();
        pn=g.createPneuNeige();
        ps = g.createPneuSport();
    }

    private static Garage donneGarageMich() {
        return new MichelinUsine();
    }

    private static Garage donneGarageFir() {
        return new FirestUsine();
    }
}
