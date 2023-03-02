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
public class Conversiones {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String texto=lector.nextLine(),
                inicio, fin;
        // 0 1 2 3 4  5 6
        //"H o l a     a   todos"
        inicio=texto.substring(0, 5);
        fin=texto.substring(5);
        
        System.out.println("-"+ inicio +"-");
        System.out.println("-"+ fin +"-");
        
        char caracter=inicio.charAt(0);
         //Está en el rango de minúscula
        if(caracter>=97 && caracter<=122){
            //Convertir a mayúscula
            caracter-=32;
        }
        
        texto=caracter+"";
        
        caracter=inicio.charAt(1);
        //Está en el rango de mayúscula
        if(caracter>=65 && caracter<=90){
            //Convertir a minúscula
            caracter+=32;
        }
        texto=caracter+"";
        
        caracter=inicio.charAt(2);
         //Está en el rango de minúscula
        if(caracter>=97 && caracter<=122){
            //Convertir a mayúscula
            caracter-=32;
        }
        
        texto=caracter+"";
        
        caracter=inicio.charAt(3);
        //Está en el rango de mayúscula
        if(caracter>=65 && caracter<=90){
            //Convertir a minúscula
            caracter+=32;
        }
        texto=caracter+"";
        
        caracter=inicio.charAt(4);
         //Está en el rango de minúscula
        if(caracter>=97 && caracter<=122){
            //Convertir a mayúscula
            caracter-=32;
        }
        
        texto=caracter+fin;
        System.out.println(texto);
    }
}
