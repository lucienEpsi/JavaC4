/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diapo.observ;

import diapo.EmissionSonore;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class CanardObservable implements EmissionSonore, Observable {
    private EmissionSonore decore;
    
    private List<Observateur> observateurs = new ArrayList<>();
    
    public CanardObservable(EmissionSonore e){
        decore = e;
    }
    @Override
    public void emetUnSon() {
        decore.emetUnSon();
        notifierObservateurs();
    }

    @Override
    public void notifierObservateurs() {
        for(Observateur o : observateurs){
            o.reagir(this);
        }
    }

    @Override
    public void enregistrerObservateur(Observateur o) {
        observateurs.add(o);
    }
    
}
