/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

/**
 *
 * @author paveg
 */
import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {
        /*Entrada             Salida
        
       3                             *
                                    ***
                                  *****
        4
        5                           *
                                   ***
                                 *****
                               *******
                              ********
        S
         */
        Scanner leer = new Scanner(System.in);
        String t = leer.next();
        while (t.equalsIgnoreCase("s") == false) {
            int t1 = Integer.parseInt(t);
            if (t1 % 2 != 0) {
                int e = 0, x = 2*t1-1;
                for (int i = 0; i < t1; i++) {
                    for (int j = 0; j < e; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < x; j++) {
                        System.out.print("x");
                    }
                    System.out.print("\n");
                    e++;
                    x -= 2;
                }
            }
            t = leer.next();
        }

    }
}
