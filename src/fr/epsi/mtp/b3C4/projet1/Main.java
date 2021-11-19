/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.b3C4.projet1;

import java.awt.Color;

/**
 *
 * @author 33676
 */
public class Main {
    
    public static void main(String[] args) {
        Animal milou = new Chien(Color.WHITE,"Male");
        
        
        System.out.println(milou);
        Animal titi = new Oiseau();
        titi.setCouleur(Color.YELLOW);
        titi.setSexe("Femelle");
        
        
        //Oiseau toto = new Animal();
        
        
        
        
        System.out.println(titi);
        ((Oiseau)titi).voler();
        titi.seDeplacer();
        milou.seDeplacer();
        
        Animal[] animaux = {titi, milou};//new Animal[2];
        //animaux[0] = titi;
        for (Animal animaux1 : animaux) {
            animaux1.seDeplacer();
        }
        
    }
}
