/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp;
//Carga solo la clase Scanner
import java.util.Scanner;
//Carga en memoria todo lo que hay en util
//import java.util.*;
/**
 *
 * @author paveg
 */
public class Convertir24a12 {
    public static void main(String[] args){
        /*Leer una hora con minutos y segundos en formato
        de 24 hrs y comvertirla a formato de 12 hrs
        */
        //08:34:30
        int horas,minutos,segundos;
        
        Scanner lector=new Scanner(System.in);
        String v=lector.next();
        lector=new Scanner(v);
        
//        horas=lector.nextInt();
//        minutos=lector.nextInt();
//        segundos=lector.nextInt();
        
        //String valor=lector.next("\\d:\\d:\\d"); //\d
        String valor=lector.next("[0-9]:"); //\d
        System.out.println(valor);
        
         
    }
}
