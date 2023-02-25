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
public class OperadoresYControl {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("Eres mayor de edad?");
        boolean respuesta=lector.nextBoolean();
        boolean esMenor; //true en caso de que respuesta sea false y
        //false cuando respuesta sea true
        if(respuesta==true){ //Es mayor de edad
            esMenor=false;
        }else{ //Es menor de edad
            esMenor=true;
        }
        //ACLARACIÓN: Operador de comparación != diferente
        // NO ES LO MISMO QUE NEGAR UNA VARIABLE BOOLEAN
        
        esMenor = !respuesta;
        //variable = condicion?valor si condición verdadera:valor si condición verdadera;
        int x=3;
        int y;
        //ERROR DE COMPILACIÓN: no podemos colocar una asignación en una condición sin comparar
        //con otro valor
        //y             = x=3                   ? x*10:x-10;
        y = x==3? x*10:x-10;
        //INCORRECTO: se asigna siempre true a respuesta
        //esMenor = respuesta=true?false:true;
        esMenor = respuesta==true?false:true;
        esMenor = !respuesta?true:false;
        
        System.out.println(respuesta);
        //if(respuesta==true){
        if(respuesta){
            System.out.println("Tienes al menos 18 años");
        }else{
            System.out.println("Aún no cumples los 18 años");
        }
    }
}
