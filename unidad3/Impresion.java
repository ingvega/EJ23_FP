/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppvf;

import java.util.Scanner;

/**
 *
 * @author cc1
 */
public class Impresion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, a;
        n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            a = leer.nextInt();
            String x = "";
            for (int k = 1; k <= a; k++) {
                x += "x";
                System.out.println(x);

            }
            //Ya se imprimió el triángulo con la cúspide
            /*4
            x
            xx
            xxx
            xxxx->
            
             */
            //Imprimir las siguientes líneas
////            for (int j = 1; j <= a - 1; j++) {
////                for (int k = a -j; k >= 1; k--) {
////                    System.out.print("x");
//////                for(int j=1;j<=k;j++){
//////                    System.out.print("x");
//////                }
//////                System.out.println();
////                }
            //}
            for (int j = 1; j <= a - 1; j++) {
                //Quitar una x a la cadena
                x = x.substring(1);
                //x=x.substring(0,x.length()-1);
                System.out.println(x);
            }

        }
        /*
        3
        3
        4
        1
        x
        xx
        xxx
        xx
        x
        x
        xx
        xxx
        xxxx
        xxx
        xx
        x
        x*/
    }
}
