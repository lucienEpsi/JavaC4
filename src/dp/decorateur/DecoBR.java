/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorateur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author 33676
 */
public class DecoBR extends BufferedReader {
    
    public DecoBR(Reader in) {
        super(in);
    }
    
    
    @Override
    public String readLine() throws IOException{
        String retour = super.readLine();
        
        
        return retour.toUpperCase();
    }
    
}
