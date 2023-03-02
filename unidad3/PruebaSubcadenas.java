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
public class PruebaSubcadenas {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        //String cadenaDeTexto=lector.next(); //Lee una palabra
        String cadenaDeTexto=lector.nextLine(); //Lee una linea
        //R500
        //Los caracteres de escape como \n \t \\ solo cuentan como un 
        //caracter
        //cadenaDeTexto="d:\\ejercicio";
        System.out.println("El texto mide  "  + cadenaDeTexto.length());
        //System.out.println(cadenaDeTexto);
        String movimiento=cadenaDeTexto.charAt(0)=='D'?"Deposito":"Retiro";
        System.out.println("El movimiento es " + 
                (cadenaDeTexto.charAt(0)=='D'?"Deposito":"Retiro"));
        System.out.println("Con un monto de "  +
                cadenaDeTexto.substring(1));
        
        /*
        S
        E Electrónica
        A Ambiental
        M Gastronomía 
        G Gestión
        D Industrial
        T Sist. Auto.
        C Cambio de carrera
        */
    }
}
