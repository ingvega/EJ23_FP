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
public class UsoSwitch {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int m=lector.nextInt();
//        if(m>=1 && m<=3){
//        
//        }else if(m>=4 && m<=7){}
        
        switch(m/3){
            case 0:
                System.out.println("Primer trimestre");
                break;
            case 1:
                System.out.println("Segundo trimestre");
                break;
            case 2:
                System.out.println("Tercer trimestre");
                break;
            case 3:
                System.out.println("Cuarto trimestre");
                break;
            default:
                System.out.println("Mes no aceptado");
        }
        
        
        switch(m){
            case 1:
            case 2:
            case 3:
                System.out.println("Primer trimestre");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Segundo trimestre");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Tercer trimestre");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Cuarto trimestre");
                break;
            default:
                System.out.println("Mes no aceptado");
        } 
        System.out.println("Fuera del switch");
    }
}
