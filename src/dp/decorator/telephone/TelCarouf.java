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
public class TelCarouf implements IChargeable{

    @Override
    public void recharger(int volts) {
        System.out.println("JE recharge a "+volts);
    }
    
}
    

