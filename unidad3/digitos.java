/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppvf;
import java.util.Scanner;
/**
 *
 * @author cc1
 */
public class digitos {
    public static void main(String[] args){
    String n;
    int suma=0;
    Scanner lector=new Scanner(System.in);
    
    n=lector.nextLine();
    for(int i=0; i<n.length();i++){
        int a=n.charAt(i);
        a-=48;
        suma+=a;
        System.out.println(a);
    }
    System.out.println(suma);
    }
    
}
