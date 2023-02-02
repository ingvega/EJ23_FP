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
        
        
        Scanner lector=new Scanner(System.in);
        String valor=lector.next(); //\d
        //Obtiene el primer valor del texto despues de dividirlo por los :
        String strHoras=valor.split(":")[0]; 
        //Obtiene el segundo valor del texto despues de dividirlo por los :
        String strMinutos=valor.split(":")[1]; 
        //Obtiene el segundo valor del texto despues de dividirlo por los :
        String strSegundos=valor.split(":")[2]; 
        int horas,minutos,segundos;
        horas=Integer.parseInt(strHoras);
        minutos=Integer.parseInt(strMinutos);
        segundos=Integer.parseInt(strSegundos);
        
        valor=lector.next(); //\d
        //Obtiene el primer valor del texto despues de dividirlo por los :
        strHoras=valor.split(":")[0]; 
        //Obtiene el segundo valor del texto despues de dividirlo por los :
        strMinutos=valor.split(":")[1]; 
        //Obtiene el segundo valor del texto despues de dividirlo por los :
        strSegundos=valor.split(":")[2]; 
        int horasB,minutosB,segundosB;
        horasB=Integer.parseInt(strHoras);
        minutosB=Integer.parseInt(strMinutos);
        segundosB=Integer.parseInt(strSegundos);
        int horasF,minutosF,segundosF;
        if(segundos<=segundosB){
            segundosF=segundosB-segundos;  //10 22->12
        }else{
            segundosF=60-segundos  + segundosB;  //56 22-> 60-56+22->26
            minutosB-=1;
        }
        if(minutos<=minutosB){
            minutosF=minutosB-minutos;  //10 22->12
        }else{
            minutosF=60-minutos  + minutosB;  //56 22-> 60-56+22->26
            horasB-=1;
        }
        if(horas<=horasB){
            horasF=horasB-horas;  //10 22->12
        }else{
            horasF=24-horas  + horasB;  //56 22-> 60-56+22->26
        }
        System.out.println(horasF+":"+minutosF+":"+segundosF);
         
    }
}
