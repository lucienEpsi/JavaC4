/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorateur;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author 33676
 */
public class MainFichier {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("C:\\Users\\33676\\Documents\\cours\\java base\\DPCodeIdee\\DesignPattern\\src\\adaptateur\\Main.java");
        BufferedReader br = new DecoBR(r);
        while(br.ready()){
            System.out.println(br.readLine());
        }
        
        br.close();
    }
}
