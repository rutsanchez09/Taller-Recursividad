package recursividad;
import java.util.Scanner;

public class Punto1Factorial {

    
    public int calcular(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso Base
        } else {
            return n * calcular(n - 1); // Caso Recursivo
        }
    }

    
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 1: Factorial");
        System.out.print("Ingresa un número entero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: No existe factorial de números negativos.");
        } else {
            System.out.println("El factorial de " + n + " es: " + calcular(n));
        }
        
    }
}