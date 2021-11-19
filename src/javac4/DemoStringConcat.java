/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac4;

/**
 *
 * @author 33676
 */
public class DemoStringConcat {

    public static void main(String[] args) {
        DemoStringConcat d = new DemoStringConcat();
        d.concatAutreBis("Martos");
    }

    public void concatPlus(String s) {
        String resultat = "";
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            resultat = resultat + s;
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - debut);

    }
    
public void concatAutre(String s) {
        String resultat = "";
        StringBuffer sb = new StringBuffer();
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append(s);
        }
        resultat = sb.toString();
        long fin = System.currentTimeMillis();
        System.out.println(fin - debut);

    }
public void concatAutreBis(String s) {
        String resultat = "";
        StringBuilder sb = new StringBuilder();
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append(s);
        }
        resultat = sb.toString();
        long fin = System.currentTimeMillis();
        System.out.println(fin - debut);

    }
}
