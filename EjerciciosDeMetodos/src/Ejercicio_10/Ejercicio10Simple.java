/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Dany
 * 10: Simulando una Variable Aleatoria Binomial. Las variables de entrada son MAX, N, P, donde
MAX simula muchos experimentos; cada procedimiento consiste de N ensayos Bernoulli con probabilidad
P de éxito y de la determinación del número de éxitos en los N ensayos.
 */
public class Ejercicio10Simple {
 
    public static int norm=1024;
    public static int suma=993;
    public static int mult=801;
    public static int sem=835;
    public static double rnd;
    public static int max;
    public static int n;
    public static float p=0;
    public static float q;
    public static double i;
    public static double[] po={};
    public static double[] poSuma={};
    public static Scanner reader = new Scanner(System.in);
    public static String tst;
    
    public static void main(String[] args) {
        System.out.println("Introduzca el numero de ensayos");
        max=reader.nextInt();
        System.out.println("Introduzca el tamaño de los grupos");
        n=reader.nextInt();
        System.out.println("Introduzca la probabilidad P");
        p=reader.nextFloat();
        q=1-p;
        po[0]=pow(q,n);System.out.println("p= "+p);
        for (int i = 1; i < n; i++) {
            po[i]=((n-i+1)/i)*(p/q)*po[i-1];
            poSuma[0]=po[0];
            for (int j = 1; j < n; j++) {
                poSuma[j]= poSuma[j-1]+po[j];
                sem=0;
                for (int k = 1; k < max; k++) {
                    sem=(mult*sem+suma)%norm;
                    rnd=sem/norm;
                    i=0;
                    while(rnd>=poSuma[i]){
                    i=i+1;
                    }
                    System.out.println("i= "+i);
                }
            }
        }
    }
    
}
