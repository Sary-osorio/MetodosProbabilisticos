package Ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Dany
 */
public class EnsayosBernoulli {

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
        int numExitos = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca la probabilidad de ocurrencia de cada ensayo: ");
            p = sc.nextDouble();
        } while (p < 0 || p > 1);
        System.out.println("Introduzca el numero de ensayos: ");
        max = sc.nextDouble();
        for (int i = 0; i < max; i++) {
            sem = (mult * sem + suma) % norm;
            rnd = sem / norm;
            if (rnd < p) {
                numExitos++;
            }
        }
        
        System.out.println("numero de exitos: " + (numExitos));
        System.out.println("numero de fracasos: " +  ((max - numExitos)));
        System.out.println("proporcion de exitos: " + proporcion(numExitos, max));
        System.out.println("proporcion de fracasos: " +  proporcion((max - numExitos), max));

    }

    public static String proporcion(double cantidad, double max){
        return String.format("%.4f", cantidad/max);
    }
    
}
