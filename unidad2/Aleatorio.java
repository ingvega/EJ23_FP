/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Random;

/**
 *
 * @author paveg
 */
public class Aleatorio {
    public static void main(String[] args) {
        //int x=(int)Math.random();//Siempre generará cero
        //Siempre generará valores entre 0 y 99
        int x=(int)(Math.random()*100);
        //Siempre generará valores decimales entre 1 y 100
        double y=(Math.random()*100+1);
        
        System.out.println("x " + x);
        System.out.println("y " + y);
        
        //Valores del 1 al 6
        int dado=(int)(Math.random()*6+1);
        System.out.println("Dado " + dado);
        //Valores desde el 0 hasta antes del 7 (6)
        dado=(int)(Math.random()*7);
        System.out.println("Dado " + dado);
        
        Random generador=new Random();
        //Generar un número para verificar si es o no ganador
        //Solo los números múltiplos de 7 y 11 se ganan 1000
        //entre 1 y 100
        //Solo los números múltiplos de 3 y 4 se ganan 50
        
        //Solo los números múltiplos de 2 y 9 se ganan 10
                
                
                
                
                
                
                
                
                
                
                
                
        
        
    }
}
