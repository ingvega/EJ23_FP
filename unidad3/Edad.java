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
public class Edad {

    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("Cuantos años tienes?");
        edad = lector.nextInt();
//        boolean esMenor;
//        if(edad>=18){
//            esMenor=false;
//        }else{
//            esMenor=true;
//        }
        boolean esMenor=false;
        if(edad<18){
            esMenor=true;
        }
    }
}
