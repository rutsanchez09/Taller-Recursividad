package recursividad;

import java.util.Scanner;

public class Punto2Sumatoria {

    
    public int sumar(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumar(n - 1);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 2: Sumatoria");
        System.out.print("Ingresa hasta qué número quieres sumar: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Por favor ingresa un número positivo.");
        } else {
            int resultado = sumar(n);
            System.out.println("La suma de los primeros " + n + " números es: " + resultado);
        }
    }
}