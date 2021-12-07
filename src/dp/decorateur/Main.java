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
public class Main {
    public static void main(String[] args) {
        Facture f = new FactureSimple();
        f.imprimeToi();
        System.out.println("Deco simple sans plus value");
        Facture d = new DecorateurFacture(f);
        d.imprimeToi();
        System.out.println("Deco avec entete");
        Facture fe = new Entete(f, "EPSI");
        fe.imprimeToi();
        
        System.out.println("Deco avec Pub");
        Facture fp = new Pub(f, "Chez DELL ....");
        fp.imprimeToi();
        
        System.out.println("Deco avec Pub et Entet");
        Facture fpe = new Pub(fe, "Chez DELL ....");
        fpe.imprimeToi();
        System.out.println("******************************************");
        fpe = new Pub(fpe, "Windaube");
        fpe.imprimeToi();
        System.out.println("**********************");
        Facture maFacture = 
                new Pub(
                    new Entete(f,"EPSI Montpellier"), "DELL ...");
        maFacture.imprimeToi();
    }
}
