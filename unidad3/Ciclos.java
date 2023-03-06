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
        for(int i=1; i<=1000000;i++){
            operacion=lector.next();
            //Convertir a mayúscula
            operacion=operacion.toUpperCase();
            if(operacion.equals("E")){
            
            }else if(operacion.equals("D")){
            
            }else{
                break;
            }
        }
        
    }
}
