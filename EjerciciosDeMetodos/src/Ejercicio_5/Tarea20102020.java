package Ejercicio_5;

/**
 *
 * @author Dany
 */
public class Tarea20102020 {

    public static void main(String[] args) {
        //constantes
        int norm = 10000;
        int suma = 4857;
        int mult = 8601;
        //variables
        double sem = 7010;
        double rnd;
        double promedio = 0;
        int cantidades[] = new int[10];
        
        System.out.printf("Sem" + "\t rnd \n");
        for (int i = 0; i < 100; i++) {
            sem = (mult * sem + suma) % norm;
            rnd = sem / norm;
            System.out.printf(String.format("%.0f", sem) + "\t" +
                    String.format("%.4f", rnd) + "\t | ");
            if (i % 5 == 0) {
                System.out.println("");
            }
            promedio += rnd;
            cantidades[0]+= contarNumero(rnd, 0.0);
            cantidades[1]+= contarNumero(rnd, 0.1);
            cantidades[2]+= contarNumero(rnd, 0.2);
            cantidades[3]+= contarNumero(rnd, 0.3);
            cantidades[4]+= contarNumero(rnd, 0.4);
            cantidades[5]+= contarNumero(rnd, 0.5);
            cantidades[6]+= contarNumero(rnd, 0.6);
            cantidades[7]+= contarNumero(rnd, 0.7);
            cantidades[8]+= contarNumero(rnd, 0.8);
            cantidades[9]+= contarNumero(rnd, 0.9);
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Promedio = " + String.format("%.4f", (promedio / 100)));
        System.out.println("");
        double inicio = 0.0;
        
        for (double cantidade : cantidades) {
            
            System.out.println(String.format("%.1f", (inicio)) + " - " + 
                    String.format("%.1f", (inicio+0.1)) + " = " + String.format("%.0f", cantidade)+"");
            inicio+=0.1;
        }
        
    }
    
    public static int contarNumero(double numero, double intervalo){
        if(numero>=intervalo && numero<=(intervalo+0.1)){
            return 1;
        }
        return 0;
    }
    
}
