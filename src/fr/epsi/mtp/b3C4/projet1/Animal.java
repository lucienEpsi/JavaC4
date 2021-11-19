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
public abstract class Animal {
    private Color couleur;
    private String sexe;
    private boolean appetit;

    public Animal(Color couleur, String sexe) {
        this.couleur = couleur;
        this.sexe = sexe;
    }

    public Animal() {
    }
    
    
    public abstract void seDeplacer();
    
    public void dormir(){
        System.out.println("Je dors je suis en cours");
    }
    
    public void manger(){
       if(appetit){
           System.out.println("Je mange");
       }
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public boolean isAppetit() {
        return appetit;
    }

    public void setAppetit(boolean appetit) {
        this.appetit = appetit;
    }

    @Override
    public String toString() {
        return "Animal{" + "couleur=" + couleur + ", sexe=" + sexe + '}';
    }
    
    
}
