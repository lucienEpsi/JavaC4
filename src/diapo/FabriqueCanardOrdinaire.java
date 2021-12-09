/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diapo;

/**
 *
 * @author 33676
 */
public class FabriqueCanardOrdinaire implements FabriqueAbstraiteCanard{

    @Override
    public EmissionSonore creerColvert() {
        return new Colvert();
    }

    @Override
    public EmissionSonore creerMorillon() {
        return new Morillon();
    }
    
}
