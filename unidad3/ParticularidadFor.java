/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class ParticularidadFor {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int c=lector.nextInt();
        for (int i = 1; i < c; i++) {
            if(i%2==0){
                if(i%50==0){
                    //Rompe el ciclo
                    break;
                    //System.out.println(""); //Error de compilación
                }else{
                    //Rompe una iteración
                    continue;
                    //System.out.println(""); //Error de compilación
                }
            }else{
                System.out.println("-"+i);
                //Rompe la ejecución del método main (del programa)
                if(i%33==0) return; 
                System.out.println("No es múltiplo de 33");
            }
            System.out.println("------------");
        }
        System.out.println("Terminó");
    }
}
