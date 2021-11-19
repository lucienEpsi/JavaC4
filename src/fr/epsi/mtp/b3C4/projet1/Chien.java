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
public class Chien extends Animal{

    public Chien(Color couleur, String sexe) {
        super(couleur, sexe);
    }
    
    public void marcher(){
        System.out.println("Je marche");
    }

    @Override
    public String toString() {
        return "Chien{" +super.toString()+ '}';
    }

    @Override
    public void seDeplacer() {
        marcher();//To change body of generated methods, choose Tools | Templates.
    }
    
    
}



