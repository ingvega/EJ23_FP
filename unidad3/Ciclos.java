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
public class Ciclos {
    public static void main(String[] args) {
        /*
        Se desea que puedas realizar un programa que permita realizar
        la encriptación y desencriptación de una cadena por corrimiento
        de caracteres, el usuario indicará si desea encriptar (E) o 
        Desencriptar con una D ambas opciones seguidas de una cadena
        Cuando el usuario ya no quiera realizar ninguna operación ingresará
        cualquier caracter diferente de E o D
        Entrada
        E Hola Lt
        D Hola 
        E Ejemplo
        E Prueba
        X
        
        Entrada
        M
        
        */
        String operacion;
        String cadena;
        Scanner lector=new Scanner(System.in);
        //Repetir un millon de veces o hasta que ingrese algo distinto a E o D
        //for(int i=1; i<=1000000;i++){
        //Repetición infinita hasta que se ingrese algo distinto a E o D
        for(; ;){
            operacion=lector.next();
            //Convertir a mayúscula
            operacion=operacion.toUpperCase();
            if(operacion.equals("E")){
                cadena= lector.next();
                for(int j=0; j<cadena.length(); j++){
                    char p= cadena.charAt(j);
                    p+=5;
                    System.out.print(p);
                    break;
                }
            }else if(operacion.equals("D")){
                cadena= lector.next();
                    for(int j=0; j<cadena.length(); j++){
                        char p= cadena.charAt(j);
                        p-=5;
                        System.out.print(p);
                    }
            }else{
                break;
            }
            System.out.println();
        }
        
    }
}
