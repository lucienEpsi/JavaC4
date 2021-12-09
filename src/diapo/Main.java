/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diapo;

import diapo.observ.CanardObservable;
import diapo.observ.Chasseur;
import diapo.observ.Observable;
import diapo.observ.Observateur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        List<EmissionSonore> liste = new ArrayList<>();
        Observateur elmer = new Chasseur();
        EmissionSonore dafy = new Morillon();
        dafy = new CanardObservable(dafy);
        Observable dafy2 = new CanardObservable(new Morillon());
        dafy2.enregistrerObservateur(elmer);
        ((CanardObservable)dafy).enregistrerObservateur(elmer);
        
        dafy.emetUnSon();
        ((EmissionSonore)dafy2).emetUnSon();
        
        System.out.println("***********************************************");
        /*
        EmissionSonore c = new Colvert();
        EmissionSonore deco = new CompteurCoinCoin(c);
        */
        FabriqueAbstraiteCanard f = new FabriqueCanardCompte();
        EmissionSonore c = f.creerColvert();
        liste.add(c);
        /*EmissionSonore m = new Morillon();
        EmissionSonore deco1 = new CompteurCoinCoin(m);
*/
        EmissionSonore m = f.creerMorillon();
        liste.add(m);
        EmissionSonore a = new Appeau();
        liste.add(a);
        EmissionSonore cec = new CEC();
        liste.add(cec);
        //ajout d'une Oie ????
        Oie o = new Oie();
        EmissionSonore ao = new AdaptOie(o);
        liste.add(ao);
        liste.forEach(e -> {
            e.emetUnSon();
        });
        liste.forEach(e -> {
            e.emetUnSon();
        });
        System.out.println(CompteurCoinCoin.cpt);
        System.out.println("remise a zero");
        CompteurCoinCoin.setCpt(0);
    }
}
