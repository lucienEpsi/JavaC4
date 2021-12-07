/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator.telephone;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        Chargeur monChargeurCarrouf = new Chargeur();
        TelCarouf t = new TelCarouf();
        
        monChargeurCarrouf.brancherPortable(t);
        
        PortableSonneEricSonne erick = new PortableSonneEricSonne();
        IChargeable monAdapSonne = new AdaptateurSonneErikSonne(erick);
        monChargeurCarrouf.brancherPortable(monAdapSonne);
        PortableSamSaoule sam = new PortableSamSaoule();
        IChargeable samAdadte = new AdaptateurSamSaoule(sam);
        monChargeurCarrouf.brancherPortable(samAdadte);
    }
}
