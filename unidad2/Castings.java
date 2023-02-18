/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author paveg
 */
public class Castings {
    public static void main(String[] args) {
        String nombre="Juan", apellidos="Perez";
        System.out.printf("Hola %s tus apellidos son %s",nombre,apellidos);
        System.out.println("Hola " + nombre + " tus apellidos son " + apellidos);
        //Castings o conversión entre tipos de datos
        int intX=5;
        double doubleY=7;
        float floatZ;
        //Guardar un 5 flotante 
        floatZ=5.0f;
        char charC='a';
        charC='b';
        String stringS="a";
        
        //char a String
        stringS+=charC;
        //String a char (NO ES POSIBLE)
        //Decidir qué caracter es importante para guardar en el char
        charC=stringS.charAt(0); //Del texto el primer caracter guardalo 
        //en charC
        //int a String
        stringS=intX+"";
        stringS="45";
        intX=Integer.parseInt(stringS); //Sí se puede
        stringS="Hola";
        //intX=Integer.parseInt(stringS); //Error no se puede
        //double a String
        stringS=String.valueOf(doubleY);
        stringS="45.8";
        doubleY=Double.parseDouble(stringS);
        stringS="Hola";
        //doubleY=Double.parseDouble(stringS); //Error
        stringS="3";
        doubleY=Double.parseDouble(stringS); //guarda el 3 como decimal
        System.out.println(doubleY);
        
        
        //Conversiones explícitas
        //double a float
        floatZ=(float)doubleY;
        //double a float
        floatZ=(float)5.0;
        
        
        //double a int
        intX=(int)doubleY; //Truncar el decimal
        
        //float a int
        intX = (int)floatZ; //Truncar el decimal
        
        //int  a char 
        charC=(char) intX;
        //char a float
        //Almacena en decimal el valor entero del char
        floatZ=charC;
        floatZ=65.8f;  //A
        charC=(char)floatZ;
        System.out.println(charC);
       //Conversiones implícitas
             
        //int a double
        doubleY=intX;
        //int a float
        floatZ=intX;
        //float a double
        doubleY=floatZ;
        //char a int 
        intX=charC;
        
    }
}
