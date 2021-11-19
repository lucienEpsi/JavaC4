/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.b3C4.projet1;

/**
 *
 * @author 33676
 */
public class Oiseau extends Animal {

    public void voler() {
        System.out.println("Je vole !!!");
    }

    @Override
    public String toString() {
        return "Oiseau{" + super.toString() + '}';
    }

    @Override
    public void seDeplacer() {
        voler();
    }
}
