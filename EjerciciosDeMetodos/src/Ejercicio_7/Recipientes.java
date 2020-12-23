/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dany
 */
public class Recipientes {

    
    public static void main(String[] args) {
        //constantes
        int norm = 1024;
        int suma = 775;
        int mult = 533;
        //variables
        double sem = 667;
        double rnd;
        double max = 0;
        double p = 0;
        ArrayList rec1= new ArrayList();
        ArrayList rec2= new ArrayList();
        ArrayList rec3= new ArrayList();
        Scanner reader= new Scanner(System.in);
        String tst;
        
        do{
            System.out.println("Introduzca el numero de ensayos :");
            tst = reader.nextLine();
            if(isNumeric(tst)){
               max = Integer.parseInt(tst);
            if(Integer.parseInt(tst)<=0){
                System.out.println("El numero de ensayos debe ser mayor a 0 ");
            }else if(Integer.parseInt(tst) >= norm){
                System.out.println("El numero de ensayos debe ser menor que "+norm);
            }
            }else{
                System.out.println("El dato insertado no es un numero");
            }
        }while(!isNumeric(tst) || Integer.parseInt(tst) <= 0|| Integer.parseInt(tst) >= norm);
        
        
    }
     private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;       
	}
}
    
}
