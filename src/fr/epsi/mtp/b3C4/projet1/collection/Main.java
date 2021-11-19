/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.b3C4.projet1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        List<Personne> personnes;
        personnes = new ArrayList<>();
        
        for(int i =0; i<100;i++){
            personnes.add(new Personne(i+"nom", (100-i)+"prenom"));
        }
        List<String> chaines = new ArrayList<String>();
        //init liste
        for(int i = 0; i< 100; i++){
            chaines.add(i+"epsi");
        }
        //affichage de la liste
        for(String s : chaines){
       //     System.out.println(s);
        }
        
        Collections.sort(chaines);
        System.out.println("**********************************");
        //affichage de la liste triee
        for(String s : chaines){
        //    System.out.println(s);
        }
        
        
        for(Personne p : personnes){
        //    System.out.println(p.getNom());
        }
        
        
        //********************************************
        Collections.sort(personnes);
        System.out.println("****************apres tri Personne nom********************");
        for(Personne p : personnes){
            System.out.println(p.getNom() + " "+ p.getPrenom());
        }
        
        
        Collections.sort(personnes, (Personne o1, Personne o2) -> o1.getPrenom().compareTo(o2.getPrenom()));
        
        System.out.println("****************apres tri Personne prenom ********************");
        for(Personne p : personnes){
            System.out.println(p.getNom() + " "+ p.getPrenom());
        }
    }
}
