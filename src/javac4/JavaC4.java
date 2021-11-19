/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac4;

import fr.epsi.mtp.b3C4.projet1.Personne;

/**
 *
 * @author 33676
 */
public class JavaC4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenue !!!");
        Personne p, p1;
        p = new Personne();
        p.setNom("Martos");
        p.setPrenom("Lucien");
        p1 = new Personne();
        p1.setNom("Martos");
        p1.setPrenom("Lucien");
        System.out.println(p.getNom()+" "+p.getPrenom());
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p==p1);
        System.out.println(p.equals(p1));
        System.out.println(p.getNom().substring(0, 1));
    }
    
}
